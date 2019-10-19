package Pos;

public class Pos implements Observer {
    private String name;
    private Subject topic;

    public Pos(String name) {
        this.name = name;
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }

    @Override
    public void update() {
        String sale = (String) topic.getUpdate(this);
        if (sale == null) {
            System.out.println(name + "     ||No new updates||      ");
        } else
            System.out.println(name + "Sale Update:   " + sale);
    }
}
