import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Help} from './dto/help';

@Injectable({
  providedIn: 'root'
})
export class TakeHelpServiceService {

  private urlForHelp = "";

  constructor(private http:HttpClient) { }

  getHelp():Observable<Help[]>{
    return this.http.get<Help[]>(this.urlForHelp);
  }
}
