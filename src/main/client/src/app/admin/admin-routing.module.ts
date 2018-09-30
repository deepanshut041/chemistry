import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {AdminComponent} from "./admin/admin.component";
import {DashboardComponent} from "./dashboard/dashboard.component";
import {BlogComponent} from "./blog/blog.component";
import {CourseComponent} from "./course/course.component";
import {ExamComponent} from "./exam/exam.component";
import {ModuleComponent} from "./module/module.component";
import {AddBlogComponent} from "./blog/add-blog/add-blog.component";
import {ListBlogComponent} from "./blog/list-blog/list-blog.component";
import {AddCourseComponent} from "./course/add-course/add-course.component";
import {ListCourseComponent} from "./course/list-course/list-course.component";
import {AddModuleComponent} from "./module/add-module/add-module.component";
import {ListModuleComponent} from "./module/list-module/list-module.component";
import {StepComponent} from "./step/step.component";
import {AddStepComponent} from "./step/add-step/add-step.component";
import {ListStepComponent} from "./step/list-step/list-step.component";
import {AddExamComponent} from "./exam/add-exam/add-exam.component";
import {ListExamComponent} from "./exam/list-exam/list-exam.component";


const routes:Routes =[
  {path:'', component: AdminComponent, children:[
      {path:'', component: DashboardComponent},
      {path:'blogs', component: BlogComponent, children:[
          {path:'add', component: AddBlogComponent},
          {path:'', component:ListBlogComponent},
          {path:'edit/:id', component: AddBlogComponent}
        ]},
      {path:'courses', component: CourseComponent, children:[
          {path:'add', component: AddCourseComponent},
          {path:'list', component:ListCourseComponent},
          {path:':id/edit', component: AddCourseComponent},
          {path:':id/modules', component: ModuleComponent, children:[
              {path:'add', component: AddModuleComponent},
              {path:'list', component:ListModuleComponent},
              {path:':id/edit', component: AddModuleComponent},
              {path:':id/steps', component: StepComponent, children:[
                  {path:'add', component: AddStepComponent},
                  {path:'list', component: ListStepComponent},
                  {path:':id/edit', component: AddStepComponent},
                ]}
            ]}
        ]},
      {path:'exam', component: ExamComponent, children:[
          {path:'add', component: AddExamComponent},
          {path:'list', component:ListExamComponent},
          {path:':id/edit', component: AddExamComponent}
        ]}
    ]}
];

@NgModule({
  imports:[RouterModule.forChild(routes)],
  exports:[RouterModule]
})

export class AdminRoutingModule{

}
