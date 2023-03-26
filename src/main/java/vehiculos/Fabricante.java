package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int canVehiculos;
    private static ArrayList<Fabricante> listaDeFabricantes = new ArrayList<Fabricante>();


    public Fabricante(String nombre, Pais pais){
        this.nombre =nombre;
        this.pais = pais;
        listaDeFabricantes.add(this);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return this.pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getCanVehiculos() {
        return canVehiculos;
    }
    public void setCanVehiculos(int ve) {
        canVehiculos = ve;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fVendedor = null;
        int primero = 0;
        for (int i = 0; i < listaDeFabricantes.size(); i++){
            if (listaDeFabricantes.get(i).getCanVehiculos() > primero){
                fVendedor = listaDeFabricantes.get(i);
                primero = listaDeFabricantes.get(i).getCanVehiculos();
            }
        }
        return fVendedor;


    }
}





