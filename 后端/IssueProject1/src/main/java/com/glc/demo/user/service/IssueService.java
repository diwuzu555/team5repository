package com.glc.demo.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.glc.demo.user.entity.IssueEntity;

public interface IssueService {

	List<IssueEntity> listIssue(Map map);

	// 报表生成
	public IssueEntity queryReport();

	// 创建issue
	public void insertIssue(IssueEntity issue);

	// 查询issue
	public IssueEntity queryIssue(Integer issueId);

	// 修改issue
	public void updateIssue(@RequestBody IssueEntity issue);

	// 删除issue
	public void deleteIssue(Integer issueId);
}
