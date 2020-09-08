import { Component, OnInit } from "@angular/core";
import { CategoryService } from "src/app/shared/services/category.service";
import { ProductService } from "src/app/shared/services/product.service";
import { Router, ActivatedRoute } from "@angular/router";

@Component({
  selector: "app-product-form",
  templateUrl: "./product-form.component.html",
  styleUrls: ["./product-form.component.css"],
})
export class ProductFormComponent implements OnInit {
  categories: Object;
  products: Object;
  product: Object = [];
  id;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private _CategoryService: CategoryService,
    private _ProductService: ProductService
  ) {}

  ngOnInit() {
    let res = this._CategoryService.getCategory();
    res.subscribe((data) => (this.categories = data));
    this.id = this.route.snapshot.params["id"];
    if (this.id) {
      this._ProductService
        .getProductByid(this.id)
        .subscribe((data) => (this.product = data));
    }
  }

  save(productO) {
    console.log(productO);
    if (this.id)
      this._ProductService
        .updateProduct(this.id, productO)
        .subscribe((data) => (this.products = data));
    else
      this._ProductService
        .onsaveProduct(productO)
        .subscribe((data) => (this.products = data));
    this.router.navigate(["admin/products"]);
  }
  delete() {
    this._ProductService
      .deleteProduct(this.id)
      .subscribe((data) => console.log(data));
    this.router.navigate(["admin/products"]);
  }
}
