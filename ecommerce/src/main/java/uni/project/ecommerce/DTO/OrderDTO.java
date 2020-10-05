package uni.project.ecommerce.DTO;

import uni.project.ecommerce.Model.AppUser;

import java.util.Date;

public class OrderDTO {
    private Long id;
    private Date date;
    private double total_item;
    private double total_amount;
    private AppUser appUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal_item() {
        return total_item;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public void setTotal_item(double total_item) {
        this.total_item = total_item;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}
