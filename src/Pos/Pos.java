package Pos;

// TODO: BUILD OUT OBSERVER PATTERN

// public interface Subject {

// // methods to register and unregister observers
// public void register(Observer obj);

// public void unregister(Observer obj);

// // method to notify observers of change
// public void notifyObservers();

// // method to get updates from subject
// public Object getUpdate(Observer obj);
// }

// // The Point of sale will function as an observer to the events (i.e.
// // rentals/returns, customers, and inventory status)

// // THIS IS GOING TO BE THE Pos
// public interface Observer {

// // method to update the observer, used by subject
// public void update();

// // attach with subject to observe
// public void setSubject(Subject sub);
// }

// public class Day implements Subject {

// private String dayNumber;
// private List<Observer> observers;
// private boolean changed;
// private final Object MUTEX = new Object();

// public Day() {
// this.observers = new ArrayList<>();
// }

// @Override
// public void register(Observer obj) {
// if (obj == null)
// throw new NullPointerException("Null Observer");
// synchronized (MUTEX) {
// if (!observers.contains(obj))
// observers.add(obj);
// }
// }

// @Override
// public void unregister(Observer obj) {
// synchronized (MUTEX) {
// observers.remove(obj);
// }
// }

// @Override
// public void notifyObservers() {
// List<Observer> observersLocal = null;
// // synchronization is used to make sure any observer registered after message
// is
// // received is not notified
// synchronized (MUTEX) {
// if (!changed)
// return;
// observersLocal = new ArrayList<>(this.observers);
// this.changed = false;
// }
// for (Observer obj : observersLocal) {
// obj.update();
// }
// }

// @Override
// public Object getUpdate(Observer obj) {
// // return the rentals of the day here so call --> getRentals()
// return this.message;
// }

// // method to post message to the Day
// public void postMessage(String msg) {
// System.out.println("Message Posted to Topic:" + msg);
// this.message = msg;
// this.changed = true;
// notifyObservers();
// }

// }

// References https://www.journaldev.com/1739/observer-design-pattern-in-java
// https://www.cs.colorado.edu/~kena/classes/6448/f07/lectures/20/20-ObserverDecorator.pdf
