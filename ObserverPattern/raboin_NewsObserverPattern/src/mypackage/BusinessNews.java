package mypackage;

import java.util.ArrayList;

public class BusinessNews implements NewsPublisher {
	private ArrayList observers;
	private String story;
	
	public BusinessNews()
	{
		observers = new ArrayList();
	}
	public void registerObserver( Observer o)
	{
		observers.add(o);
	}
	public void removeObserver( Observer o)
	{
		int i = observers.indexOf(o);
		if(i >= 0)
		{
			observers.remove(i);
		}
	}
	public void notifyObservers()
	{
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(story);
		}
	}
	public void newsChanged() {
		notifyObservers();
	}
	public void setNews(String _newsStory) {
		story = _newsStory;
		newsChanged();
	}
}
