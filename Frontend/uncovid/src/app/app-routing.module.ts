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
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
