import { Component, OnInit } from "@angular/core";
import { ShoppingCardService } from "src/app/shared/services/shopping-card.service";

@Component({
  selector: "app-shopping-cart",
  templateUrl: "./shopping-cart.component.html",
  styleUrls: ["./shopping-cart.component.css"],
})
export class ShoppingCartComponent implements OnInit {
  cart: any[] = [];

  constructor(private _CartService: ShoppingCardService) {}

  ngOnInit() {
    this.cart = this._CartService.selectedProduct;
  }
}
