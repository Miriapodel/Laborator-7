package model;

import enums.Currency;
import interfaces.ConversieCalcul;

public class ConversieCurrencyImpl implements ConversieCalcul {
    @Override
    public double conversieValutaToEur(double val, Currency currency) {
        switch (currency){
            case EUR:
                return val;
            case USD:
                return val * 1.19;
            case RON:
                return val * 4.92;
            case GBP:
                return val * 0.86;
            default:
                return 0;

        }
    }
    @Override
    public double calculRata() {
        return 0;
    }
}
