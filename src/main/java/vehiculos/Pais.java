package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int canVehiculos;
    private static ArrayList<Pais> listaDePaises = new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre = nombre;
        listaDePaises.add(this);
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanVehiculos() {
        return canVehiculos;
    }
    public void setCanVehiculos(int v) {
        canVehiculos = v;
    }


    public static Pais paisMasVendedor(){
       Pais masVendedor = null;
       int primero = 0;
       for(int i = 0; i < listaDePaises.size();i++){
           if (listaDePaises.get(i).getCanVehiculos() > primero){
               masVendedor = listaDePaises.get(i);
               primero = listaDePaises.get(i).getCanVehiculos();
           }
       }
       return masVendedor;
       }



    }
