import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListStepComponent } from './list-step.component';

describe('ListStepComponent', () => {
  let component: ListStepComponent;
  let fixture: ComponentFixture<ListStepComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListStepComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListStepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
