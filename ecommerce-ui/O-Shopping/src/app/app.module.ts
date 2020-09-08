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
import { CheckOutComponent } from "./shopping/components/check-out/check-out.component";
import { ShippingFormComponent } from "./shopping/components/shipping-form/shipping-form.component";
import { ShoppingCartComponent } from "./shopping/components/shopping-cart/shopping-cart.component";
import { ShoppingCartSummaryComponent } from "./shopping/components/shopping-cart-summary/shopping-cart-summary.component";
import { ProductFormComponent } from "./admin/components/product-form/product-form.component";
import { MyOrdersComponent } from "./shopping/components/my-orders/my-orders.component";
import { AuthService } from "./shared/services/auth.service";
import { CategoryService } from "./shared/services/category.service";
import { OrderService } from "./shared/services/order.service";
import { ProductService } from "./shared/services/product.service";
import { ProductsComponent } from "./shopping/components/products/products.component";
import { ProductCardComponent } from './shared/components/product-card/product-card.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    HomeComponent,
    LoginComponent,
    AdminOrdersComponent,
    AdminProductsComponent,
    CheckOutComponent,
    ShippingFormComponent,
    ShoppingCartComponent,
    ShoppingCartSummaryComponent,
    MyOrdersComponent,
    ProductFormComponent,
    ProductsComponent,
    ProductCardComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [AuthService, CategoryService, OrderService, ProductService],
  bootstrap: [AppComponent],
})
export class AppModule {}
