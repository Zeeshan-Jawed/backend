import { Component, OnInit, Input } from "@angular/core";
import { ShoppingCardService } from "../../services/shopping-card.service";
import { OrderService } from "../../services/order.service";

@Component({
  selector: "product-card",
  templateUrl: "./product-card.component.html",
  styleUrls: ["./product-card.component.css"],
})
export class ProductCardComponent {
  @Input("product") product;
  carditem = { product: {}, order: { id: undefined } };
  orderId: any;

  constructor(
    private _CartService: ShoppingCardService,
    private _OrderService: OrderService
  ) {}
  order(product) {
    this.orderId = localStorage.getItem("orderId");
    if (!this.orderId) {
      this._OrderService.createOrderID().subscribe((data: any) => {
        let Id = data.substring(3);
        localStorage.setItem("orderId", Id);
        this.orderId = Id;
      });
    } else this.carditem.order.id = this.orderId;
    this.addtocard(product);
  }

  addtocard(product) {
    this.carditem.product = product;
    console.log(this.carditem);
    this._CartService.createCard(this.carditem).subscribe((data: any) => {
      console.log(data);
    });
    this._CartService.selectedProduct.push(product);
  }
}
