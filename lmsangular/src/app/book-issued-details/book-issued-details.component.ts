import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-book-issued-details',
  templateUrl: './book-issued-details.component.html',
  styleUrls: ['./book-issued-details.component.css']
})


export class BookIssuedDetailsComponent implements OnInit {

  error: string;
  constructor(private auth: ServiceService) { }

  issuebook(form: NgForm) {
    this.error = null;
    this.auth.issueBook(form.value).
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
