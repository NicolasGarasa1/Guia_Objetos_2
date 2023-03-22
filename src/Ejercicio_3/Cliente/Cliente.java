package Ejercicio_3.Cliente;

public class Cliente {
    // ATRIBUTOS
    private int Id;
    private String Nombre;
    private boolean Genero; // 0 MASCULINO // 1 FEMENINO
    private static int Contador=0;

    // METODOS
    public void MostrarInformacion(){
        System.out.print("\n Cliente[Id: "+getId()+". Nombre: \""+getNombre()+"\". Genero: ");
        if (isGenero()){
            System.out.print("Femenino]");
        }
        else{
            System.out.print("Masculino]");
        }
    }

    // CONSTRUCTORES
    public Cliente(){
        setId(getContador());
        setContador(getContador()+1);
    }
    public Cliente(String _Nombre, boolean _Genero){
        setId(getContador());
        setContador(getContador()+1);
        setNombre(_Nombre);
        setGenero(_Genero);
    }

    // GETTERS AND SETTERS
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public boolean isGenero() {
        return Genero;
    }
    public void setGenero(boolean genero) {
        Genero = genero;
    }
    public static int getContador() {
        return Contador;
    }
    private static void setContador(int contador) {
        Contador = contador;
    }
}
