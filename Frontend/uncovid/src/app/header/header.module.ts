import { MaterialModule } from './../material/material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HeaderRoutingModule } from './header-routing.module';
import { HeaderComponent } from './header/header.component';
import { ShareModule } from 'ngx-sharebuttons';


@NgModule({
  declarations: [
    HeaderComponent
  ],
  imports: [
    CommonModule,
    HeaderRoutingModule,
    MaterialModule,
    ShareModule
    
  ],
  exports:[HeaderComponent]
})
export class HeaderModule { }
