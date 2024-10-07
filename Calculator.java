package Chapter6Objects;

public class Calculator {
    public static void main(String args[]){
        Phonebill bill = new Phonebill(1, 90, 800, 1200);
        //bill.setMinutesused(1000);
        bill.printItemizedBill();
    }
}
