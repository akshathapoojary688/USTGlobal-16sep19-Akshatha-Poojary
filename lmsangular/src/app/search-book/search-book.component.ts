import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {

  error: string;
  book: any;
  
   constructor(private auth: ServiceService) { }
books;
searchbook(form: NgForm) {
  this.error = null;
  this.auth.searchBook(form.value).
  subscribe(res => {
   this.books = res.bookbeans;
   console.log(this.books);
   form.reset();
  }, err => {
    console.log(err);
    this.error = err.error.message;
  });
}

  ngOnInit() {
  }

}
