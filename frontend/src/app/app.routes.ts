import { Routes } from '@angular/router';
import { provideRouter, withEnabledBlockingInitialNavigation } from '@angular/router';
import { AlloggiComponent } from './pages/alloggi/alloggi.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { authGuard } from './guards/auth.guard';
import { PrenotazioniComponent } from './pages/prenotazioni/prenotazioni.component';

export const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'alloggi', component: AlloggiComponent, canActivate: [authGuard] },
  { path: 'prenotazioni/:id', component: PrenotazioniComponent },
  { path: '**', redirectTo: 'login' }
];

export const appRoutes = provideRouter(routes, withEnabledBlockingInitialNavigation());
