import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminComponent } from './admin/admin.component';
import {AdminRoutingModule} from "./admin-routing.module";
import { AddBlogComponent } from './blog/add-blog/add-blog.component';
import { BlogComponent } from './blog/blog.component';
import { CourseComponent } from './course/course.component';
import { AddCourseComponent } from './course/add-course/add-course.component';
import { ListBlogComponent } from './blog/list-blog/list-blog.component';
import { ListCourseComponent } from './course/list-course/list-course.component';
import { ModuleComponent } from './module/module.component';
import { StepComponent } from './step/step.component';
import { ListStepComponent } from './step/list-step/list-step.component';
import { AddStepComponent } from './step/add-step/add-step.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ExamComponent } from './exam/exam.component';
import { AddExamComponent } from './exam/add-exam/add-exam.component';
import { ListExamComponent } from './exam/list-exam/list-exam.component';
import { AddModuleComponent } from './module/add-module/add-module.component';
import { ListModuleComponent } from './module/list-module/list-module.component';


@NgModule({
  imports: [
    CommonModule, AdminRoutingModule
  ],
  declarations: [AdminComponent, AddBlogComponent, BlogComponent, CourseComponent, AddCourseComponent,
    ListBlogComponent, ListCourseComponent, ModuleComponent, StepComponent, ListStepComponent,
    AddStepComponent, DashboardComponent, ExamComponent, AddExamComponent, ListExamComponent, AddModuleComponent, ListModuleComponent]
})
export class AdminModule { }
