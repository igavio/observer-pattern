public interface Observable {

    public void registerObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();

}
