
package ec.edu.espoch.sistemasolar;

public class SistemaSolar {

    public static void main(String[] args) {
        Planetas planetaUno= new Planetas ();
        planetaUno.nombre="Tierra";
        planetaUno.cantidadSatelites=8;
        planetaUno.masaKilogramos=5.8;
        planetaUno.volumenKilometrosCubicos=8.5;
        planetaUno.diametroKilometros=6568;
        planetaUno.distanciaMedidaSol=485;
        planetaUno.tipoPlaneta= TipoPlaneta.TERRESTRE;
        
        planetaUno.imprimirPlanetas();
        
        Planetas planetaDos= new Planetas ();
        planetaDos.nombre="Marte";
        planetaDos.cantidadSatelites=2;
        planetaDos.masaKilogramos=9.8;
        planetaDos.volumenKilometrosCubicos=7.5;
        planetaDos.diametroKilometros=7598;
        planetaDos.distanciaMedidaSol=125;
        planetaDos.tipoPlaneta= TipoPlaneta.TERRESTRE;
        
        planetaDos.imprimirPlanetas();
    }
}
