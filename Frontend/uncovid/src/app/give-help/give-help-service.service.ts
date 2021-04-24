import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Help} from './dto/help';
import {Observable} from 'rxjs';
import { Category } from './dto/category';
import { State } from './dto/state';
import { District } from './dto/district';

@Injectable({
  providedIn: 'root'
})
export class GiveHelpServiceService {
  private urlForHelp = "/help-0.0.1-SNAPSHOT/help/givehelp";
  private urlForCategory = "/help-0.0.1-SNAPSHOT/help/listOfCategories";
  private urlForState = "/help-0.0.1-SNAPSHOT/help/listOfStates";
  private urlForDistrict = "/help-0.0.1-SNAPSHOT/help/listOfDistricts/";

  constructor(private http: HttpClient) { }

  saveinfo(help:Help):Observable<any>{
    const headers = { 'content-type': 'application/json'};  
    return this.http.post<any>(this.urlForHelp, help, {'headers':headers});
  }

  getDistrict(state:any):Observable<District[]>{
    return this.http.get<District[]>(this.urlForDistrict+state);
  }

  getCategory():Observable<Category[]>{
    return this.http.get<Category[]>(this.urlForCategory);
  }

  getState():Observable<State[]>{
    return this.http.get<State[]>(this.urlForState);
  }
  
}
