import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';

import { Parent3Component } from './parent3/parent3.component';
import { Child3Component } from './child3/child3.component';
import { Parent1Component } from './parent1/parent1.component';
import { Child1Component } from './child1/child1.component';
import { Parent2Component } from './parent2/parent2.component';
import { Child2Component } from './child2/child2.component';
import { Parent4Component } from './parent4/parent4.component';
import { Child4Component } from './child4/child4.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    
    Parent3Component,
    Child3Component,
    Parent1Component,
    Child1Component,
    Parent2Component,
    Child2Component,
    Parent4Component,
    Child4Component,
    
  
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : 'home', component: HomeComponent},
      {path : 'parent1', component : Parent1Component},
      {path : 'parent2', component : Parent2Component},
      {path : 'parent3', component : Parent3Component},
      {path : 'parent4', component : Parent4Component}
      /*  */]

    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
