public class ProductoImportado extends ItemFacturable {
    public ProductoImportado(String nombre, double precio) { super(nombre, precio); }
    public double calcularImpuesto() { return precioBase * 0.21; }
}
