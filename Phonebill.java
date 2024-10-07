package Chapter6Objects;

public class Phonebill {

    private int id;
    private double basecost;
    private int allotedminutes;
    private int minutesused;

    //default constructor
    public Phonebill(){
        id =0;
        basecost = 90;
        allotedminutes = 40;
        minutesused = 100;
    }
    public Phonebill(int id){
        this.id = id;
        basecost = 90;
        allotedminutes = 40;
        minutesused = 9;
    }
    public Phonebill(int id, double basecost, int allotedminutes, int minutesused){
        this.id = id;
        this.basecost = basecost;
        this.allotedminutes = allotedminutes;
        this.minutesused = minutesused;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBasecost(){
        return basecost;
    }
    public void setBasecost(double basecost){
        this.basecost = basecost;
    }
    public int getAllotedminutes(){
        return allotedminutes;
    }
    public void setAllotedminutes(int allotedminutes){
        this.allotedminutes = allotedminutes;
    }
    public int getMinutesused(){
        return minutesused;
    }
    public void setMinutesused(int minutesused){
        this.minutesused = minutesused;
    }


    public double calculateOverage(){
        if(minutesused > allotedminutes){
            double overageRate = 0.25;
            double overageMinutes = overageRate * (minutesused - allotedminutes);
            return overageMinutes;

        }
        return 0;
    }
    public double calculateTax(){
        double taxRate = 0.15;
        double taxamount =  taxRate * (basecost + calculateOverage());
        return taxamount;
    }

    public double calculateTotal(){
        double totalcost = basecost + calculateOverage() + calculateTax();
        return totalcost;
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + basecost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }

}
