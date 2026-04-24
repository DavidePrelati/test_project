import { CommonModule } from "@angular/common";
import { Component, inject, signal } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { HttpClient } from '@angular/common/http';
import { AuthService } from "../../services/auth.services";
import { ActivatedRoute, Router } from "@angular/router";


@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './prenotazioni.html'
})
export class PrenotazioniComponent {
  // Iniezione dei servizi necessari
  private authService = inject(AuthService);
  private http = inject(HttpClient);
  private route = inject(ActivatedRoute);
  private router = inject(Router);

  
  
  booking = {
    data_checkin: '',
    data_checkout: '',
    num_ospiti: 1,
    prezzo: 0,
    stato: 0,
    id_alloggio: 0,
    idutente: 0
  };

  alloggio = signal<any>(null);
  prezzoTotale = 0;
  
  
  ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');

    if (!id) return;

    this.http.get("http://localhost:8080/alloggi/" + id)
      .subscribe({
        next: (data) => {
          this.alloggio.set(data);
        },
        error: (err) => {
          console.error("Errore caricamento alloggio", err);
        }
      });
  }
  
  calcolaPrezzo() {
    if (!this.alloggio() || !this.booking.data_checkin || !this.booking.data_checkout) return;

    const inDate = new Date(this.booking.data_checkin);
    const outDate = new Date(this.booking.data_checkout);

    const giorni = Math.max(
      (outDate.getTime() - inDate.getTime()) / (1000 * 60 * 60 * 24),
      0
    );

    this.prezzoTotale = giorni * this.alloggio()?.prezzo;
  }
  
  
  prenota() {
    this.booking.id_alloggio = this.alloggio()?.idalloggio;
    this.booking.idutente = Number(localStorage.getItem("idutente"));
    this.booking.prezzo = this.prezzoTotale;

    this.http.post("http://localhost:8080/prenotazione", this.booking)
      .subscribe({
        next: () => console.log("Prenotazione OK"),
        error: (err) => console.error(err)
      });
  }
	
	
}

