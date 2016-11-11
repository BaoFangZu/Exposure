package com.exposure.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="house")
public class House {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long article_id;
    private float price;
    private String address;
    private Timestamp create_time;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Long article_id) {
		this.article_id = article_id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", article_id=" + article_id + ", price=" + price + ", address=" + address
				+ ", create_time=" + create_time + "]";
	}
    
    
}
