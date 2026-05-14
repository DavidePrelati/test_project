import { Component, signal, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth.services';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './register.html',
  styleUrls:['./register.css']
})
export class RegisterComponent {
  // Iniezione dei servizi necessari
  private authService = inject(AuthService);
  private router = inject(Router);

  nome = signal<string>('');
  cognome = signal<string>('');
  utentecol = signal<string>('');
  email = signal<string>('');
  password = signal<string>('');
  errorMessage = signal<string>('');
  
  onRegister() {
    this.authService.register({
      nome: this.nome(),
      cognome: this.cognome(),
      utentecol: this.utentecol(),
      email: this.email(),
      password: this.password()
    }).subscribe({
      next: () => {
        console.log("Registrazione ok");
        this.router.navigate(['/login']);
      },
      error: (err) => {
        console.error(err);
        this.errorMessage.set("Errore durante registrazione");
      }
    });
  }
  
  onLogin() {
    console.log("CLICK FUNZIONA"); // test
    this.router.navigate(['/login']);
  }
}