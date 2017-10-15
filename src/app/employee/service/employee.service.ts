import { Injectable } from '@angular/core';
import { Http} from '@angular/http';

@Injectable()
export class EmployeeService {

  url = 'http://localhost:8080/employee/list';
  constructor(private http: Http) { }

  getList() {
    console.log("Reached");
    return  this.http.get(this.url);
  }

}
