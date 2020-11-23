package com.glc.demo.user.entity;

import java.util.Date;
import java.util.List;

public class IssueEntity {

    private Integer issueId;
    private String title;
    private String founder;
    private Date iCreateTime;
    private String reviser;
    private String issueStatus;
    private Date planTime;
    private Date actualTime;
	private Integer userId1;
	private Integer userId2;
	private String type;
	private String grade;
	private String version;
	private String step;
	private String plan;
	
	
    private List<UserEntity> userList;
    
	public List<UserEntity> getUserList() {
		return userList;
	}

	public void setUserList(List<UserEntity> userList) {
		this.userList = userList;
	}

//	public BasicEntity(Integer issueId, String title, String founder, Date iCreateTime, String reviser,
//			String issueStatus, Date planTime, Date actualTime, Integer userId1, Integer userId2, 
//			String type, String grade, String version, String step, String plan) {
//		this.issueId = issueId;
//		this.title = title;
//		this.founder = founder;
//		this.iCreateTime = iCreateTime;
//		this.reviser = reviser;
//		this.issueStatus = issueStatus;
//		this.planTime = planTime;
//		this.actualTime = actualTime;
//		this.userId1 = userId1;
//		this.userId1 = userId2;
//		this.type = type;
//		this.grade = grade;
//		this.version = version;
//		this.step = step;
//		this.plan = plan;
//	}
	
	

	public Integer getIssueId() {
		return issueId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Date getiCreateTime() {
		return iCreateTime;
	}

	public void setiCreateTime(Date iCreateTime) {
		this.iCreateTime = iCreateTime;
	}

	public String getReviser() {
		return reviser;
	}

	public void setReviser(String reviser) {
		this.reviser = reviser;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public Date getPlanTime() {
		return planTime;
	}

	public void setPlanTime(Date planTime) {
		this.planTime = planTime;
	}

	public Date getActualTime() {
		return actualTime;
	}

	public void setActualTime(Date actualTime) {
		this.actualTime = actualTime;
	} 

    public Integer getUserId1() {
		return userId1;
	}

	public void setUserId1(Integer userId1) {
		this.userId1 = userId1;
	}

	public Integer getUserId2() {
		return userId2;
	}

	public void setUserId2(Integer userId2) {
		this.userId2 = userId2;
	}

	@Override
    public String toString() {
        return "Basic{" +
            "issueId=" + issueId +
            ", title='" + title + '\'' +
            ", founder='" + founder + '\'' +
            ", iCreateTime=" + iCreateTime +
            ", reviser='" + reviser + '\'' +
            ", issueStatus='" + issueStatus + '\'' +
            ", planTime=" + planTime +
            ", actualTime=" + actualTime +
            ", userId1=" + userId1 +
            ", userId2=" + userId2 +
            ", type='" + type + '\'' +
            ", grade='" + grade + '\'' +
            ", version='" + version + '\'' +
            ", step='" + step + '\'' +
            ", plan='" + plan + '\'' +
        '}';
    }

}
