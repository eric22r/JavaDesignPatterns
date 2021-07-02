package mypackage;

public class SMSSubscriber implements Observer, DisplayElement {

	private NewsPublisher newsCompany;
	String newsStory;
	
	public SMSSubscriber( NewsPublisher newsCompany) {
		this.newsCompany = newsCompany;
		newsCompany.registerObserver(this);
	}
	public void update(String newsStory) {
		this.newsStory = newsStory;

		display();
	}
	public void display() {
		System.out.println("VIA SMS: ...The Administration said 'Well, they said we couldn't make 2020 worse.'");
	}
}
