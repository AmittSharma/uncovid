import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Help} from './dto/help';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GiveHelpServiceService {
  private urlForHelp = "/help-0.0.1-SNAPSHOT/help/givehelp";
  private urlForCategory = "/help-0.0.1-SNAPSHOT/help/listOfCategories";
  private urlForState = "/help-0.0.1-SNAPSHOT/help/listOfStates";
  private urlForDistrict = "/help-0.0.1-SNAPSHOT/help/listOfDistricts/1001";

  constructor(private http: HttpClient) { }

  saveinfo(help:Help){
    this.http.post(this.urlForHelp, help);
  }

  getDistrict():Observable<any>{
    return this.http.get<any>(this.urlForDistrict);
  }

  getCategory():Observable<any>{
    return this.http.get<any>(this.urlForCategory);
  }

  getState():Observable<any>{
    return this.http.get<any>(this.urlForState);
  }
  
}
