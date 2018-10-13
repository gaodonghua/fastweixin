package com.github.sd4324530.fastweixin.api.response;

import com.github.sd4324530.fastweixin.api.entity.Tag;

/**
 * @author Alan
 * @since 1.3.9
 */
public class CreateTagResponse extends BaseResponse {

	private Tag tag;

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
}
