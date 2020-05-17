import { Component, OnInit, OnDestroy, Input } from '@angular/core';
import { School } from '../../models/school';
import { SchoolService } from 'src/app/services/school.service';
import { Spell } from 'src/app/models/spell';
import { SpellService } from 'src/app/services/spell.service';
import { Observable } from 'rxjs';

interface WizardStats { //just until backend is implemented 
  move: Number;
  fight: Number;
  shoot: Number;
  armor: Number;
  will: Number;
  health: Number;
}

@Component({
  selector: 'wizard-card-view',
  templateUrl: './wizard-card.component.html',
  styleUrls: ['./wizard-card.component.css'],
  inputs: ['title']
})
export class WizardCardComponent implements OnInit, OnDestroy {

  @Input()
  title: string = '';

  chosenSchool: string = '';

  schools: Observable<School[]>;
  spells: Observable<Spell[]>;
  dataArray: WizardStats[] = [{move: 6, fight: 2, shoot: 0, armor: 10, will: 4, health: 14}];
  columnsToDisplay: String[] = ['move', 'fight', 'shoot', 'armor', 'will', 'health'];

  constructor(private schoolService: SchoolService,
              private spellService: SpellService) { }

  ngOnInit(): void {
    this.schools = this.schoolService.getSchoolList();
    this.spells = this.spellService.getSpellsList();
    // this.spellService.getSpellsList().subscribe(spellList => {
    //   console.log(spellList);
    // })
  }

  ngOnDestroy(): void {

  }

  schoolSelected(value) {
    console.log(value);
  }

}
