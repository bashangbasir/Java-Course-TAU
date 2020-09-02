package chapter6;

public class PhoneBill {
    public int id;
    double baseFee;
    int allottedMinutes;
    int minutesUsed;
    double overageRate = 0.25;
    double taxRate = 0.15;

    public PhoneBill(){
        this.id = 0;
        this.baseFee = 50;
        this.allottedMinutes = 600;
        this.minutesUsed = 600;
    }

    public PhoneBill(int id){
        this.id = id;
        this.baseFee = 50;
        this.allottedMinutes = 600;
        this.minutesUsed = 600;
    }

    public PhoneBill(int id, double baseFee, int allottedMinutes, int minutesUsed){
       this.id = id;
       this.baseFee = baseFee;
       this.allottedMinutes = allottedMinutes;
       this.minutesUsed = minutesUsed;
    }

    //getter method for attributes
    //getter baseFee
    public double getBaseFee(){
        return baseFee;
    }
    //getter allottedMinutes
    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    //getter minutesUsed
    public int getMinutesUsed(){
        return minutesUsed;
    }
    //getter id
    public int getId(){
        return id;
    }

    //setter method for attributes
    //setter baseFee
    public void setBaseFee(double baseFee){
        this.baseFee = baseFee;
    }
    //setter allottedMinutes
    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    //setter minutesUsed
    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }
    //setter id
    public void setId(int id){
        this.id = id;
    }

    public double calculateOverageFee(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }
        double overageMinutes = minutesUsed-allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTaxFee(){
        return taxRate * (getBaseFee() + calculateOverageFee());
    }

    public double calculateTotalFee(){
        return calculateOverageFee() + calculateTaxFee() + getBaseFee();
    }

    public void printItemizedBill(){
        System.out.println("ID :" + getId());
        System.out.println("Base Fees: $" + getBaseFee());
        System.out.println("Overage Fees : $" + calculateOverageFee());
        System.out.println("Tax Fees : $" + calculateTaxFee());
        System.out.println("Total Fees : $" + calculateTotalFee());
    }






}
