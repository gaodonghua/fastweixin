package com.github.sd4324530.fastweixin.api.config;

/**
 *
 * @author Alan
 * @date 2018/4/24
 * Token响应结果回调
 */
public interface TokenResponseCallback {

	void onSuccess(TokenResponse response);

	void onFailure(TokenResponse response);

}
