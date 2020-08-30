package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double callRate = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double basePlan = getBasePlanFee();
        int overageMinutes = getOverageMinutes();
        double overageFee = calculateOverageFee(callRate,overageMinutes);
        double taxFee = calculateTax(taxRate,overageFee,basePlan);
        calculateTotalAndDisplay(basePlan, overageFee, taxFee);
    }

    public static double getBasePlanFee(){
        System.out.println("Enter base cost of the plan: ");
        return Double.parseDouble(scanner.nextLine());
    }
    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        return Integer.parseInt(scanner.nextLine());
    }
    public static double calculateOverageFee(double _callRate,double overageMinutes){
        return _callRate*overageMinutes;
    }

    public static double calculateTax(double _taxRate, double _overageFee, double _basePlan){
        return (_overageFee+_basePlan)*_taxRate;
    }

    public static void calculateTotalAndDisplay(double _basePlan, double _overageFee, double _taxFee){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + _basePlan);
        System.out.println("Overage: $" + _overageFee);
        System.out.println("Tax: $" + _taxFee);
        System.out.println("Total: $" + (_basePlan+_overageFee+_taxFee));
    }

}
