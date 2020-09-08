import { Injectable } from "@angular/core";
import { environment } from "src/environments/environment";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root",
})
export class OrderService {
  url: any = environment.apiurl;
  data = {};
  constructor(private http: HttpClient) {}
  createOrderID() {
    return this.http.post(this.url + "order/", this.data, {
      responseType: "text" as "json",
    });
  }
  findOrderById() {}
}
