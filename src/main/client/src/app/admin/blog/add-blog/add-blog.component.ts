import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-blog',
  templateUrl: './add-blog.component.html',
  styleUrls: ['./add-blog.component.scss']
})
export class AddBlogComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    document.getElementById("spinner").style.display = "none";
    document.getElementById("spinnerC").style.display = "none";
    document.getElementById("blog-form").style.display = "block";
  }

}
