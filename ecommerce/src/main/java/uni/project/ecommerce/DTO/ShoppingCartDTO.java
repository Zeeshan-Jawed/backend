package uni.project.ecommerce.DTO;

import uni.project.ecommerce.Model.Product;

public class ShoppingCartDTO {
    private Long id;
    private String date;
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
