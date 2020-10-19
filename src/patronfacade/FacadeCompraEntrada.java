package patronfacade;

/**
 *La clase FacadeCompraEntrada actua como fachada 
 * para la compra de de dos entradas para la pelicula de los vengadores
 * en el Multicine, tambien nos permite cancelar la compra de la mencionada pelicula
 * La clase FacadeCompraEntrada es la unica que interactua con la clase CompraEntrada
 */
public class FacadeCompraEntrada {
    private CompraEntrada ce;

    public FacadeCompraEntrada() {
        super();
        ce=new CompraEntrada();
        ce.setCantidad_entradas(2);
        ce.setNombre_cine("Multicine");
        ce.setNombre_pelicula("Vengadores");
        ce.setPrecio_entrada(64.99);
    }
    
    public void comprar_entrada_par_taquillera(){
        ce.comprar_entrada();
    }
    public void cancelar_entrada_par_taquillera(){
        ce.cancelar_compra();
    }
}
