import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SearchComponent } from './search/search.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { LoginComponent } from './login/login.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SearchComponent,
    AddMovieComponent,
    LoginComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,  
    RouterModule.forRoot([
      {path : 'navbar' , component : NavbarComponent},
      {path : 'movie' , component : SearchComponent},
      {path : 'addmovie' , component : AddMovieComponent},
      {path : 'login' , component : LoginComponent}
    ]) 

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
