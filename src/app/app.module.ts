import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerService } from './customer/service/customer.service';

import { DataTableModule } from 'angular-4-data-table';

@NgModule({
  declarations: [
    AppComponent, CustomerComponent
  ],
  imports: [
    BrowserModule, DataTableModule, HttpModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
