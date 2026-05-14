import { Injectable, signal } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiUrl = 'http://localhost:8080/auth';
  isLogged = signal(!!localStorage.getItem('token'));

  constructor(
    private http: HttpClient,
    private router: Router
  ) {}

  login(email: string, password: string) {
    return this.http.post<any>(`${this.apiUrl}/login`, {
      email,
      password
    });
  }

  register(user: any) {
    return this.http.post('http://localhost:8080/auth/register', user);
  }
  

  
  saveSession(data: any) {
      // Salviamo il token, il nome e il ruolo (quello che già facevi)
      localStorage.setItem('token', data.token);
      localStorage.setItem('nome', data.nome);
      localStorage.setItem('ruolo', data.ruolo);
      
      // AGGIUNGI QUESTA RIGA: salva l'ID nel browser
      if (data.idutente) {
          localStorage.setItem('idutente', data.idutente.toString());
      }

      this.isLogged.set(true);
  }

  logout() {
    localStorage.clear();
    this.isLogged.set(false);
    this.router.navigate(['/']);
  }

  isAuthenticated() {
    return this.isLogged();
  }
}
