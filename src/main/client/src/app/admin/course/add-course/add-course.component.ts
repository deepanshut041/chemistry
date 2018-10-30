import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.scss']
})
export class AddCourseComponent implements OnInit {

  courseForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.courseForm = fb.group({
      'id': [null, Validators.compose([Validators.maxLength(20)])],
      'title': [null, Validators.compose([Validators.required])],
      'description': [null, Validators.compose([Validators.required])],
      'trailer_link': [null, Validators.compose([Validators.maxLength(100)])],
      'course_fee': [null, Validators.compose([Validators.maxLength(30)])],
      'duration': [null, Validators.compose([Validators.required, Validators.maxLength(100)])],
      'prerequisite': [null, Validators.compose([Validators.required, Validators.maxLength(100)])],
      'is_active': [null, Validators.compose([Validators.required])],
      'category_id': [null, Validators.compose([Validators.maxLength(10)])],
      'language_id': [null, Validators.compose([Validators.maxLength(30)])],
      'cover_image': [null, Validators.compose([Validators.maxLength(30)])],
    });
  }

  ngOnInit() {
  }

  createStudent() {
    console.log(this.courseForm.value)

  }
}
