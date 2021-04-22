import { Component, OnInit } from '@angular/core';
import { GiveHelpServiceService } from '../give-help-service.service';

@Component({
  selector: 'app-give-help',
  templateUrl: './give-help.component.html',
  styleUrls: ['./give-help.component.css']
})
export class GiveHelpComponent implements OnInit {

  constructor(private giveHelpService :GiveHelpServiceService) { }

  ngOnInit(): void {
    this.getState();
    this.getDistrict();
    this.getCategory();
  }

  saveinfo(){
    
  }

  getDistrict(){
    this.giveHelpService.getDistrict().subscribe((data)=>{
      console.log(data);
    });
  }

  getCategory(){
    this.giveHelpService.getCategory().subscribe((data)=>{
      console.log(data);
    });
  }

  getState(){
    this.giveHelpService.getState().subscribe((data)=>{
      console.log(data);
    });
  }

}
