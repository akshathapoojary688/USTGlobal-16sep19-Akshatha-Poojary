import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent3',
  templateUrl: './parent3.component.html',
  styleUrls: ['./parent3.component.css']
})
export class Parent3Component implements OnInit {
  selectedLaptop;
  Laptops = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373_1280.jpg',
      name : 'lenovo'
    },
    {
      imgUrl : 'https://media-public.canva.com/MADauLV11is/1/thumbnail_large-1.jpg',
      name :  'apple'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/06/28/05/10/laptop-1483974__340.jpg',
      name : 'dell'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/blogging-336375__340.jpg',
      name : 'hp'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendLaptop(laptop) {
    console.log(laptop);
    this.selectedLaptop = laptop;
  }


}
