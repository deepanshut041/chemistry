import { Component } from '@angular/core';

@Component({
  selector: 'blog-list-main',
  templateUrl: './blog-list.component.html',
  styleUrls: ['./blog-list.component.scss']
})
export class BlogListComponent {
  posts = [
    {
      "post_type": "Chemistry",
      "post_about":"Plotics",
      "post_title":"The Old Donkey - Background Story Behind the Clinton Campaign Branding",
      "post_author": "Deepanshu Tyagi",
      "post_highlight": "Beyond the campaign, the Clinton brand strikes people to continue to move forward. Between the Pantsuit CSS Library, her logo and that slightly fattened san serif body font, Jesse Reed, Michael Bierut, Mina Markham and others have embodied what it means to design for America’s future.",
      "post_imgurl": "https://firebasestorage.googleapis.com/v0/b/t2b-live.appspot.com/o/blog%2F-KvYQZ4zFDJQlssYt3ni?alt=media&token=5ad53e78-37f6-4fa9-adcc-9b55a4ec846b"
    }
  ]
}
