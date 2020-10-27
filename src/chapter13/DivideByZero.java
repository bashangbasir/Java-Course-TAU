package chapter13;

public class DivideByZero {

    public static void main(String[] args) {
        try{
            int c = 30/0;
        }catch (Exception e){
            System.out.println("Cannot divide by zero.");
            e.printStackTrace();
        }finally {
            System.out.println("Division is fun");
        }
    }
}
