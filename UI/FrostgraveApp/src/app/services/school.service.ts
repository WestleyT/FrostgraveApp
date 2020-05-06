import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { School } from '../models/school';

@Injectable({
  providedIn: 'root'
})
export class SchoolService {
  private baseUrl: string;
  private localHost: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/schools/';
    this.localHost = 'http://localhost:8080/';
   }

   public getSchoolList(): Observable<School[]> {
     return this.http.get<School[]>(this.baseUrl);
   }
}
