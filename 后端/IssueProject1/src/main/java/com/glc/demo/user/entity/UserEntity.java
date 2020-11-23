package com.glc.demo.user.entity;

import java.util.Date;
import java.util.List;

public class UserEntity {

    private Integer userId;
    private String name;
    private String email;
    private Date uCreateTime;
    private String identity;
    private String status;
    private String password;
    
    private List<IssueEntity> basicList;
    
    public List<IssueEntity> getBasicList() {
		return basicList;
	}

	public void setBasicList(List<IssueEntity> basicList) {
		this.basicList = basicList;
	}

//	public UserEntity(Integer userId, String name, String email, Date uCreateTime, String identity, String status, String password) {
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//        this.uCreateTime = uCreateTime;
//        this.identity = identity;
//        this.status = status;
//        this.password = password;
//    }

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getuCreateTime() {
		return uCreateTime;
	}

	public void setuCreateTime(Date uCreateTime) {
		this.uCreateTime = uCreateTime;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	    public String toString() {
	        return "UserEntity{" +
	                "userId=" + userId +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", uCreateTime=" + uCreateTime +
	                ", identity='" + identity + '\'' +
	                ", status='" + status + '\'' +
	                ", password='" + password + '\'' +
	                '}';
	    }
}
