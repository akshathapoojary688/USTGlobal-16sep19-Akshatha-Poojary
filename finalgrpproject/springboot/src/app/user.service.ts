import { Injectable } from '@angular/core';

import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  register(user): Observable<any> {
    return this.http.post('http://localhost:8080/register', user);
  }

  login(user): Observable<any> {
    return this.http.post(`http://localhost:8080/login`, user);
  }

  compose(mail): Observable<any> {
    return this.http.post('http://localhost:8080/')
  }

}
