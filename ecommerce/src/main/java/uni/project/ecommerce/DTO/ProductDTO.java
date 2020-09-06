package uni.project.ecommerce.DTO;

import uni.project.ecommerce.Model.Category;


public class ProductDTO {
    private Long id;
    private String name;
    private String image;
    private String featured_image_1;
    private String featured_image_2;
    private Double price;
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFeatured_image_1() {
        return featured_image_1;
    }

    public void setFeatured_image_1(String featured_image_1) {
        this.featured_image_1 = featured_image_1;
    }

    public String getFeatured_image_2() {
        return featured_image_2;
    }

    public void setFeatured_image_2(String featured_image_2) {
        this.featured_image_2 = featured_image_2;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
