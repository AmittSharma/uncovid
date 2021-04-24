import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { OtherHelps } from './dto/other-helps';

@Injectable({
  providedIn: 'root'
})
export class HomeService {
url = "takehelp/otherHelpers"
  constructor(private http:HttpClient) {

   }

 getOtherHelpers(): Observable<OtherHelps[]>{
   return this.http.get<OtherHelps[]>(this.url);
 }
}
