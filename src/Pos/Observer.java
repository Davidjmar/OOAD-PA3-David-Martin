package Pos;

public interface Observer {

    // update the observer on sales --> used by subject
    public void update();

    // attach pos to observe sales
    public void setSubject(Subject sub);
}
