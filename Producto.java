package excepciones;

public class Producto {
   
    private int cantidad;
    private String descripcion;
    private String nombre;
    private float valor;
   
    public Producto(String nombre, String descripcion, Integer cantidad, Float valor){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valor = valor;
    }
    
    Producto(){
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorUnitario() {
        return valor;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valor = valor;
    }
    
    public String toString(){
        return "Producto ("+nombre+","+descripcion+",Cantidad = "+cantidad+",Valor = "+valor+")";
    }
    
}
