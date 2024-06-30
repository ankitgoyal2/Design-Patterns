package OberverDP;

public class Handler {
    public static void main(String[] args) {
        
        Publisher publisher = new Publisher();

        Thing thing = new Thing("TV", 100);
        thing.assignPublisher(publisher);
        
        
        Subscriber subscriber1 = new Subscriber("aman");
        Subscriber subscriber2 = new Subscriber("shubham");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        thing.updatePrice(500);

    }
}
