import java.util.Date;

public class Periode {

    private static int numero = 1;
    private Date dateDebut;
    private Date dateFin;

    public Periode (Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        numero++;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public static void setNumero(int numero) {
        Periode.numero = numero;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public static int getNumero() {
        return numero;
    }
}
