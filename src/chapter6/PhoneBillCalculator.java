package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args) {

        PhoneBill pb1 = new PhoneBill();
        pb1.setId(139994047);
        pb1.setAllottedMinutes(500);
        pb1.setMinutesUsed(600);
        pb1.setBaseFee(49.99);
        pb1.printItemizedBill();

        System.out.println("------------------------");
        PhoneBill pb2 = new PhoneBill(138884923);
        pb2.setAllottedMinutes(500);
        pb2.setMinutesUsed(600);
        pb2.setBaseFee(49.99);
        pb2.printItemizedBill();

        System.out.println("------------------------");
        PhoneBill pb3 = new PhoneBill(1344445782,49.99,400,500);
        pb3.printItemizedBill();
    }
}
