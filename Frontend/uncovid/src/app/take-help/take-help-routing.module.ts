import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TakeHelpComponent } from './take-help/take-help.component';

const routes: Routes = [
  {path: '', component: TakeHelpComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TakeHelpRoutingModule { }
