import { Component, OnInit, OnDestroy } from "@angular/core";
import { AuthService } from "src/app/shared/services/auth.service";
import { OrderService } from "src/app/shared/services/order.service";
import { RoleService } from "src/app/shared/services/role.service";

@Component({
  selector: "nav-bar",
  templateUrl: "./nav-bar.component.html",
  styleUrls: ["./nav-bar.component.css"],
})
export class NavBarComponent implements OnInit {
  appUser: any;
  isAdmin: boolean;
  islog: boolean;
  useremail: any;

  constructor(private auth: AuthService, private order: OrderService) {}

  ngOnInit() {
    this.useremail = this.auth.getCurrentUser();
    if (this.useremail) {
      this.auth.findbyemail(this.useremail).subscribe((data) => {
        this.appUser = data;
        this.order.user = this.appUser;
        let role = this.appUser.role;
        if (role.length !== 0) {
          // let isadmin = role.find((i) => i.id === 1);
          if (role.name === "admin") this.isAdmin = true;
        }
      });
    }
  }
  logout() {
    this.auth.logout();
  }
}
