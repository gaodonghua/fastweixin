package com.github.sd4324530.fastweixin.company.api.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.sd4324530.fastweixin.api.response.BaseResponse;
import com.github.sd4324530.fastweixin.company.api.entity.QYAgent;

import java.util.List;

/**
 * @author alan
 * @version 1.0.beta
 */
public class GetQYAgentListResponse extends BaseResponse {

	@JSONField(name = "agentlist")
	public List<QYAgent> agentList;

	public List<QYAgent> getAgentList() {
		return agentList;
	}

	public void setAgentList(List<QYAgent> agentList) {
		this.agentList = agentList;
	}
}
