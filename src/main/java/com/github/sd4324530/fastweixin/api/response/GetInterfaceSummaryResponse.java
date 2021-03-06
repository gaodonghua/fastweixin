package com.github.sd4324530.fastweixin.api.response;

import com.github.sd4324530.fastweixin.api.entity.InterfaceSummary;

import java.util.List;

/**
 * @author alan
 */
public class GetInterfaceSummaryResponse extends BaseResponse {

	private List<InterfaceSummary> list;

	public List<InterfaceSummary> getList() {
		return list;
	}

	public void setList(List<InterfaceSummary> list) {
		this.list = list;
	}
}
