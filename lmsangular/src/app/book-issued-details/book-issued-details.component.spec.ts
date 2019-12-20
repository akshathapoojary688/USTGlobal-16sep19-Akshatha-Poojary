import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookIssuedDetailsComponent } from './book-issued-details.component';

describe('BookIssuedDetailsComponent', () => {
  let component: BookIssuedDetailsComponent;
  let fixture: ComponentFixture<BookIssuedDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookIssuedDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookIssuedDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
