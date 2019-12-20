import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
   error: any;
  constructor(private auth: ServiceService) { }
 
  addbook(form: NgForm) {
    this.error = null;
    this.auth.addBook(form.value).
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
