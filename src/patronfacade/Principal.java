package patronfacade;

/**
 *En la funcion principal gracias a la clase FacadeCompraEntrada 
 * podemos comprar dos entradas para la pelicula mas taquillera(Vengadores)
 * podemos cancelar la compra si descomentamos la linea 15
 * 
 */
public class Principal {

    public static void main(String[] args) {
        
        FacadeCompraEntrada tienda=new FacadeCompraEntrada();
        tienda.comprar_entrada_par_taquillera();
        //tienda.cancelar_entrada_par_taquillera();
        
    } 
}
