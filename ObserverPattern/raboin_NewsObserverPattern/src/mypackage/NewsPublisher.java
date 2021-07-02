package mypackage;

public interface NewsPublisher {
	public void registerObserver ( Observer o);
	public void removeObserver ( Observer o);
	public void notifyObservers();
	public void newsChanged();
}
