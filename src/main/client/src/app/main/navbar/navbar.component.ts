import { Component } from '@angular/core';

@Component({
  selector: 'navbar-main',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {
  title = 'app';
  LOGO_SVG = "./assets/logo-chemistry.svg"
}
