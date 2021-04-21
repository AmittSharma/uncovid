import { TestBed } from '@angular/core/testing';

import { TakeHelpServiceService } from './take-help-service.service';

describe('TakeHelpServiceService', () => {
  let service: TakeHelpServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TakeHelpServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
