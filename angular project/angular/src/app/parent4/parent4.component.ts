import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent4',
  templateUrl: './parent4.component.html',
  styleUrls: ['./parent4.component.css']
})
export class Parent4Component implements OnInit {
  selectedMovie;
  Movies = [
    {
      imgUrl : 'https://tse4.mm.bing.net/th?id=OIP.blverIh7XMBbvrx1GCVBtQHaEK&pid=Api&P=0&w=268&h=152',
      name : 'avengers'
    },
    {
      imgUrl : 'https://tse1.mm.bing.net/th?id=OIP.mYtQR_JD3NcIC73fIX6u3wHaLQ&pid=Api&P=0&w=300&h=300',
      name :  'spiderman'
    },
    {
      imgUrl : 'https://tse3.mm.bing.net/th?id=OIP.WRiN726TrdMS7O2krCqQHwHaHa&pid=Api&P=0&w=300&h=300',
      name : 'gravity'
    },
    {
      imgUrl : 'https://tse3.mm.bing.net/th?id=OIP.dszRvqcJxytRZYEsijEbwQHaEK&pid=Api&P=0&w=325&h=184',
      name : 'harry potter'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie) {
    console.log(movie);
    this.selectedMovie = movie;
  }


}
