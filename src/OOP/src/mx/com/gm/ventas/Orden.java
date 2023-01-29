package mx.com.gm.ventas;

public class Orden {
    private final int idOrden;

    private Producto[] productos;
    private int cantidadProductosAgregados;
    private static int contadorOrdenes;
    final static int MAX_PRODUCTOS = 10;



    public Orden() {
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    {
       idOrden = ++Orden.contadorOrdenes;
    }


    public void agregarProducto(Producto producto) {

        if (producto != null && this.cantidadProductosAgregados < Orden.MAX_PRODUCTOS) {
            this.productos[this.cantidadProductosAgregados++] = producto;
        } else {
            System.out.printf("Se ha superado el máximo de productos permitidos: %d\n", Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto: productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("idOrden = " + this.idOrden + " Total de Orden $: " + this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (Producto producto: productos) {
            if (producto != null) {
                System.out.println(producto);
            }

        }
    }

}
