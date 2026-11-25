import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<ItemFacturable> items = new ArrayList<ItemFacturable>();
        items.add(new ProductoImportado("Auriculares", 50000));
        items.add(new ServicioProfesional("Consulta", 20000));
        items.add(new AlimentoBasico("Leche", 1500));
        for (ItemFacturable item : items) item.mostrar();
    }
}
