import { Component, OnInit } from '@angular/core';
import { School } from '../../models/school';
import { SchoolService } from 'src/app/services/school.service';

interface WizardStats {
  move: Number;
  fight: Number;
  shoot: Number;
  armor: Number;
  will: Number;
  health: Number;
}

@Component({
  selector: 'app-new-warband-view',
  templateUrl: './new-warband-view.component.html',
  styleUrls: ['./new-warband-view.component.css']
})
export class NewWarbandViewComponent implements OnInit {

  schools: School[];
  dataArray: WizardStats[] = [{move: 6, fight: 2, shoot: 0, armor: 10, will: 4, health: 14}];
  columnsToDisplay: String[] = ['move', 'fight', 'shoot', 'armor', 'will', 'health'];
  subscription = null;

  constructor(private schoolService: SchoolService) { }

  ngOnInit(): void {
    this.subscription = this.schoolService.getSchoolList().subscribe(data => {
      this.schools = data;
      console.log(this.schools);
    });
  }

}
