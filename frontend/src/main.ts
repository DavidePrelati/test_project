import { bootstrapApplication } from '@angular/platform-browser';
import { App } from './app/app';
import { importProvidersFrom } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { appRoutes } from './app/app.routes';

bootstrapApplication(App, {
  providers: [
    importProvidersFrom(HttpClientModule), // 🔹 Import fondamentale per le chiamate HTTP
  appRoutes
	]
}).catch(err => console.error(err));
