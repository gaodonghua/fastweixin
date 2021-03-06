package com.github.sd4324530.fastweixin.company.api.response;

import com.github.sd4324530.fastweixin.api.response.BaseResponse;

/**
 * Response -- 创建新标签
 *
 * @author alan
 * @version 1.0.beta
 * @since 1.3.6
 */
public class CreateTagResponse extends BaseResponse {

	private Integer tagid;

	public Integer getTagid() {
		return tagid;
	}

	public void setTagid(Integer tagid) {
		this.tagid = tagid;
	}
}
