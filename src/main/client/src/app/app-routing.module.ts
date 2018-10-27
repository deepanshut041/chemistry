import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import {MainComponent} from "./main/main.component";
import {HomeComponent} from "./main/home/home.component";
import {BlogComponent} from "./main/blog/blog.component";
import {BlogDetailComponent} from "./main/blog/detail/blog-detail.component";
import {BlogListComponent} from "./main/blog/list/blog-list.component";
import {ContactComponent} from "./main/contact/contact.component";
import {NotesComponent} from "./main/notes/notes.component";
import {CoursesComponent} from "./main/courses/courses.component";
import { CourseComponent } from "./main/course/course.component";


const routes:Routes =[
  {path:'admin', loadChildren:"./admin/admin.module#AdminModule"},
  {path:'user', loadChildren:"./user/user.module#UserModule"},
  {
    path: '', component: MainComponent, children:[
      {path: '', component: HomeComponent},
      {path: 'blog', component: BlogComponent, children:[
          {path: '', component: BlogListComponent},
          {path: ':id', component: BlogDetailComponent}
        ]},
      {path: 'contact', component:ContactComponent},
      {path: 'notes', component: NotesComponent},
      {path:'courses', component:CoursesComponent},
      {path:'courses/:id', component:CourseComponent}
      
    ]
  },
  // {
  //   path: 'auth', component: AuthComponent, children: [
  //     { path: 'signin', component: SigninComponent }
  //   ]
  // },
]


@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})

export class AppRoutingModule{

}
