import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private service: UserService, private router: Router) { }

  register: FormGroup = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(8)]),
    username: new FormControl('', [Validators.required, Validators.maxLength(10), Validators.minLength(4)])
  });

  get emailInput() {
    return this.register.get('email');
  }
  get passwordInput() {
    return this.register.get('password');
  }
  get usernameInput() {
    return this.register.get('username');
  }

  registerUser() {
    this.service.register(this.register.value).subscribe(resp => {
      console.log(resp);
      alert('Registration successfull!');
      this.register.reset();
      this.router.navigateByUrl('/home');
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
