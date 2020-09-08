import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { HomeComponent } from "./core/home/home.component";
import { LoginComponent } from "./core/login/login.component";
import { AdminProductsComponent } from "./admin/components/admin-products/admin-products.component";
import { AdminOrdersComponent } from "./admin/components/admin-orders/admin-orders.component";
import { MyOrdersComponent } from "./shopping/components/my-orders/my-orders.component";
import { ProductFormComponent } from "./admin/components/product-form/product-form.component";
import { ShoppingCartComponent } from "./shopping/components/shopping-cart/shopping-cart.component";

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "login", component: LoginComponent },
  { path: "my/orders", component: MyOrdersComponent },

  { path: "admin/products/new", component: ProductFormComponent },
  { path: "admin/products/:id", component: ProductFormComponent },
  { path: "admin/products", component: AdminProductsComponent },
  { path: "admin/orders", component: AdminOrdersComponent },

  { path: "shopping-cart", component: ShoppingCartComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
