package com.github.sd4324530.fastweixin.exception;

/**
 * 微信API处理异常
 *
 * @author alan
 */
public class WeixinException extends RuntimeException {

	public WeixinException() {
		super();
	}

	public WeixinException(String message) {
		super(message);
	}

	public WeixinException(String message, Throwable cause) {
		super(message, cause);
	}

	public WeixinException(Throwable cause) {
		super(cause);
	}
}
