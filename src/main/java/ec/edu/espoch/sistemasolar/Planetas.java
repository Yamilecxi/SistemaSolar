
package ec.edu.espoch.sistemasolar;

public class Planetas {
    
    //atributos
    public String nombre ;
    public int cantidadSatelites ;
    public double masaKilogramos ;
    public double volumenKilometrosCubicos ;
    public double diametroKilometros ;
    public double distanciaMedidaSol ;
    public TipoPlaneta tipoPlaneta ;
    
    //metodos y crear 2 objetos
   
    //impimir atributos
    public void imprimirPlanetas(){
        System.out.println("nombre:"+nombre);
        System.out.println("satelites:"+cantidadSatelites);
        System.out.println("masa:"+masaKilogramos);
        System.out.println("volumen:"+volumenKilometrosCubicos);
        System.out.println("diametro:"+diametroKilometros);
        System.out.println("distancia media al sol:"+distanciaMedidaSol);
        System.out.println("tipo planeta:"+tipoPlaneta);
    //calcular densidad del planeta
    }
    public double calcularDensidadPlaneta(){
        return masaKilogramos / volumenKilometrosCubicos;
    }
    //determinar si un planeta del sistema solar se considera exterior
    
     public boolean exterior (){
     double distancia=149597870;
     boolean exterior;     
     double limiteSuperior=3.4*distancia;
     double limiteInferior=2.1*distancia;
     if (distanciaMedidaSol >= limiteInferior && distanciaMedidaSol<= limiteSuperior){
         exterior=true;
     }else{
         exterior=false;
     }
         return exterior;
     }
    //imprimir densidad de cada planeta y si es exterior
    public void imprimirInformacionPlaneta(){
    imprimirPlanetas(); 
    System.out.println("Densidad del planeta: " + calcularDensidadPlaneta());
    
    if (exterior()) {
        System.out.println("El planeta es exterior al cinturón de asteroides.");
    } else {
        System.out.println("El planeta no es exterior al cinturón de asteroides.");
    }
    }
}
