import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { HomeComponent } from "./core/home/home.component";
import { LoginComponent } from "./core/login/login.component";
import { AdminProductsComponent } from "./admin/components/admin-products/admin-products.component";
import { AdminOrdersComponent } from "./admin/components/admin-orders/admin-orders.component";
import { ProductFormComponent } from "./admin/components/product-form/product-form.component";
import { ShoppingCartComponent } from "./shopping/components/shopping-cart/shopping-cart.component";
import { OrderSuccessComponent } from "./shopping/components/order-success/order-success.component";

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "login", component: LoginComponent },

  { path: "admin/products/new", component: ProductFormComponent },
  { path: "admin/products/:id", component: ProductFormComponent },
  { path: "admin/products", component: AdminProductsComponent },
  { path: "admin/orders", component: AdminOrdersComponent },

  { path: "shopping-cart", component: ShoppingCartComponent },
  { path: "ordersucess", component: OrderSuccessComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
