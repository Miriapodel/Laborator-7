package enums;

public enum Currency {
    RON("Romania", "RO"),
    EUR("Uniunea Europeana", "EU"),
    USD("Statele Unite ale Americii", "US"),
    GBP("Marea Britanie", "GB"),
    TRY("Turcia", "TR");

    private final String tara;
    private final String codTara;

    Currency(String tara, String codTara) {
        this.tara = tara;
        this.codTara = codTara;
    }

    public String getTara() {
        return tara;
    }

    public String getCodTara() {
        return codTara;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "tara='" + tara + '\'' +
                ", codTara='" + codTara + '\'' +
                '}';
    }


}
