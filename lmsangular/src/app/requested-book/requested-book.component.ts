import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-requested-book',
  templateUrl: './requested-book.component.html',
  styleUrls: ['./requested-book.component.css']
})
export class RequestedBookComponent implements OnInit {

  error :string;
  
  constructor(private auth: ServiceService) { }

  requestbook(form: NgForm) {
    this.error = null;
    this.auth.requestBook(form.value).
    subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
}

  ngOnInit() {

    
  }

}
