import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TakeHelpRoutingModule } from './take-help-routing.module';
import { TakeHelpComponent } from './take-help/take-help.component';
import { MatCardModule} from '@angular/material/card';
import { MatButtonModule} from '@angular/material/button';
import { MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import { ReactiveFormsModule,} from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatTableModule} from '@angular/material/table';
import {MatPaginatorModule} from '@angular/material/paginator';



@NgModule({
  declarations: [
    TakeHelpComponent
  ],
  imports: [
    CommonModule,
    TakeHelpRoutingModule,
    ReactiveFormsModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatSelectModule,
    MatFormFieldModule,
    MatTableModule,
    MatPaginatorModule
  ],
  exports:[
    TakeHelpComponent
  ]
})
export class TakeHelpModule { }
