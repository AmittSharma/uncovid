import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GiveHelpModule } from './give-help/give-help.module';
import { HeaderModule } from './header/header.module';
import { HeaderComponent } from './header/header/header.component';
import { HomeModule } from './home/home.module';
import { HomeComponent } from './home/home/home.component';
import { TakeHelpModule } from './take-help/take-help.module';
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HeaderModule,
    HomeModule,
    GiveHelpModule,
    TakeHelpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
