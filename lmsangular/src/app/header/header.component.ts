import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router, private auth: ServiceService) { }

get isLibrarianLogin() {
  return this.auth.isLibrarian();
}

get isStudentLogin() {
  return this.auth.isStudent();
}

  ngOnInit() {
  }

}
