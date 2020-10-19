package patronfacade;


public class CompraEntrada {
    private String nombre_cine;
    private String nombre_pelicula;
    private int cantidad_entradas;
    private double precio_entrada;

    public CompraEntrada()
    {
       
    }
    public String getNombre_cine() {
        return nombre_cine;
    }

    public void setNombre_cine(String nombre_cine) {
        this.nombre_cine = nombre_cine;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }
    
    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public int getCantidad_entradas() {
        return cantidad_entradas;
    }

    public void setCantidad_entradas(int cantidad_entradas) {
        this.cantidad_entradas = cantidad_entradas;
    }

    public double getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(double precio_entrada) {
        this.precio_entrada = precio_entrada;
    }
    
    public void comprar_entrada(){
        System.out.println("***************************************************************");
        System.out.println("Felicidades por adquirir su entrada en el cine "+nombre_cine);
        System.out.println("Pelicula: "+nombre_pelicula);
        System.out.println("Cantidad de entradas: "+cantidad_entradas);
        System.out.println("Costo: "+(cantidad_entradas*precio_entrada));
        System.out.println("***************************************************************");
    }
    public void cancelar_compra(){
        System.out.println("***************************************************************");
        System.out.println("Usted cancelo su compra para la pelicula "+nombre_pelicula);
        System.out.println("Cine: "+nombre_cine);
        System.out.println("Reembolso: "+(cantidad_entradas*precio_entrada));
        System.out.println("***************************************************************");
    }
}
