public abstract class ItemFacturable {
    protected String nombre;
    protected double precioBase;
    public ItemFacturable(String nombre, double precioBase) { this.nombre = nombre; this.precioBase = precioBase; }
    public abstract double calcularImpuesto();
    public double calcularPrecioFinal() { return precioBase + calcularImpuesto(); }
    public void mostrar() { System.out.println(nombre + " - Base: $" + precioBase + " - Impuesto: $" + calcularImpuesto() + " - Total: $" + calcularPrecioFinal()); }
}
