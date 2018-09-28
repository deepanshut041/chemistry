import { Component } from '@angular/core';

@Component({
  selector: 'home-main',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  title = 'app';
  LANDING_IMAGE = "./assets/chemistryDesign.svg"
  HEADER_BACKGROUND = "./assets/Chem-LandingPage.svg"
  PARALLAX_IMAGE = "./assets/s1.jpg"
  TITILE_SVG ="./assets/CHEMISTRY_animated.svg"
  NOTES_IMAGE1 ="./assets/notes.png"
}
