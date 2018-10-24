import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {

  school:any;
  staff:any;
  student:any;

  status:any;
  settings:any;
  academics:any;
  students:any;
  performances:any;
  taskmanager:any;

  constructor() { }

  ngOnInit() {
  }


  hideAsideMenu(element: HTMLElement) {
    let c = document.getElementById("main-container")
    if (element.style.display == "block") {
      element.style.display = "none";
      c.style.marginLeft = "0px";
    }
    else {
      element.style.display = "block";

      c.style.marginLeft = "210px";
    }
  }

  expandSubMenu(element: HTMLElement) {
    if (element.style.display == "block") {
      element.style.display = "none";
    }
    else {
      element.style.display = "block";
    }

  }
}
