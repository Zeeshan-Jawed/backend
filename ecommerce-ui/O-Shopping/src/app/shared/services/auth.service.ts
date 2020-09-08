import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from "./../../../environments/environment";
import { JwtHelperService } from "@auth0/angular-jwt";
import { Users } from "../models/Users";
import { tokenName } from "@angular/compiler";

@Injectable({
  providedIn: "root",
})
export class AuthService {
  url: any = environment.apiurl;
  user: any;
  constructor(private http: HttpClient) {}
  login(loginO) {
    return this.http.post(this.url + "auth/", loginO, {
      responseType: "text" as "json",
    });
  }
  registerUser(userO: Users) {
    return this.http.post(this.url + "appUser/", userO, {
      responseType: "text" as "json",
    });
  }
  logout() {
    localStorage.removeItem("token");
  }
  isLoggedIn() {
    let jwtHelper = new JwtHelperService();
    let token = localStorage.getItem("token");
    if (!token) return false;

    let expireDate = jwtHelper.getTokenExpirationDate(token);
    let isTokenExpired = jwtHelper.isTokenExpired(token);
    return !isTokenExpired;
  }
  getCurrentUser() {
    let jwtHelper = new JwtHelperService();
    let token = localStorage.getItem("token");
    if (!token) return null;
    let t = jwtHelper.decodeToken(token);
    return t.sub;
  }
  findbyemail(useremail) {
    return this.http.get(this.url + "appUser/e/" + useremail + "/");
  }
}
