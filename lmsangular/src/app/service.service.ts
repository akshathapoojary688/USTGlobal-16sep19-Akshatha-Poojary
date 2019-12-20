import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  deleteUser(value: any) {
    throw new Error("Method not implemented.");
  }

  constructor(private http: HttpClient ) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/lms/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post(`http://localhost:8080/lms/login/${user.username}/${user.password}`, user);
  }
  addBook(user): Observable<any> {
    return this.http.post('http://localhost:8080/lms/add', user);
  }

  deleteBook(books): Observable<any> {
    return this.http.delete(`http://localhost:8080/lms/delete/${books.bid}`, books);
  }

  searchBook(books): Observable<any> {
    return this.http.get(`http://localhost:8080/lms/search/${books.bid}`, books);
  }


  requestBook(user): Observable<any> {
    return this.http.post('http://localhost:8080/lms/request', user);
  }
  issueBook(user): Observable<any> {
    return this.http.post('http://localhost:8080/lms/issuebooks', user);
  }
  viewAllBook(): Observable<any> {
    return this.http.get('http://localhost:8080/lms/view-all');
  }

  isStudentLogin = false;
  isLibrarianLogin = false;
  home = true;

  isLibrarian() {
    if (this.isLibrarianLogin) {
      return true;
    } else {
      return false;
    }
  }

isStudent() {
  if (this.isStudentLogin) {
    return true;
  } else {
    return false;
  }
}

}

