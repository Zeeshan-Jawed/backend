import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: "root",
})
export class ShoppingCardService {
  url: any = environment.apiurl;
  selectedProduct: any = [];
  constructor(private http: HttpClient) {}
  createCard(product) {
    return this.http.post(this.url + "cart/", product, {
      responseType: "text" as "json",
    });
  }
  findCardid() {
    return this.http.get(this.url + "cart/");
  }
}
