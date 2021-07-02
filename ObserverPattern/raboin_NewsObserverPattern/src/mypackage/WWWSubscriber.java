package mypackage;

public class WWWSubscriber implements Observer, DisplayElement {

	private NewsPublisher newsCompany;
	String newsStory;
	
	public WWWSubscriber( NewsPublisher newsCompany) {
		this.newsCompany = newsCompany;
		newsCompany.registerObserver(this);
	}
	public void update(String newsStory) {
		this.newsStory = newsStory;

		display();
	}
	public void display() {
		System.out.println("VIA WWW: Please disregard all Email and SMS broadcasts, we have been hacked!");
	}
}
