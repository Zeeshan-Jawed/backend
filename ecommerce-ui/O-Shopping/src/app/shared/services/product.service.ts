import { Injectable } from "@angular/core";
import { environment } from "src/environments/environment";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root",
})
export class ProductService {
  url: any = environment.apiurl;
  constructor(private http: HttpClient) {}

  onsaveProduct(productO) {
    return this.http.post(this.url + "product/", productO, {
      responseType: "text" as "json",
    });
  }
  getProduct() {
    return this.http.get(this.url + "product/");
  }
  getProductByid(id) {
    return this.http.get(this.url + "product/" + id);
  }
  updateProduct(id, productO) {
    return this.http.put(this.url + "product/" + id, productO, {
      responseType: "text" as "json",
    });
  }
  deleteProduct(id) {
    return this.http.delete(this.url + "product/" + id, {
      responseType: "text" as "json",
    });
  }
}
