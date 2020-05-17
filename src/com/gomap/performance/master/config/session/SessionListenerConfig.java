package com.gomap.performance.master.config.session;

import java.util.ResourceBundle;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.gomap.performance.master.constant.AppConstants;

/**
 * @author 1056082
 * Session time out settings config
 */
@WebListener
public class SessionListenerConfig implements HttpSessionListener {

	//private static ResourceBundle userMsgBundle =  ResourceBundle.getBundle(AppConstants.APP_PROPERTY_FILE_NAME);

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		//int timoutInMinute = Integer.parseInt(userMsgBundle.getString(AppConstants.APP_SESSION_TIMEOUT));
		//event.getSession().setMaxInactiveInterval(timoutInMinute * 60);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		event.getSession().invalidate();
	}

}
