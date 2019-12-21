import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private service: UserService) { }

  login: FormGroup = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(8)])
  });

  get emailInput() {
    return this.login.get('email');
  }
  get passwordInput() {
    return this.login.get('password');
  }

  loginUser() {
    this.service.login(this.login.value).subscribe(resp => {
      console.log(resp);
      this.login.reset();
      alert('Login successfull!');
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
