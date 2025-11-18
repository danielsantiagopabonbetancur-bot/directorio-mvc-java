package modelo;

public class Producto {

    private String nombre;
    private String sku;
    private int cantidad;
    private double precio;
    private String color;

    public Producto(String nombre, String sku, int cantidad, double precio, String color) {
        this.nombre = nombre;
        this.sku = sku;
        this.cantidad = cantidad;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setColor(double precio) {
        this.precio = precio;
    }

     public String getColor() {
        return color;
    }

    public void setPrecio(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SKU: " + sku + " | Nombre: " + nombre +
               " | Cantidad: " + cantidad + " | Precio: $" + precio + "Color: "+ color;
    }
}

