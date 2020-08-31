package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculatorRedo.getRoom();
        Rectangle bathroom = calculatorRedo.getRoom();
        double area = calculatorRedo.calculateTotalArea(kitchen,bathroom);
        System.out.println("Total area is : "+ area);
        calculatorRedo.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

}
