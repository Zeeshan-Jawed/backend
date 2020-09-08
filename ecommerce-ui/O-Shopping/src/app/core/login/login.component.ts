import { Component, OnInit } from "@angular/core";
import { AuthService } from "src/app/shared/services/auth.service";
import { Route } from "@angular/compiler/src/core";
import { Router } from "@angular/router";

@Component({
  selector: "login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
})
export class LoginComponent implements OnInit {
  invaildLogin: boolean;
  constructor(private _AuthServcie: AuthService, private router: Router) {}

  ngOnInit() {}
  login(credentialsO) {
    let response = this._AuthServcie.login(credentialsO.value);

    response.subscribe((result: any) => {
      if (result) {
        localStorage.setItem("token", result);
        this.router.navigate(["/"]);
      } else {
        this.invaildLogin = true;
      }
    });
  }
  register(registerO) {
    let response = this._AuthServcie.registerUser(registerO.value);
    response.subscribe((data) => console.log(data));
  }
}
