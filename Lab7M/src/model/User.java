package model;

import java.util.Objects;

public class User {
    private String nume;
    private String prenume;
    private String iban;

    public User(String nume, String prenume, String iban) {
        this.nume = nume;
        this.prenume = prenume;
        this.iban = iban;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nume, user.nume) && Objects.equals(prenume, user.prenume) && Objects.equals(iban, user.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, iban);
    }

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
