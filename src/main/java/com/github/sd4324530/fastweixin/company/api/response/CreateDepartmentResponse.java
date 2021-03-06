package com.github.sd4324530.fastweixin.company.api.response;

import com.github.sd4324530.fastweixin.api.response.BaseResponse;

/**
 * @author alan
 * @version 1.0.beta
 */
public class CreateDepartmentResponse extends BaseResponse {
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CreateDepartmentResponse{" +
				"id=" + id +
				'}';
	}
}
