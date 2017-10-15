import { Component, OnInit } from '@angular/core';
import { DataTableResource } from 'angular-4-data-table';
import {CustomerService} from './service/customer.service';
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

   itemResource = {};
   items = [];
   itemCount = 0;
  constructor(private customerService: CustomerService) {}

  ngOnInit() {  }

  reloadItems(params) {
    this.customerService.getList().subscribe(result => {
        this.items = result.json();
        this.itemCount = this.items.length;
    });
}

}
