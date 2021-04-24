import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Help} from './dto/help';

@Injectable({
  providedIn: 'root'
})
export class TakeHelpServiceService {

  private urlForHelp = "/takehelp/gethelp";

  constructor(private http:HttpClient) { }
  
  getHelp(help:Help):Observable<Help[]>{
  const headers = { 'content-type': 'application/json'};  
    return this.http.post<Help[]>(this.urlForHelp,help,{'headers':headers});
  }
}
