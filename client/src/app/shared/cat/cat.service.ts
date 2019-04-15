import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CatService {

  constructor(private https: HttpClient) { }

  getAll(): Observable<any> {
    return this.https.get('//localhost:8080/index');
  }
}
