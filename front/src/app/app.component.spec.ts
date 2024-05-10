import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';
import {JokesService} from "./services/jokes.service";
import {HttpClientTestingModule} from "@angular/common/http/testing";
import { of } from 'rxjs';

describe('AppComponent', () => {

  let component: AppComponent;
  let jokesService: JokesService;


  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AppComponent],
      imports: [HttpClientTestingModule],
      providers: [JokesService]
    }).compileComponents();
  });

  beforeEach(() => {
    jokesService = TestBed.inject(JokesService);
    spyOn(jokesService, 'getRandomJoke');
    const fixture = TestBed.createComponent(AppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  })

  it('should create the app', () => {
 
    expect(component).toBeTruthy();
  });

  it('should get a random joke', () => {
    component.getRandomJoke();
    expect(jokesService.getRandomJoke).toHaveBeenCalled();
    expect(component.joke$).toBeDefined();
   
  });
});
