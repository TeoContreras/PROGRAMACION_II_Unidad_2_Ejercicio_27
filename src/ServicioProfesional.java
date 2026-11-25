public class ServicioProfesional extends ItemFacturable {
    public ServicioProfesional(String nombre, double precio) { super(nombre, precio); }
    public double calcularImpuesto() { return precioBase * 0.10; }
}
