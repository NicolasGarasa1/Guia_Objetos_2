package Ejercicio_2.Factura;
import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDate;
import Ejercicio_2.Cliente.Cliente;
import Ejercicio_2.Items.Item_Venta;

public class Factura {
    // ATRIBUTOS
    private String Identificador;
    private double MontoTotal;
    private Cliente Cliente;
    private String Fecha_Compra;
    private ArrayList<Item_Venta> Productos_Vendidos;
    // METODOS
    public void MostrarInformacion(){
        System.out.print("\n Factura[Identificador: \""+getIdentificador()+"\". ");
        System.out.print("Fecha de compra: "+getFecha_Compra()+". ");
        System.out.print("Nombre del Cliente: \""+getCliente().getNombre()+"\". ");
        System.out.print("Mail del Cliente: \""+getCliente().getMail()+"\". ");
        System.out.print("Monto bruto: "+getMontoTotal()+". ");
        System.out.print("Monto neto: "+(getMontoTotal()-((getMontoTotal()*getCliente().getPorcentaje_Descuento())/100))+"]");
        System.out.print("\n Items:");
        for(int i=0 ; i<getProductos_Vendidos().size() ; i++){
            System.out.print("\n Id: "+getProductos_Vendidos().get(i).getId()+". ");
            System.out.print("Nombre: \""+getProductos_Vendidos().get(i).getNombre()+"\". ");
            System.out.print("Descripcion: \""+getProductos_Vendidos().get(i).getDescripcion()+"\". ");
            System.out.print("Precio unitario: "+getProductos_Vendidos().get(i).getPrecio_Unitario()+".");
        }

    }
    public void Agregar_Item_Venta(Item_Venta _NuevoItem){
        getProductos_Vendidos().add(_NuevoItem);
        setMontoTotal(getMontoTotal()+_NuevoItem.getPrecio_Unitario());
    }

    // CONSTRUCTORES
    public Factura (){
        setFecha_Compra(LocalDate.now().toString());
        setIdentificador(UUID.randomUUID().toString().toUpperCase().substring(0, 8));
        setProductos_Vendidos(new ArrayList<>());
        setMontoTotal(0);
    }
    public Factura (Cliente _Cliente){
        setFecha_Compra(LocalDate.now().toString());
        setIdentificador(UUID.randomUUID().toString().toUpperCase().substring(0, 8));
        setProductos_Vendidos(new ArrayList<>());
        setMontoTotal(0);
        setCliente(_Cliente);
    }

    // GETTERS AND SETTERS
    public String getIdentificador() {
        return Identificador;
    }
    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }
    public double getMontoTotal() {
        return MontoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        MontoTotal = montoTotal;
    }
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }
    public String getFecha_Compra() {
        return Fecha_Compra;
    }
    public void setFecha_Compra(String fecha_Compra) {
        Fecha_Compra = fecha_Compra;
    }
    public ArrayList<Item_Venta> getProductos_Vendidos() {
        return Productos_Vendidos;
    }
    public void setProductos_Vendidos(ArrayList<Item_Venta> productos_Vendidos) {
        Productos_Vendidos = productos_Vendidos;
    }
}
