package OberverDP;

public class Subscriber {
    private String name;
    Subscriber(String name){
        this.name = name;
    }

    void notify1(int newPrice){
        System.out.println("notified by publisher. New Price is "+ newPrice);
    }
}
