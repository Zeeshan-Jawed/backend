import { Component, OnInit } from "@angular/core";
import { ProductService } from "src/app/shared/services/product.service";

@Component({
  selector: "app-admin-products",
  templateUrl: "./admin-products.component.html",
  styleUrls: ["./admin-products.component.css"],
})
export class AdminProductsComponent implements OnInit {
  products: any;
  chk: any;
  filteredproduct: any;
  constructor(private _ProductService: ProductService) {}

  ngOnInit() {
    this._ProductService
      .getProduct()
      .subscribe((data) => (this.filteredproduct = this.products = data));
  }
  filter(query: String) {
    this.filteredproduct = query
      ? this.products.filter((p) =>
          p.name.toLowerCase().includes(query.toLowerCase())
        )
      : this.products;
  }
}
