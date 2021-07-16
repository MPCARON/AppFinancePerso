import java.util.Date;

public class Application {

    private int annee;

    public Application(int annee) {
        this.annee = annee;
    }


    public void creerPeriode (Date dateDebut, Date dateFin) {
        Periode periode;
            periode = new Periode(dateDebut, dateFin);
    }

    public void calculerMontantAnnuel(String Categorie) {

    }
}
