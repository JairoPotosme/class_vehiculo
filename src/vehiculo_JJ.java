
public class App{  
    public static void main(String[] argst )throws Exception {
        System.out.println("hello world");
  

        //crear instancia de cada tipo de vehiculo

        auto Auto = new auto(marca:"Toyota", modelo:"Corolla", año:"2020", kilometraje:"15000",numPasajeros:"5", tipoCombustible:"Gasolina");

        camion Camion= new camion(marca:"Volvo", modelo:"FH", año:"2019", kilometraje:"75000", capacidadCarga:"20000",numPasajeros: "4");
    
        System.out.println("informacion del auto: ");
        Auto.mostrarinfo();

        System.out.println("informacion del camion: ");
        Camion.mostrarinfo();
        
    }

    

}


