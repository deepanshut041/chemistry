import { NgModule } from '@angular/core';

import { MainComponent } from './main.component';
import {CommonModule} from "@angular/common";
import {RouterModule} from "@angular/router";
import {HomeComponent} from "./home/home.component";
import {NavbarComponent} from "./navbar/navbar.component";
import {FooterComponent} from "./footer/footer.component";
import { MDBBootstrapModule } from 'angular-bootstrap-md';

@NgModule({
  declarations: [
    MainComponent, HomeComponent, NavbarComponent, FooterComponent
  ],
  imports: [
    CommonModule, RouterModule, MDBBootstrapModule
  ],
  providers: []
})
export class MainModule { }
