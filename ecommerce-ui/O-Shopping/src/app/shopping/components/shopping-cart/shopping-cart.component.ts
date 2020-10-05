import { Component, OnInit } from "@angular/core";
import { OrderService } from "src/app/shared/services/order.service";
import { ShoppingCardService } from "src/app/shared/services/shopping-card.service";

@Component({
  selector: "app-shopping-cart",
  templateUrl: "./shopping-cart.component.html",
  styleUrls: ["./shopping-cart.component.css"],
})
export class ShoppingCartComponent implements OnInit {
  cart: any[] = [];
  totalamount: any;
  constructor(
    private _CartService: ShoppingCardService,
    private order: OrderService
  ) {}
  gettotalprice() {
    let sum = 0;
    for (let item of this.cart) sum = sum + item.price;
    this.totalamount = sum;
  }

  ngOnInit() {
    this.cart = this._CartService.selectedProduct;
    this.gettotalprice();
  }
  checkout() {
    this.order
      .orderupdate(this.cart.length, this.totalamount)
      .subscribe((data) => console.log(data));
  }
}
