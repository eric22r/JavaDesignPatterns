package mypackage;

public class NewsStation {
	public static void main(String[] args) {
		BusinessNews newsAlerts = new BusinessNews();
		
		EmailSubscriber emailSub = new EmailSubscriber(newsAlerts);
		SMSSubscriber SMSSub = new SMSSubscriber(newsAlerts);
		WWWSubscriber WWWSub = new WWWSubscriber(newsAlerts);
		
		newsAlerts.setNews("This just in...the president has been shot!");
	}
}
