import { ShareIconsModule } from 'ngx-sharebuttons/icons';
import { MaterialModule } from './../material/material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HeaderRoutingModule } from './header-routing.module';
import { HeaderComponent } from './header/header.component';
import { ShareModule } from 'ngx-sharebuttons';
import { ShareButtonsModule } from 'ngx-sharebuttons/buttons';


@NgModule({
  declarations: [
    HeaderComponent
  ],
  imports: [
    CommonModule,
    HeaderRoutingModule,
    MaterialModule,
    ShareModule,
    ShareButtonsModule,
    ShareIconsModule
    
  ],
  exports:[HeaderComponent]
})
export class HeaderModule { }

// npm i ngx-sharebuttons @angular/cdk
// npm i @fortawesome/fontawesome-svg-core @fortawesome/angular-fontawesome @fortawesome/free-solid-svg-icons @fortawesome/free-brands-svg-icons