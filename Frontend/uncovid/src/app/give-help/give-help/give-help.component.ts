import { Component, OnInit } from '@angular/core';
import { Help } from '../dto/help';
import { GiveHelpServiceService } from '../give-help-service.service';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import { State } from '../dto/state';
import { District } from '../dto/district';
import { Category } from '../dto/category';



@Component({
  selector: 'app-give-help',
  templateUrl: './give-help.component.html',
  styleUrls: ['./give-help.component.css']
})
export class GiveHelpComponent implements OnInit {

  help : Help;
  states : State[];
  districts :District[];
  categories :Category[];

  giveHelpForm : FormGroup;

  constructor(private giveHelpService :GiveHelpServiceService) { }

  ngOnInit(): void {
    this.giveHelpForm= new FormGroup({
    stateId : new FormControl('',[Validators.required]),
    districtId : new FormControl('',[Validators.required]),
    categoryId : new FormControl('',[Validators.required]),
    description : new FormControl('',[Validators.required]),
    paidOrFree : new FormControl('',[Validators.required]),
    contactNumber : new FormControl('',[Validators.required]),
    contactPersonName : new FormControl('',[]),
    });
    this.getState();
    this.getCategory();
  }

  saveinfo(){
    this.help = this.giveHelpForm.value;
    this.giveHelpService.saveinfo(this.help);
  }

  getDistrict(state:String){
    this.giveHelpService.getDistrict(state).subscribe((data:District[])=>{
      this.districts = data;
    });
  }

  getCategory(){
    this.giveHelpService.getCategory().subscribe((data:Category[])=>{
      this.categories = data;
    });
  }

  getState(){
    this.giveHelpService.getState().subscribe((data:State[])=>{
      this.states = data;
    });
  }

}
