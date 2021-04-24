import { OtherHelps } from './../dto/other-helps';
import { HomeService } from './../home.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  
  displayedColumns: string[] = ['description', 'url'];
  dataSource:OtherHelps[];
  
  constructor(private homeService:HomeService) { 

  }

  ngOnInit(): void {
    this.homeService.getOtherHelpers().subscribe((data)=>{
      this.dataSource = data;
    });
  }
  
  filterData(val){
    this.dataSource.filter = val.target.value;
  }
  


}
