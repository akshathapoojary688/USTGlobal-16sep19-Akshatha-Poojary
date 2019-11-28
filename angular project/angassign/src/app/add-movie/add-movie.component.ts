import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {
  
  form = new FormGroup({
    movie : new FormControl('', [Validators.required]),
    tittle : new FormControl('', [Validators.required]),
  });
  get movie() {
    return this.form.get('movie');
  }
  get tittle(){
    return this.form.get('tittle');
  }
  constructor() { }

  ngOnInit() {
  }
  logInData(form) {
    console.log(form.value);
  }
}
