package com.github.sd4324530.fastweixin.api.config;

import com.github.sd4324530.fastweixin.handle.ApiConfigChangeHandle;

/**
 * @author Alan
 * @date 2018/4/24
 * API配置接口，将原ApiConfig配置类抽象成一个接口
 */
public interface ApiConfig {

	/**
	 * 获取appId
	 *
	 * @return appId
	 */
	String getAppId();

	/**
	 * 获取secret
	 *
	 * @return secret
	 */
	String getSecret();

	/**
	 * 获取AccessToken
	 *
	 * @return AccessToken
	 */
	String getAccessToken();

	/**
	 * 获取JsApiTicket
	 *
	 * @return JsApiTicket
	 */
	String getJsApiTicket();

	/**
	 * 添加ApiConfig变化监听器
	 *
	 * @param handle 监听
	 */
	void addHandle(ApiConfigChangeHandle handle);

	/**
	 * 移除ApiConfig变化监听器
	 *
	 * @param handle 监听
	 */
	void removeHandle(ApiConfigChangeHandle handle);

	/**
	 * 移除所有ApiConfig变化监听器
	 */
	void removeAllHandle();

}
