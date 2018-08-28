import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import {MainComponent} from "./main/main.component";
import {HomeComponent} from "./main/home/home.component";


const routes:Routes =[
  {path:'admin', loadChildren:"./admin/admin.module#AdminModule"},
  {path:'user', loadChildren:"./user/user.module#UserModule"},
  {
    path: '', component: MainComponent, children:[
      {path: '', component: HomeComponent}
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
