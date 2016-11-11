package com.exposure.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="house")
public class House {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    //private Long article_id;
    private float price;
    private String address;
    
    @Column(insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp create_time;
    
    //(cascade=CascadeType.ALL)  
    @OneToOne(cascade=CascadeType.ALL) 
    @JoinColumn(name="article_id")
    private Article article;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", price=" + price + ", address=" + address + ", create_time=" + create_time
				+ ", article=" + article + "]";
	}   
	
}
