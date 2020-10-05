import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-order-success",
  templateUrl: "./order-success.component.html",
  styleUrls: ["./order-success.component.css"],
})
export class OrderSuccessComponent implements OnInit {
  constructor() {}
  orderno: any;
  ngOnInit() {
    this.orderno = localStorage.getItem("orderId");
    localStorage.removeItem("orderId");
  }
}
