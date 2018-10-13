package com.github.sd4324530.fastweixin.company.message.req;

/**
 * 微信企业号进入应用事件消息
 *
 * @author Alan
 * @version 1.0.beta
 * @since 1.3.6
 */
public class QYEnterAgentEvent extends QYMenuEvent {

	public QYEnterAgentEvent() {
		super("");
	}

	@Override
	public String toString() {
		return "QYMenuEvent [eventKey=" + getEventKey()
				+ ", toUserName=" + toUserName + ", fromUserName="
				+ fromUserName + ", createTime=" + createTime + ", msgType="
				+ msgType + ", event=" + event + ", agentId=" + agentId + "]";
	}
}
