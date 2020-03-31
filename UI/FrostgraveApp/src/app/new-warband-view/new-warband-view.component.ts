import { Component, OnInit } from '@angular/core';
import { School } from '../school';

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

  constructor() { }

  schools: School[] = [
    {value: 0, name: 'Chronomancer'}, {value: 1, name: 'Elementalist'}, {value: 2, name: 'Enchanter'}, {value: 3, name: 'Illusionist'},
    {value: 4, name: 'Necromancer'}, {value: 5, name: 'Sigilist'}, {value: 6, name: 'Soothsayer'}, {value: 7, name: 'Summoner'},
    {value: 8, name: 'Thaumaturge'}, {value: 9, name: 'Witch'}
  ];

  dataArray: WizardStats[] = [{move: 6, fight: 2, shoot: 0, armor: 10, will: 4, health: 14}];

  columnsToDisplay: String[] = ['move', 'fight', 'shoot', 'armor', 'will', 'health'];

  ngOnInit(): void {
  }

}
