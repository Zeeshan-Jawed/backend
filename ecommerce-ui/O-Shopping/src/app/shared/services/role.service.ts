import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: "root",
})
export class RoleService {
  url: any = environment.apiurl;
  constructor(private http: HttpClient) {}

  getrole() {
    return this.http.get(this.url + "role/");
  }
}
