public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto(
            1,
            "P001",
            "Arroz",
            4.50,
            20,
            5
        );

        System.out.println(producto);

        producto.aumentarStock(10);

        System.out.println("Stock actualizado: " + producto.getStock());
    }
}

public class Producto {

    private int id;
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private int stockMinimo;

    // Constructor
    public Producto(int id, String codigo, String nombre,
                    double precio, int stock, int stockMinimo) {

        if (precio < 0 || stock < 0 || stockMinimo < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos.");
        }

        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
    }

    // Métodos para controlar el stock
    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        stock += cantidad;
    }

    public void disminuirStock(int cantidad) {
        if (cantidad <= 0 || cantidad > stock) {
            throw new IllegalArgumentException("Cantidad de stock no válida.");
        }
        stock -= cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo < 0) {
            throw new IllegalArgumentException("El stock mínimo no puede ser negativo.");
        }
        this.stockMinimo = stockMinimo;
    }
}
