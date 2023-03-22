package Ejercicio_3.CuentaBancaria;
import Ejercicio_3.Cliente.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CuentaBancaria {
    // ATRIBUTOS
    private int Id;
    private double Balance;
    private Cliente Cliente;
    private static int Contador;

    // METODOS
    public void MostrarInformacion(){
        System.out.print("Cuenta[Id: "+getId()+". Balance: "+getBalance()+"]\n Informacion del Cliente:");
        getCliente().MostrarInformacion();
    }
    public void Depositar(double _Depositar) throws IOException {
        setBalance(getBalance()+_Depositar);
        EscribirArchivo("Cuenta Bancaria[Id:"+getId()+"] Deposito:"+_Depositar+". Nuevo Balance:"+getBalance()+".");
    }
    public void Extraer(double _Extraer) throws IOException {
        if ((getBalance()+2000)<_Extraer){
            System.out.print("\n El monto a extraer supera el saldo y saldo descubierto de la cuenta.");
        }
        else {
            setBalance(getBalance()-_Extraer);
            EscribirArchivo("Cuenta Bancaria[Id:"+getId()+"] Extraccion:"+_Extraer+". Nuevo Balance:"+getBalance()+".");
        }
    }
    private void EscribirArchivo(String _Mensaje) throws IOException {
        FileWriter Archivo = null;
        PrintWriter Escritor = null;
        try{
            Archivo = new FileWriter("C:\\Users\\Nicolas\\IdeaProjects\\Guia_Objetos_2\\ArchivosPrueba\\LogAuditoria_CuentasBancarias.txt", true);
            Escritor = new PrintWriter(Archivo);
            Escritor.print(_Mensaje);
            for (int i=_Mensaje.length() ; i<150 ; i++){
                Escritor.print(" ");
            }
            Escritor.print("\r\n");
        }
        catch(Exception _Exception){
            System.out.println(_Exception.getMessage());
        }
        finally {
            Archivo.close();
        }
    }

    // CONSTRUCTORES
    public CuentaBancaria() throws IOException {
        setId(getContador());
        setContador(getContador()+1);
        setBalance(0);
        EscribirArchivo("Nueva Cuenta Bancaria[Id:"+getId()+". Balance:"+getBalance()+"]. Cliente[]");
    }
    public CuentaBancaria(double _BalanceInicial, Cliente _Cliente) throws IOException {
        if (_BalanceInicial<-2000){
            System.out.println(" El balance inicial no puede ser menor que -2000. Se seteara en 0.");
            setBalance(0);
        }
        else{
            setBalance(_BalanceInicial);
        }
        setId(getContador());
        setContador(getContador()+1);
        setCliente(_Cliente);
        EscribirArchivo("Nueva Cuenta Bancaria[Id:"+getId()+". Balance:"+getBalance()+"]. Cliente[Id:"+getCliente().getId()+". Nombre:\""+getCliente().getNombre()+"\"]");
    }
    public CuentaBancaria(Cliente _Cliente) throws IOException {
        setBalance(0);
        setId(getContador());
        setContador(getContador()+1);
        setCliente(_Cliente);
        EscribirArchivo("Nueva Cuenta Bancaria[Id:"+getId()+". Balance:"+getBalance()+"]. Cliente[Id:"+getCliente().getId()+". Nombre:\""+getCliente().getNombre()+"\"]");
    }

    // GETTERS AND SETTERS
    public int getId() {
        return Id;
    }
    private void setId(int id) {
        Id = id;
    }
    public double getBalance() {
        return Balance;
    }
    private void setBalance(double balance) {
        Balance = balance;
    }
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Ejercicio_3.Cliente.Cliente cliente) throws IOException {
        Cliente = cliente;
        EscribirArchivo("Cuenta Bancaria[Id:"+getId()+"] Nuevo Cliente[Id:"+getCliente().getId()+". Nombre:\""+getCliente().getNombre()+"\"]");
    }
    public static int getContador() {
        return Contador;
    }
    private static void setContador(int contador) {
        Contador = contador;
    }
}
