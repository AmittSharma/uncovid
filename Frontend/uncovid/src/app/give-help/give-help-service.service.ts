import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Help} from './dto/help';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GiveHelpServiceService {
  private urlForHelp = "help/givehelp";
  private urlForCategory = "help/givehelp";
  private urlForState = "help/givehelp";
  private urlForDistrict = "help/givehelp";

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
