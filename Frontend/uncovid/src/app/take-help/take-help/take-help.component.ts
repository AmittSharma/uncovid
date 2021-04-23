import { Component, OnInit, ViewChild } from '@angular/core';
import { TakeHelpServiceService } from '../take-help-service.service';
import {Help} from '../dto/help';
import { GiveHelpServiceService } from 'src/app/give-help/give-help-service.service';
import { District } from 'src/app/give-help/dto/district';
import { Category } from 'src/app/give-help/dto/category';
import { State } from 'src/app/give-help/dto/state';
import { FormControl, FormGroup } from '@angular/forms';
import {MatPaginator} from '@angular/material/paginator'; 
import { MatTableDataSource } from '@angular/material/table';
import {MatSort} from '@angular/material/sort';
@Component({
  selector: 'app-take-help',
  templateUrl: './take-help.component.html',
  styleUrls: ['./take-help.component.css']
})
export class TakeHelpComponent implements OnInit {

  helps: Help[];
  states : State[];
  districts :District[];
  categories :Category[];
  dataSource : any;
  displayedColumns: string[] = ['state', 'district', 'category', 'description', 'cost', 'name', 'number'];
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  takeHelpForm : FormGroup;

  constructor(private takeHelpService:TakeHelpServiceService, private giveHelpService :GiveHelpServiceService) { }

  ngOnInit(): void {
    this.takeHelpForm = new FormGroup({
      stateId : new FormControl('',[]),
      districtId : new FormControl('',[]),
      categoryId : new FormControl('',[])
    });
    this.getCategory();
    this.getState();
    
  }

  getHelp(){
    this.takeHelpService.getHelp().subscribe((data)=>{
      this.helps = data;
      this.dataSource =  new MatTableDataSource<Help>(this.helps);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;
    });
  }

 

  filterData(val){
    this.dataSource.filter = val.target.value;
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
