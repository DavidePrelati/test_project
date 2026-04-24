import { Component, signal, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth.services';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.html'
})
export class LoginComponent {
  // Iniezione dei servizi necessari
  private authService = inject(AuthService);
  private router = inject(Router);

  email = signal<string>('');
  password = signal<string>('');
  errorMessage = signal<string>('');

  onLogin() {
    // Chiamata al metodo login del servizio
    this.authService.login(this.email(), this.password()).subscribe({
      next: (response) => {
        // Salva i dati della sessione e naviga verso la pagina alloggi
        this.authService.saveSession(response);
        this.router.navigate(['/alloggi']);
      },
      error: (err) => {
        console.error('Errore durante il login', err);
        this.errorMessage.set('Email o password errati. Riprova.');
      }
    });
  }
  
  onRegister() {
    console.log("CLICK FUNZIONA"); // test
    this.router.navigate(['/register']);
  }
}