package com.cg.onlinepharmacystore.entity;

import javax.persistence.*;

import com.cg.onlinepharmacystore.entity.Admin;

@Entity
@Table(name ="Products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productId")
	private Long product_Id;
	@Column(name="product_Name")
	private String product_Name;
	@Column(name="productPrice")
	private Integer product_Price;
	@Column(name="mfg_Date")
	private String mfg_Date;
	@Column(name="exp_Date")
	private String exp_Date;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	public Products() {
		super();
	}
	public Products(String product_Name, Integer product_Price, String mfg_Date, String exp_Date) {
		super();
		this.product_Name = product_Name;
		this.product_Price = product_Price;
		this.mfg_Date = mfg_Date;
		this.exp_Date = exp_Date;
	}
//	public Long getProduct_Id() {
//		return product_Id;
//	}
//	public void setProduct_Id(Long product_Id) {
//		this.product_Id = product_Id;
//	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public Integer getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(Integer product_Price) {
		this.product_Price = product_Price;
	}
	public String getMfg_Date() {
		return mfg_Date;
	}
	public void setMfg_Date(String mfg_Date) {
		this.mfg_Date = mfg_Date;
	}
	public String getExp_Date() {
		return exp_Date;
	}
	public void setExp_Date(String exp_Date) {
		this.exp_Date = exp_Date;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	@Override
	public String toString() {
		return "Product [ProductName=" + product_Name+ ", ProductPrice=" + product_Price+ ", ExpiryDate=" + exp_Date+ ", ManufacturingDate=" + mfg_Date
				 + ", ProductId=" + product_Id+ "]";
	}
}
