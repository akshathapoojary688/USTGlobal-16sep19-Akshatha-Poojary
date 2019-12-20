import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AddBookComponent } from './add-book/add-book.component';
import { RemoveBookComponent } from './remove-book/remove-book.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { RequestedBookComponent } from './requested-book/requested-book.component';
import { BookIssuedDetailsComponent } from './book-issued-details/book-issued-details.component';
import { HomeComponent } from './home/home.component';
import { ViewBooksComponent } from './view-books/view-books.component';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    AddBookComponent,
    RemoveBookComponent,
    SearchBookComponent,
    RequestedBookComponent,
    BookIssuedDetailsComponent,
    HomeComponent,
    ViewBooksComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '' , component : HeaderComponent},
      {path: 'register' , component: RegisterComponent },
      {path: 'login' , component : LoginComponent},
      {path: 'add-book', component: AddBookComponent},
      {path: 'remove-book', component: RemoveBookComponent},
      {path: 'search-book', component: SearchBookComponent},
      {path: 'request-book', component: RequestedBookComponent},
      {path: 'issue-book', component: BookIssuedDetailsComponent},
      {path: 'home', component: HomeComponent},
      {path: 'viewAllBook', component: ViewBooksComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
