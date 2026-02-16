import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AlloggiComponent } from './pages/alloggi/alloggi.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, AlloggiComponent],
  template: `
    <app-alloggi></app-alloggi>
  `,
  styleUrls: ['./app.css']
})
export class App {
  protected readonly title = signal('frontend');
}
