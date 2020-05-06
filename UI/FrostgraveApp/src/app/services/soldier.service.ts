import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Soldier } from '../models/soldier';

@Injectable({
  providedIn: 'root'
})
export class SoldierService {
  private baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/soldiers/';
   }

   public getSoldiersList(): Observable<Soldier[]> {
     return this.http.get<Soldier[]>(this.baseUrl);
   }
}
