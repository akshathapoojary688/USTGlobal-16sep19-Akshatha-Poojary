import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-books',
  templateUrl: './view-books.component.html',
  styleUrls: ['./view-books.component.css']
})
export class ViewBooksComponent implements OnInit {

  books;
  constructor(private auth: ServiceService) {
    this.viewAllBook();
  }

  ngOnInit() {
  }
  viewAllBook(){
    this.auth.viewAllBook().subscribe(data => {
      this.books = data.bookbeans;
      console.log(this.books);
    });
  }
}