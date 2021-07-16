import java.util.Date;

public class TransactionReelle extends Transaction{

    private double montant;
    private Date date;

    public TransactionReelle(String type, String categorie, Date date, double montant) {
        super(type, categorie);
        this.date = date;
        this.montant = montant;
    }

    public double calculerDifference (TransactionPrevu transactionPrevu) {
        double difference = 0.0;

        if (transactionPrevu.montant > 0) {
            difference = this.montant - transactionPrevu.montant;
        }
        return difference;

    }

    public boolean isAbovePrevu (TransactionPrevu transactionPrevu) {
        boolean above = false;
        double difference = calculerDifference(transactionPrevu);
        if (difference > 0) {
            above = true;
        }
        return above;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }
}
