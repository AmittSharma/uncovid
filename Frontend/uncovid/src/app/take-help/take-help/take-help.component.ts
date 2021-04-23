import { Component, OnInit } from '@angular/core';
import { TakeHelpServiceService } from '../take-help-service.service';
import {Help} from '../dto/help';

@Component({
  selector: 'app-take-help',
  templateUrl: './take-help.component.html',
  styleUrls: ['./take-help.component.css']
})
export class TakeHelpComponent implements OnInit {

  helps: Help[];

  constructor(private takeHelpService:TakeHelpServiceService) { }

  ngOnInit(): void {
    this.getHelp();
    
  }

  getHelp(){
    this.takeHelpService.getHelp().subscribe((data)=>{
      this.helps = data;
      console.log(this.helps);
    });
  }

}
