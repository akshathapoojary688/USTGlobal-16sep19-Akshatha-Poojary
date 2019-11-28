import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})

 export class HomeComponent {
     news;
      constructor(private http: HttpClient) {
          this.getNews();
      }
      getNews() {
          this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=b1d121c5e9c4410a852c8cec1cedea82').subscribe(data => {
            this.news = data.articles;
          }, err => {
              console.log(err);
          }, () => {
         console.log('news got successfully');
          });
        }
    }
