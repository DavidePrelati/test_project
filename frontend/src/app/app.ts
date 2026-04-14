import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AlloggiComponent } from './pages/alloggi/alloggi.component';
// davideprelati/test_project/.../frontend/src/app/app.ts

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet], // Puoi rimuovere AlloggiComponent dagli imports se non lo usi qui
  template: `
    <router-outlet></router-outlet>
  `,
  styleUrls: ['./app.css']
})
export class App {
  protected readonly title = signal('frontend');
}