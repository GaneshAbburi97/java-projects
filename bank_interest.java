class bank {
    void interest(int amount) {
        System.out.println("Interest: " + (amount * 5 / 100));
    }

    void interest(int amount, int rate) {
        System.out.println("Interest: " + (amount * rate / 100));
    }

    void display() {
        System.out.println("Bank Info");
    }
}
class SBI extends bank {
    @Override    
    void display() {
        System.out.println("SBI Bank");
    }
}

public class bank_interest {
    public static void main(String[] args) {

        bank b = new SBI();

        b.interest(1000);          
        b.interest(1000, 7);      

        b.display();               
    }
}
