import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name:string ='aksh';
  imgUrl : string = 'https://cdn.pixabay.com/photo/2019/09/26/03/09/flower-4504952__340.jpg';
  address : string = 'rajajingar, juganahalli';

  //style
  colorName : string = 'black';
  //class
  isActive : boolean = false;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      // style binding changing color only to text
      this.colorName = 'orange';
      // class binding changing background
      this.isActive = !this.isActive;
    }, 2000);
  }

}
