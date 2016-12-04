package com.exposure.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "附件")
@Entity
@Table(name="attachment")
public class Attachment {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    @ApiModelProperty("附件")
    private String url;
    
//    @ApiModelProperty(value="房源",hidden=true)
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="house_id")
//    @JsonIgnore
//    private House house;
 
    @ApiModelProperty("房源id")
    @Column(name="house_id",insertable = false, updatable = false)
    private long houseId;
    
    @ApiModelProperty(value="评论时间", dataType="string")
    @Column(name="create_time",insertable = false, updatable = false)
    private Timestamp createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

//	public House getHouse() {
//		return house;
//	}
//
//	public void setHouse(House house) {
//		this.house = house;
//	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public long getHouseId() {
		return houseId;
	}

	public void setHouseId(long houseId) {
		this.houseId = houseId;
	}
    
}
