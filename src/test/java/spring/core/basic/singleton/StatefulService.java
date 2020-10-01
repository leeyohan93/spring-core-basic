package spring.core.basic.singleton;

public class StatefulService {

//    private int price; // 상태를 유지하는 필드

    public int order(String name, int price){
//        this.price = price;
        return price;
    }
}
