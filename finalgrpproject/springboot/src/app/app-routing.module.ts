import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './register/register.component';
import { ComposeComponent } from './compose/compose.component';


const routes: Routes = [
  {path : 'home', component : HomeComponent},
  {path : 'footer', component : FooterComponent},
  {path : 'header', component : HeaderComponent},
  {path : 'register', component : RegisterComponent},
  {path : 'compose', component : ComposeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
