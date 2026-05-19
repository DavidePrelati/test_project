import { Component, signal, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth.services';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.html',
  styleUrls: ['./login.css']
})
export class LoginComponent {
  private authService = inject(AuthService);
  private router = inject(Router);

  email = signal<string>('');
  password = signal<string>('');
  errorMessage = signal<string>('');

  onLogin() {
    this.authService.login(this.email(), this.password()).subscribe({
      next: (response) => {
        // Salva la sessione tramite il tuo servizio principale
        this.authService.saveSession(response);

        // --- SALVATAGGIO DEL NOME ---
        if (response && response.nome) {
          localStorage.setItem('nomeUtente', response.nome);
        }
        // -----------------------------

        this.router.navigate(['/alloggi']);
      },
      error: (err) => {
        console.error('Errore durante il login', err);
        this.errorMessage.set('Email o password errati. Riprova.');
      }
    });
  }
  
  onRegister() {
    console.log("CLICK FUNZIONA");
    this.router.navigate(['/register']);
  }
}