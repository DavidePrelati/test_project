export interface AlloggioDettaglioDTO {
  idAlloggio: number;
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