import { Injectable } from "@angular/core";
import { environment } from "src/environments/environment";
import { HttpClient } from "@angular/common/http";
import { LocalStorageService } from "ngx-webstorage-fix";

@Injectable({
  providedIn: "root",
})
export class OrderService {
  url: any = environment.apiurl;
  user: any = {};

  constructor(private http: HttpClient) {}
  createOrderID() {
    localStorage.setItem("userid", this.user.id);
    let data = {
      appUser: { id: localStorage.getItem("userid") },
      total_amount: 0,
    };
    return this.http.post(this.url + "order/", data, {
      responseType: "text" as "json",
    });
  }
  orderupdate(item, amount) {
    let data = {
      total_amount: amount,
      total_item: item,
    };
    let orderid = localStorage.getItem("orderId");
    return this.http.put(this.url + "order/" + orderid, data, {
      responseType: "text" as "json",
    });
  }
}
