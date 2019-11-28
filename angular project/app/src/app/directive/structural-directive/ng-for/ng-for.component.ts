import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  Products = [
    {
      img :'https://cdn.pixabay.com/photo/2016/09/05/19/31/dessert-1647467__340.jpg',
      name:'icecream',
      price:345
    },
    {
      img :'https://cdn.pixabay.com/photo/2018/04/04/09/24/pencil-3289274__340.jpg',
      name:'lipstick',
      price:345

    },
    {
      img :'https://cdn.pixabay.com/photo/2016/11/04/15/49/cosmetic-1798154__340.jpg',
      name:'flowers',
      price:345

    }];

  constructor() { }

  ngOnInit() {
  }

}
