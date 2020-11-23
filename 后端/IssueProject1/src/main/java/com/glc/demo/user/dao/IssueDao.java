package com.glc.demo.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.glc.demo.user.entity.IssueEntity;
import com.glc.demo.user.entity.UserEntity;

@Mapper
public interface IssueDao {

////////////////////////////////

    //获取issue
    public IssueEntity queryIssue(Integer issueId);
 
    //查询所有issue
    public List<IssueEntity> listIssue();
 
    //创建issue
    public int insertIssue(IssueEntity issue);
    
    //修改issue
    public int updateIssue(IssueEntity issue);

	//删除issue
    public int deleteIssue(Integer issueId);
    
	/**
	 * 根据userId1查询用户的user1信息
	 */
	public IssueEntity selectUser1ByUserId1(Integer userId1);
	
	/**
	 * 根据userId2查询用户的user2信息
	 */
	public IssueEntity selectUser2ByUserId2(Integer userId2);
}
