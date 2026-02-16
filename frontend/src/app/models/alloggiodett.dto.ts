import { AlloggioDTO } from "./alloggio.dto";

export interface AlloggioDettaglioDTO extends AlloggioDTO{
  idalloggio: number;
  titolo: string;
  descrizione: string;
  indirizzoCompleto: string;
  immagini: string[];
  prezzo: number;
  num_ospiti: number;
  ratingMedio: number;
  nomeHost: string;
  recensioni: string[];
}
