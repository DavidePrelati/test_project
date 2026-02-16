import { Component, OnInit, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlloggioService } from '../../services/alloggio.service';
import { AlloggioDTO } from '../../models/alloggio.dto';
import * as bootstrap from 'bootstrap';
import { AlloggioDettaglioDTO } from '../../models/alloggiodett.dto';

@Component({
  selector: 'app-alloggi',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './alloggi.html',
  styleUrls: ['./alloggi.css']
})
export class AlloggiComponent implements OnInit {

  // lista alloggi
  alloggi = signal<AlloggioDTO[]>([]);

  // alloggio selezionato per il modal
  alloggioSelezionato = signal<AlloggioDettaglioDTO | null>(null);

  constructor(private alloggioService: AlloggioService) {}

  ngOnInit(): void {
    this.alloggioService.getAlloggi().subscribe({
      next: data => {
        this.alloggi.set(data);
      },
      error: err => console.error('Errore caricamento alloggi', err)
    });
  }

  // 👇 adapter: trasforma AlloggioDTO in AlloggioDettaglioDTO
  adattaAlloggio(a: AlloggioDTO): AlloggioDettaglioDTO {
    return {
      ...a, // copia tutti i campi comuni
      immagini: a.immaginePrincipale ? [a.immaginePrincipale] : [],
      nomeHost: 'Host sconosciuto', // puoi sostituire con valore reale
      recensioni: [] // array vuoto temporaneo
    };
  }

  apriDettagli(alloggio: any) {
      // 1. Debug: vediamo cosa arriva davvero dal click
      console.log("Oggetto ricevuto dal click:", alloggio);

      // 2. Cerchiamo l'ID provando tutte le varianti (CamelCase e minuscolo)
      const id = alloggio.idAlloggio || alloggio.idalloggio || alloggio.id;

      console.log("ID estratto:", id);

      if (!id) {
          console.error("ERRORE: Non riesco a trovare l'ID nell'oggetto. Controlla i nomi dei campi in console!");
          return;
      }

      // 3. Chiamata al servizio usando l'ID trovato
      this.alloggioService.getAlloggioDett(id).subscribe({
          next: (dettaglioVero) => {
              console.log("Dati ricevuti dal server:", dettaglioVero);
              
              // Salviamo i dati nel Signal
              this.alloggioSelezionato.set(dettaglioVero);

              // 4. Apriamo il modal
              const modalEl = document.getElementById('dettagliModal');
              if (modalEl) {
                  const modal = new bootstrap.Modal(modalEl);
                  modal.show();

                  // Inizializziamo il carosello
                  modalEl.addEventListener('shown.bs.modal', () => {
                      this.initCarosello();
                  }, { once: true });
              }
          },
          error: (err) => {
              console.error("Errore nel recupero dettagli! URL errato o server spento.", err);
          }
      });
  }
  // Spostiamo la logica del carosello in un metodo a parte per pulizia
  private initCarosello() {
    const carouselEl = document.getElementById('carouselAlloggio');
    if (carouselEl) {
      const existing = bootstrap.Carousel.getInstance(carouselEl);
      if (existing) existing.dispose();
      new bootstrap.Carousel(carouselEl, { interval: 3000, ride: 'carousel' });
    }
  }
  }


