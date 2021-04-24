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
  private urlForHelp = "/help/givehelp";
  private urlForCategory = "/help/listOfCategories";
  private urlForState = "/help/listOfStates";
  private urlForDistrict = "/help/listOfDistricts/";

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
