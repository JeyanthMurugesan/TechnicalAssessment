package com.productmanagement.SpringBootCrud.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductManagementDao")
public class ProductManagementDao {
	@Column(name = "ProductName")
    private String productName;
    @Id
    @Column(name = "ProductId")
    private Integer productId;
//    private String productAmount;
//    private Integer productQuantity;
    
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    /*public String getProductAmount() {
        return productAmount;
    }
    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }
    public Integer getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }*/
}
