import { Routes } from '@angular/router';
import { provideRouter, withEnabledBlockingInitialNavigation } from '@angular/router';
import { AlloggiComponent } from './pages/alloggi/alloggi.component';
import { LoginComponent } from './pages/login/login.component';
import { authGuard } from './guards/auth.guard';

export const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'alloggi', component: AlloggiComponent, canActivate: [authGuard] },
  { path: '**', redirectTo: '' } // fallback al login
];

export const appRoutes = provideRouter(routes, withEnabledBlockingInitialNavigation());
