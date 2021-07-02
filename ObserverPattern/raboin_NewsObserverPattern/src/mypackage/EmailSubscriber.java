package mypackage;

public class EmailSubscriber implements Observer, DisplayElement {

	private NewsPublisher newsCompany;
	String newsStory;
	
	public EmailSubscriber( NewsPublisher newsCompany) {
		this.newsCompany = newsCompany;
		newsCompany.registerObserver(this);
	}
	public void update(String newsStory) {
		this.newsStory = newsStory;

		display();
	}
	public void display() {
		System.out.println("VIA EMAIL: The 50 US States are now recreating the Hunger Games...");
	}
}
