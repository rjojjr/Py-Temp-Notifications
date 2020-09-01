package com.github.rjojjr91.pytemp.notifications.rest;
import java.util.*;

@Data
@AllArgsConstructor
public class ApiNotificationsResponse {

	private List<Notification> notifications;

	@Data
	@AllArgsConstructor
	public class Notification {
		
		private String uuid;
		private String generatedTime;
		private String recipients;
		private String message;
		
	}
}
