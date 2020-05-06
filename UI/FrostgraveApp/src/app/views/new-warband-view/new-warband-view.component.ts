import { Component, OnInit, OnDestroy } from '@angular/core';
import { School } from '../../models/school';
import { SchoolService } from 'src/app/services/school.service';
import { Spell } from 'src/app/models/spell';
import { SpellService } from 'src/app/services/spell.service';
import { Observable } from 'rxjs';

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
export class NewWarbandViewComponent implements OnInit, OnDestroy {

  schools: School[];
  spells: Spell[];
  dataArray: WizardStats[] = [{move: 6, fight: 2, shoot: 0, armor: 10, will: 4, health: 14}];
  columnsToDisplay: String[] = ['move', 'fight', 'shoot', 'armor', 'will', 'health'];
  schoolSubscription;
  spellSubscription;

  constructor(private schoolService: SchoolService,
              private spellService: SpellService) { }

  ngOnInit(): void {
    this.schoolSubscription = this.schoolService.getSchoolList().subscribe(data => {
      this.schools = data;
    });

    this.spellSubscription = this.spellService.getSpellsList().subscribe(data => {
      this.spells = data;
    })
  }

  ngOnDestroy(): void {
    this.schoolSubscription.unsubscribe();
    this.spellSubscription.unsubscribe();
  }

}
