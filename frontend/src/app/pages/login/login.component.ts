import { Component, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule], // 👈 QUESTO È OBBLIGATORIO
  templateUrl: './login.html'
})
export class LoginComponent {

  email = signal<string>('');
  password = signal<string>('');
  errorMessage = signal<string>('');

  onLogin() {
    console.log(this.email(), this.password());
  }
}
