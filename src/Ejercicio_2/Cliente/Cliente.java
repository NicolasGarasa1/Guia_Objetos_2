package Ejercicio_2.Cliente;
import java.util.UUID;
public class Cliente {
    // ATRIBUTOS
    private String Identificador;
    private String Nombre;
    private String Mail;
    private int Porcentaje_Descuento;
    // METODOS
    public void MostrarInformacion(){
        System.out.print("\n Cliente[Nombre: \""+getNombre()+"\". Mail: \""+getMail()+"\". Porcentaje de descuento: "+getPorcentaje_Descuento()+". Identificador: \""+getIdentificador()+"\"]");
    }

    // CONSTRUCTORES
    public Cliente(){
        setIdentificador(UUID.randomUUID().toString().toUpperCase().substring(0, 8));
    }
    public Cliente(String _Nombre, int _Porcentaje_Descuento, String _Mail){
        if (_Porcentaje_Descuento>100 || _Porcentaje_Descuento<0){
            System.out.print("\n No puede haber descuentos fuera del rango: 0<=Descuento<=100. El descuento sera seteado en 0.");
            setPorcentaje_Descuento(0);
        }
        else{
            setPorcentaje_Descuento(_Porcentaje_Descuento);
        }
        setIdentificador(UUID.randomUUID().toString().toUpperCase().substring(0, 8));
        setNombre(_Nombre);
        setMail(_Mail);
    }

    // GETTERS AND SETTERS
    public String getIdentificador() {
        return Identificador;
    }
    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getPorcentaje_Descuento() {
        return Porcentaje_Descuento;
    }
    public void setPorcentaje_Descuento(int porcentaje_Descuento) {
        Porcentaje_Descuento = porcentaje_Descuento;
    }
    public String getMail() {
        return Mail;
    }
    public void setMail(String mail) {
        Mail = mail;
    }
}
