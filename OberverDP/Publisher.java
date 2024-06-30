package OberverDP;

import java.util.ArrayList;
import java.util.List;


public class Publisher {

    private List<Subscriber> subscriberList;

    Publisher(){
        subscriberList = new ArrayList<>();
    }

    void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    void notify1(int newPrice){
        System.out.println("new price available");
        for(Subscriber sub: subscriberList){
            sub.notify1(newPrice);
        }
    }
}
