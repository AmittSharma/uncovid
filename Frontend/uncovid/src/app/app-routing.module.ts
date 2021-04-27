import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HeaderModule} from './header/header.module'
import {HomeModule} from './home/home.module'

const routes: Routes = [
  {
    path: 'header',
    loadChildren: () => import('./header/header.module').then(m => m.HeaderModule)
  },
  {
    path: '',
    loadChildren: () => import('./home/home.module').then(m => m.HomeModule)
  },
  {
    path:'give-help',
    loadChildren:()=>import('./give-help/give-help.module').then(m=>m.GiveHelpModule)
  },
  {
    path:'take-help',
    loadChildren:()=>import('./take-help/take-help.module').then(m=>m.TakeHelpModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
