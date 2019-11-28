import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  movieArray: any [] = []
  constructor(private http: HttpClient) { }
  searchMovies(movie){
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie}&apikey=efad1f3e`)
    .subscribe(resData =>{
      this.movieArray = resData.Search;
      console.log(this.movieArray);
    })
  }

  ngOnInit() {
  }

}
