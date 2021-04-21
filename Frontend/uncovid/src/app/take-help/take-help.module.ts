import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TakeHelpRoutingModule } from './take-help-routing.module';
import { TakeHelpComponent } from './take-help/take-help.component';


@NgModule({
  declarations: [
    TakeHelpComponent
  ],
  imports: [
    CommonModule,
    TakeHelpRoutingModule
  ],
  exports:[
    TakeHelpComponent
  ]
})
export class TakeHelpModule { }
