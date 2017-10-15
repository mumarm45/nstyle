import { Component, OnInit } from '@angular/core';
import { DataTableResource } from 'angular-4-data-table';
import {EmployeeService} from './service/employee.service';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

   itemResource = {};
   items = [];
   itemCount = 0;
  constructor(private employeeService: EmployeeService) {}

  ngOnInit() {  }

  reloadItems(params) {
    this.employeeService.getList().subscribe(result => {
        this.items = result.json();
        this.itemCount = this.items.length;
    });
}

}
