import { Component, OnInit } from "@angular/core";
import { AuthService } from "src/app/shared/services/auth.service";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"],
})
export class HomeComponent implements OnInit {
  useremail: any;
  constructor(private auth: AuthService) {}
  ngOnInit() {
    this.logi();
  }
  logi() {
    this.useremail = this.auth.getCurrentUser();
  }
}
