package uni.project.ecommerce.DTO;

import uni.project.ecommerce.Model.SubCategory;

import java.util.HashSet;
import java.util.Set;

public class CategoryDTO {
    private Long id;
    private String name;
    private String image;
    private Set<SubCategory> subCategories=new HashSet<>();

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

    public Set<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
