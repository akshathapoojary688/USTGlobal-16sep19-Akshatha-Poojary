import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrls: ['./parent2.component.css']
})
export class Parent2Component implements OnInit {
  selectedMobile;
  Mobiles = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/07/21/48/iphone-1032781__340.jpg',
      name : 'apple'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
      name :  'samsung'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/05/29/16/42/woman-2354157__340.jpg',
      name : 'oppo'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      name : 'vivo'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile;
  }

}
