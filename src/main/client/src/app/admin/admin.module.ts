import { NgModule } from '@angular/core';

import { AdminComponent } from './admin.component';
import {CommonModule} from "@angular/common";
import {RouterModule} from "@angular/router";

@NgModule({
  declarations: [
    AdminComponent
  ],
  imports: [
    CommonModule, RouterModule
  ],
  providers: []
})
export class AdminModule { }
