package com.glc.demo.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glc.demo.user.entity.IssueEntity;
import com.glc.demo.user.service.IssueService;

@Controller
@RequestMapping("issue")
public class IssueController {

	@Autowired
	IssueService issueService;

	// 获取所有issue
	@ResponseBody
	@RequestMapping("/listIssue")
	public List<IssueEntity> listIssue(Map map) {
		return issueService.listIssue(map);
	}

	// 删除issue
	@RequestMapping("/deleteIssue")
	public String deleteIssue(Integer issueId) {
		issueService.deleteIssue(issueId);
		return "success";
//		return "redirect:/index.html";//重定向功能
	}

	// 创建issue
	@RequestMapping("/insertIssue")
	@ResponseBody
	public String insertIssue(@RequestBody IssueEntity issue) {
		System.out.println("创建issue" + issue.toString());
		issueService.insertIssue(issue);
		return "success";
	}

	// 查询issue
	@RequestMapping("/queryIssue")
	@ResponseBody
	public IssueEntity queryIssue(Integer issueId) {
		return issueService.queryIssue(issueId);
	}

	// 修改issue
	@RequestMapping("/updateIssue")
	@ResponseBody
	public String updateIssue(@RequestBody IssueEntity issue) {
		issueService.updateIssue(issue);
		return "success";
	}

}
