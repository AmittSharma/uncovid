import { OtherHelps } from './../dto/other-helps';
import { HomeService } from './../home.service';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  
  displayedColumns: string[] = ['description', 'url'];
  dataSource:any;
  @ViewChild(MatPaginator) paginator: MatPaginator;

  constructor(private homeService:HomeService) { 

  }

  ngOnInit(): void {
    this.homeService.getOtherHelpers().subscribe((data)=>{
      this.dataSource = data;
    });
  }
  
  // filterData(val){
  //   console.log(val.target.value);
  //   console.log(this.dataSource);
  //   this.dataSource.filter = val.target.value;
  // }

  openUrl(val){
    window.open(val,"_blank");
  }

  


}
