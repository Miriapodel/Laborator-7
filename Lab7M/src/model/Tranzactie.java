package model;

import enums.Currency;
import interfaces.ConversieCalcul;

import java.util.Objects;

public class Tranzactie extends ConversieCurrencyImpl implements Cloneable {
    private int id;
    private Payment payment;
    private Currency currency;
    private double amount;
    private int refNmb;

    public Tranzactie(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.currency = Currency.EUR;
        this.amount = conversieValutaToEur(payment.getAmount(), payment.getCurrency());

    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tranzactie that = (Tranzactie) o;
        return id == that.id && Double.compare(amount, that.amount) == 0 && Objects.equals(payment, that.payment) && currency == that.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payment, currency, amount);
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Tranzactie tranzactie = (Tranzactie) super.clone();
        tranzactie.payment = (Payment) tranzactie.payment.clone();

        return  tranzactie;
    }
}
