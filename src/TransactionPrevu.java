import java.util.Date;

public class TransactionPrevu extends Transaction {

    public double montant;
    private Periode periode;

    public TransactionPrevu(String type, String categorie, Periode periode, double montant, boolean annuelle) {
        super(type, categorie);
        if (!annuelle) {
            this.periode = periode;
        } else
            this.periode = null;
        this.montant = montant;
    }

    public double evaluationPourcentage(double totalDepense) {
        double pourcentage = 0.0;

        if (this.type.equals("DEPENSE") & totalDepense != 0) {
            pourcentage = this.montant/totalDepense;
        }
        return pourcentage;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }

    public double getMontant() {
        return montant;
    }

    public Periode getPeriode() {
        return periode;
    }
}
