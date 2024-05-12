/** This is the Subject interface of the Observer design pattern */
public interface Subject {

    void addObserver(Observer observer); // add new Observer to the Subject class
    void removeObserver(Observer observer);// remove Observer from the Subject class
    void notifyObservers();// notify all observers of the Subject class
}