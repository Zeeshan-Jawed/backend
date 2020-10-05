import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { NavBarComponent } from "./core/nav-bar/nav-bar.component";
import { HomeComponent } from "./core/home/home.component";
import { LoginComponent } from "./core/login/login.component";
import { AdminOrdersComponent } from "./admin/components/admin-orders/admin-orders.component";
import { AdminProductsComponent } from "./admin/components/admin-products/admin-products.component";
import { ShoppingCartComponent } from "./shopping/components/shopping-cart/shopping-cart.component";
import { ProductFormComponent } from "./admin/components/product-form/product-form.component";
import { AuthService } from "./shared/services/auth.service";
import { CategoryService } from "./shared/services/category.service";
import { OrderService } from "./shared/services/order.service";
import { ProductService } from "./shared/services/product.service";
import { ProductsComponent } from "./shopping/components/products/products.component";
import { ProductCardComponent } from "./shared/components/product-card/product-card.component";
import { OrderSuccessComponent } from "./shopping/components/order-success/order-success.component";

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    HomeComponent,
    LoginComponent,
    AdminOrdersComponent,
    AdminProductsComponent,
    ShoppingCartComponent,
    ProductFormComponent,
    ProductsComponent,
    ProductCardComponent,
    OrderSuccessComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [AuthService, CategoryService, OrderService, ProductService],
  bootstrap: [AppComponent],
})
export class AppModule {}
