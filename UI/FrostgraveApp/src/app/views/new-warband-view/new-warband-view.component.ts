import { Component, OnInit, OnDestroy } from '@angular/core';
import { School } from '../../models/school';
import { SchoolService } from 'src/app/services/school.service';
import { Spell } from 'src/app/models/spell';
import { SpellService } from 'src/app/services/spell.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-new-warband-view',
  templateUrl: './new-warband-view.component.html',
  styleUrls: ['./new-warband-view.component.css']
})
export class NewWarbandViewComponent implements OnInit, OnDestroy {

  Wizard: string = 'Wizard';
  Apprentice: string = 'Apprentice';

  ngOnInit(): void {

  }

  ngOnDestroy(): void {

  }

}
