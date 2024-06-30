package OberverDP;
public class Thing {
    private String name;
    private int price;
    private Publisher publisher;

    Thing(String name, int price){
        this.name = name;
        this.price = price;
    }

    int getPrice(){
        return price;
    }

    String getName(){
        return name;
    }

    void assignPublisher(Publisher publisher){
        this.publisher = publisher;
    }

    void updatePrice(int newPrice){
        price = newPrice;
        publisher.notify1(newPrice);
    }
}
