import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GiveHelpRoutingModule } from './give-help-routing.module';
import { GiveHelpComponent } from './give-help/give-help.component';


@NgModule({
  declarations: [
    GiveHelpComponent
  ],
  imports: [
    CommonModule,
    GiveHelpRoutingModule
  ],
  exports:[
    GiveHelpComponent
  ]

})
export class GiveHelpModule { }
