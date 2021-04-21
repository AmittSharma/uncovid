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
  }

  saveinfo(){
    
  }

  getDistrict(){
    
  }

  getCategory(){
    
  }

  getState(){
    
  }

}
