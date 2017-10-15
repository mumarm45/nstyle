import { Injectable } from '@angular/core';
import { Http} from '@angular/http';

@Injectable()
export class CustomerService {

  url = 'http://localhost:8080/customer/list';
  constructor(private http: Http) { }

  getList() {
    console.log("Reached");
    return  this.http.get(this.url);
  }

}
