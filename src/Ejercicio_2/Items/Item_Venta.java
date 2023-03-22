package Ejercicio_2.Items;
public class Item_Venta {
    // ATRIBUTOS
    private int Id;
    private String Nombre;
    private String Descripcion;
    private double Precio_Unitario;
    private static int Contador_Items = 0;
    // METODOS
    public void MostrarInformacion(){
        System.out.print("\n Item[Id: "+getId()+". ");
        System.out.print("Nombre: \""+getNombre()+"\". ");
        System.out.print("Descripcion: \""+getDescripcion()+"\". ");
        System.out.print("Precio unitario: "+getPrecio_Unitario()+"]");
    }

    // CONSTRUCTORES
    public Item_Venta(){
        setId(getContador_Items());
        setContador_Items(getContador_Items()+1);
    }
    public Item_Venta(String _Nombre, String _Descripcion, double _Precio_Unitario){
        if (_Precio_Unitario<0){
            System.out.println(" El precio unitario no puede ser menor que 0. Sera seteado en 1.");
            setPrecio_Unitario(1);
        }
        else{
            setPrecio_Unitario(_Precio_Unitario);
        }
        setNombre(_Nombre);
        setDescripcion(_Descripcion);
        setId(getContador_Items());
        setContador_Items(getContador_Items()+1);
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
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public double getPrecio_Unitario() {
        return Precio_Unitario;
    }
    public void setPrecio_Unitario(double precio_Unitario) {
        Precio_Unitario = precio_Unitario;
    }
    public static int getContador_Items() {
        return Contador_Items;
    }
    private static void setContador_Items(int contador_Items) {
        Contador_Items = contador_Items;
    }
}
