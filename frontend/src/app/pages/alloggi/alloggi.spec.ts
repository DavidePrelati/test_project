import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Alloggi } from './alloggi';

describe('Alloggi', () => {
  let component: Alloggi;
  let fixture: ComponentFixture<Alloggi>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Alloggi]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Alloggi);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
