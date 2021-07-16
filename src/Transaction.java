import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    private static String[] TYPES = {
            "DEPENSE",
            "REVENUE"
    };
    public static ArrayList<String> categoriesDepenses = new ArrayList<String>();
    public static ArrayList<String> categoriesRevenues = new ArrayList<String>();

    public String type;
    private String categorie;


    public Transaction (String type, String categorie) {
        this.type = type;
        this.categorie = categorie;

    }

    public void ajouterCategorieDepense(String categorie) {
        if (!categoriesDepenses.contains(categorie)) {
            categoriesDepenses.add(categorie);
        }
    }

    public void ajouterCategorieRevenue(String categorie) {
        if (!categoriesRevenues.contains(categorie)) {
            categoriesRevenues.add(categorie);
        }
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCategorie() {
        return categorie;
    }
}
