import { Component } from '@angular/core';

@Component({
  selector: 'home-main',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  title = 'app';
  LANDING_IMAGE = "./assets/ellipse_path.svg"
  HEADER_BACKGROUND = "./assets/main_bg.jpg"
  PARALLAX_IMAGE = "./assets/s1.jpg"
  TITILE_SVG ="./assets/CHEMISTRY_animated.svg"
  NOTES_IMAGE1 ="./assets/ch1.png"
}
