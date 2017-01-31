package xyz.zaddrot.donation.alerts.entity;

/**
 * Created by night on 31.01.2017.
 */
public class Donation {
    private String donor;
    private String message;

    private float cash;
    private Currency currency;

    public String getDonor() {
        return donor;
    }
    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public float getCash() {
        return cash;
    }
    public void setCash(float cash) {
        this.cash = cash;
    }

    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
