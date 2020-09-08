import { Injectable } from "@angular/core";
import { environment } from "src/environments/environment";
import { HttpClient } from "@angular/common/http";
import { Category } from "../models/Category";

@Injectable({
  providedIn: "root",
})
export class CategoryService {
  url: any = environment.apiurl;
  constructor(private http: HttpClient) {}

  getCategory() {
    return this.http.get(this.url + "category/");
  }
  getCategorybyid(categoryid) {
    return this.http.get<Category>(this.url + "category/" + categoryid);
  }
}
