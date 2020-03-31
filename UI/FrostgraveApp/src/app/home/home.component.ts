import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(
    private router: Router
  ) {}

  ngOnInit() {
    
  }

  navigateToExisting() {
    console.log('clicked existing');
  }

  navigateToNew() {
    console.log('clicked nav to new');
    this.router.navigate(['/new_warband']);
  }

}
