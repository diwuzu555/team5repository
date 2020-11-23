package com.glc.demo.user.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glc.demo.user.dao.IssueDao;
import com.glc.demo.user.entity.IssueEntity;

@Service
public class IssueServiceImpl implements IssueService {

	@Autowired
	IssueDao issueDao;

	@Override
	public List<IssueEntity> listIssue(Map map) {
		return issueDao.listIssue();
	}

	// 报表生成
	@Override
	public IssueEntity queryReport() {
		return issueDao.queryReport();
	}

	// 删除issue
	@Override
	public void deleteIssue(Integer issueId) {
		issueDao.deleteIssue(issueId);
	}

	// 创建issue
	@Override
	public void insertIssue(IssueEntity issue) {
		issue.setiCreateTime(new Date());
		issue.setIssueStatus("未解决");
		issueDao.insertIssue(issue);
	}

	// 查询issue
	@Override
	public IssueEntity queryIssue(Integer issueId) {
		return issueDao.queryIssue(issueId);
	}

	// 更新issue
	@Override
	public void updateIssue(IssueEntity issue) {
		issueDao.updateIssue(issue);
	}

}
