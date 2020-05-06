import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Spell } from '../models/spell';

@Injectable({
  providedIn: 'root'
})
export class SpellService {
  private baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/spells/'
   }

   public getSpellsList(): Observable<Spell[]> {
     return this.http.get<Spell[]>(this.baseUrl);
   }
}
