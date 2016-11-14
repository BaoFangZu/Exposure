package com.exposure.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "评论")
@Entity
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @ApiModelProperty("评论内容")
    private String content;
    
    @ApiModelProperty("评论目标id")
    @Column(name="target_id")
    private Long targetId;
    
    @ApiModelProperty("评论者")
    @Column(name="user_id")
    private Long userId;
    
    @ApiModelProperty("评论类型：[house,comment]")
    private String type;
    
    @ApiModelProperty(value="评论时间", dataType="string")
    @Column(name="create_time",insertable = false, updatable = false)
    private Timestamp createTime;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getTargetId() {
		return targetId;
	}
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
    
}
