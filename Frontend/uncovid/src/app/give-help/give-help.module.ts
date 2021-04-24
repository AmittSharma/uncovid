import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GiveHelpRoutingModule } from './give-help-routing.module';
import { GiveHelpComponent } from './give-help/give-help.component';
import { MatCardModule} from '@angular/material/card';
import { MatButtonModule} from '@angular/material/button';
import { MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import { ReactiveFormsModule,} from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatCheckboxModule} from '@angular/material/checkbox';                               



@NgModule({
  declarations: [
    GiveHelpComponent
  ],
  imports: [
    CommonModule,
    GiveHelpRoutingModule,
    ReactiveFormsModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatSelectModule,
    MatFormFieldModule,
    MatCheckboxModule
  ],
  exports:[
    GiveHelpComponent
  ]

})
export class GiveHelpModule { }
