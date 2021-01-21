import { AppConstants } from './../../app-constants';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersServiceService {

  constructor(private http: HttpClient) {}

  getUsers(): Observable<any>{
    return this.http.get<any>(AppConstants.baseUsers);
    console.log(AppConstants.baseUsers);
  }
}
