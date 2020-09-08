import { Component, OnInit } from "@angular/core";
import { ProductService } from "src/app/shared/services/product.service";
import { CategoryService } from "src/app/shared/services/category.service";
import { ActivatedRoute } from "@angular/router";
import { map } from "rxjs/operators";
import { Category } from "src/app/shared/models/Category";

@Component({
  selector: "app-products",
  templateUrl: "./products.component.html",
  styleUrls: ["./products.component.css"],
})
export class ProductsComponent implements OnInit {
  products: any = [];
  categories: any;
  filterProducts: any;
  categoryid: string;

  constructor(
    private _ProductService: ProductService,
    private _CategoryService: CategoryService,
    private route: ActivatedRoute
  ) {
    this._ProductService.getProduct().subscribe((data) => {
      this.products = data;
    });
    this._CategoryService
      .getCategory()
      .subscribe((data) => (this.categories = data));
    this.route.queryParamMap.subscribe((params) => {
      this.categoryid = params.get("category");
    });
    // this._CategoryService.getCategorybyid(1).subscribe((data: Category) => {
    //   this.category = data;
    //   this.categoryproduct = this.category.products;
    //   this.filterProducts = Array.of(this.categoryproduct);
    //   console.log(this.filterProducts);
    // });
  }

  ngOnInit() {}
}
