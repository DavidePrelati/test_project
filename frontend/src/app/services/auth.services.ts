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

  saveSession(data: any) {
    localStorage.setItem('token', data.token);
    localStorage.setItem('nome', data.nome);
    localStorage.setItem('ruolo', data.ruolo);
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
