import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { NgswitchComponent } from './directive/structural-directive/ngswitch/ngswitch.component';
import { customDirective } from './custom.directive';
import { Form1Component } from './form1/form1.component';

import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';

import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectiveComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgswitchComponent,
    customDirective,
    RegisterComponent,
    Form1Component,

    ReactiveFormComponent,

    ParentComponent,

    ChildComponent,

    Form2Component,

    Form3Component,

    Form4Component,

CommentComponent,

    CommentDetailsComponent,

    DollarPipe,

    

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
   RouterModule.forRoot([
      {path : '', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way-binding', component : TwoWayBindingComponent},
      {path : 'ng-if', component : NgIfComponent},
      {path : 'ng-for', component : NgForComponent},
      {path : 'ng-switch', component : NgswitchComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'form1', component : Form1Component},
      {path : 'form2', component : Form2Component},
      {path : 'form3', component : Form3Component},
      {path : 'form4', component : Form4Component},
      {path : 'reactive-form', component : ReactiveFormComponent},
      {path : 'parent', component : ParentComponent},
 {path : 'comment-details', component : CommentDetailsComponent}
  ])
     ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
