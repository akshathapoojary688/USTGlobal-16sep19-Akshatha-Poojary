import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-compose',
  templateUrl: './compose.component.html',
  styleUrls: ['./compose.component.css']
})
export class ComposeComponent implements OnInit {

  constructor(private service: UserService) { }

  compose: FormGroup = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    subject: new FormControl('', [Validators.required, Validators.minLength(10), Validators.maxLength(20)])
  });

  get emailInput() {
    return this.compose.get('email');
  }
  get subjectInput() {
    return this.compose.get('subject');
  }

  composeMail() {
    this.service.compose(this.compose.value).subscribe(resp => {
      console.log(resp);
    });
  }

  ngOnInit() {
  }

}
