import { TestBed } from '@angular/core/testing';

import { GiveHelpServiceService } from './give-help-service.service';

describe('GiveHelpServiceService', () => {
  let service: GiveHelpServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GiveHelpServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
