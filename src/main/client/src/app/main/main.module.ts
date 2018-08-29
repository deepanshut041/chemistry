import { NgModule } from '@angular/core';

import { MainComponent } from './main.component';
import {CommonModule} from "@angular/common";
import {RouterModule} from "@angular/router";
import {HomeComponent} from "./home/home.component";
import {NavbarComponent} from "./navbar/navbar.component";
import {FooterComponent} from "./footer/footer.component";
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import {BlogComponent} from "./blog/blog.component";
import {BlogListComponent} from "./blog/list/blog-list.component";
import {BlogDetailComponent} from "./blog/detail/blog-detail.component";
import {CoursesComponent} from "./courses/courses.component";
import {ContactComponent} from "./contact/contact.component";
import {NotesComponent} from "./notes/notes.component";

@NgModule({
  declarations: [
    MainComponent, HomeComponent, NavbarComponent, FooterComponent, BlogComponent, BlogListComponent,
    BlogDetailComponent, CoursesComponent, ContactComponent, NotesComponent
  ],
  imports: [
    CommonModule, RouterModule, MDBBootstrapModule
  ],
  providers: []
})
export class MainModule { }
