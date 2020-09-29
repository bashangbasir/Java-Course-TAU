package chapter9;

public class TasteTester {

    public static void main(String[] args) {
        //test Cake class
        Cake cake = new Cake("chocolate");
        cake.setPrice(19.00);
        System.out.println("Cake flavor : " + cake.getFlavor());
        System.out.println("Cake price : "+ cake.getPrice());

        //test BirthdayCake class
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(25.99);
        birthdayCake.setCandles(27);
        System.out.println("Birthday cake flavor : " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price : "+ birthdayCake.getPrice());
        System.out.println("Birthday cake candle amount : " + birthdayCake.getCandles());

        //test WeddingCake class
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(199.99);
        weddingCake.setTiers(5);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
        System.out.println("Wedding cake tier : " + weddingCake.getTiers());

    }
}
