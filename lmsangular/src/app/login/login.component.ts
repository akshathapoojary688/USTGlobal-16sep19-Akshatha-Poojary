import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error: string;

  constructor(private auth : ServiceService, private router: Router) { }

  login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).
    subscribe(res => {
      console.log('response of login', res);
      //if (res && res.message === 'login successfull') 
       // localStorage.setItem('userDetails', JSON.stringify(res));
      if (res &&  res.role === 'librarian') {
            this.auth.isLibrarianLogin = true;
            this.router.navigateByUrl('/');
          } else if (res &&  res.role === 'student') {
            this.auth.isStudentLogin = true;
            this.router.navigateByUrl('/');
          } else {
            this.router.navigateByUrl('/register');
          }
      
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
     });
  }


ngOnInit() {
  }
  }

