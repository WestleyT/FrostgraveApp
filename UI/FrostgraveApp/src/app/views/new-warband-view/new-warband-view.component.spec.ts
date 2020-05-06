import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewWarbandViewComponent } from './new-warband-view.component';

describe('NewWarbandViewComponent', () => {
  let component: NewWarbandViewComponent;
  let fixture: ComponentFixture<NewWarbandViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewWarbandViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewWarbandViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
