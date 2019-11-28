import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent1',
  templateUrl: './parent1.component.html',
  styleUrls: ['./parent1.component.css']
})
export class Parent1Component implements OnInit {
  selectedBike;
  Bikes = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
      name : 'apachi'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg',
      name :  'vintage'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/30/04/29/australia-2187195__340.jpg',
      name : 'ktm'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'royal enfield'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    console.log(bike);
    this.selectedBike = bike;
  }

}
