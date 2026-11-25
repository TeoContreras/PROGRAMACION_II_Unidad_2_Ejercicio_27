public class AlimentoBasico extends ItemFacturable {
    public AlimentoBasico(String nombre, double precio) { super(nombre, precio); }
    public double calcularImpuesto() { return precioBase * 0.05; }
}
