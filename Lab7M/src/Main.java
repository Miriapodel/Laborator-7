import enums.Currency;
import model.Payment;
import model.Tranzactie;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Tranzactie> tranzactii = new ArrayList<>();

        User marcel = new User("Popescu", "Marcel", "123456789");
        User aurel = new User("Georgescu", "Aurel", "987654321");

        Payment p1 = new Payment(100, Currency.EUR, marcel, "aaaa");
        Payment p2 = new Payment(250, Currency.USD, aurel, "bbbb");
        Payment p3 = new Payment(300, Currency.RON, marcel, "cccc");
        Payment p4 = new Payment(150, Currency.GBP, marcel, "dddd");
        Payment p5 = new Payment(200, Currency.TRY, aurel, "eeee");
        Payment p6 = new Payment(200, Currency.RON, aurel, "fffff");

        Tranzactie t1 = new Tranzactie(1, p1);
        Tranzactie t2 = new Tranzactie(2, p2);
        Tranzactie t3 = new Tranzactie(3, p3);
        Tranzactie t4 = new Tranzactie(4, p4);
        Tranzactie t5 = new Tranzactie(5, p5);

        tranzactii.add(new Tranzactie(1, p1));
        tranzactii.add(new Tranzactie(2, p2));
        tranzactii.add(new Tranzactie(3, p3));
        tranzactii.add(new Tranzactie(4, p4));
        tranzactii.add(new Tranzactie(5, p5));
        tranzactii.add(new Tranzactie(6, p6));

        System.out.println("Inainte si dupa stornare:");

        Tranzactie storn1 = (Tranzactie) tranzactii.get(0).clone();
        storn1.getPayment().setAmount(storn1.getPayment().getAmount() * -1);
        storn1.setAmount(storn1.getAmount() * -1);

        System.out.println(tranzactii.get(0));
        System.out.println(storn1);
        System.out.println();

        Tranzactie storn2 = (Tranzactie) tranzactii.get(3).clone();
        storn2.getPayment().setAmount(storn2.getPayment().getAmount() * -1);
        storn2.setAmount(storn2.getAmount() * -1);

        System.out.println(tranzactii.get(3));
        System.out.println(storn2);
        System.out.println();

        System.out.println("Lista tarilor/zonelor pentru care s-au facut plati:");
        for (Tranzactie t : tranzactii) {
            System.out.println(t.getPayment().getCurrency().getTara());
        }

        System.out.println();

        System.out.println("Tranzactiile facute de Marcel:");
        for (Tranzactie t : tranzactii) {
            if (t.getPayment().getUser().getPrenume().equals("Marcel")) {
                System.out.println(t);
            }
        }




    }
}