import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AlloggioDTO } from '../models/alloggio.dto';
import { AlloggioDettaglioDTO } from '../models/alloggiodett.dto';


@Injectable({
  providedIn: 'root'
})
export class AlloggioService {
  private apiUrl = 'http://localhost:8080/alloggi';

  constructor(private http: HttpClient) {}

  getAlloggi(): Observable<AlloggioDTO[]> {
    return this.http.get<AlloggioDTO[]>(this.apiUrl);
  }
  
  getAlloggioDett(idalloggio: number): Observable<AlloggioDettaglioDTO> {
    return this.http.get<AlloggioDettaglioDTO>(`${this.apiUrl}/${idalloggio}`);
  }
}
