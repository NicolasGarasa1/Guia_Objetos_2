import Ejercicio_1.Autor.Autor;
import Ejercicio_1.Libro.Libro;
//import Ejercicio_2.Factura.Factura;
//import Ejercicio_2.Items.Item_Venta;
import Ejercicio_1.Autor.Autor;
import Ejercicio_3.Cliente.Cliente;
import Ejercicio_3.CuentaBancaria.CuentaBancaria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

//import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        // EJERCICIO 1
        Autor NuevoAutor = new Autor("Jose", "Bloch", "jose@gmail.com", false);
        Autor NuevoAutor_2 = new Autor("Madeline", "Monroe", "madmonroe@gmail.com.us", true);
        //NuevoAutor.MostrarInformacion();
        Libro NuevoLibro = new Libro("Effective Java", 450, 150);
        //NuevoLibro.Agregar_Autor(NuevoAutor_2);
        NuevoLibro.Agregar_Autor(NuevoAutor);
        NuevoLibro.MostrarInformacion();
        NuevoLibro.setPrecio(500);
        NuevoLibro.setStock(NuevoLibro.getStock()+50);
        // EJERCICIO 2
        /*Cliente NuevoCliente = new Cliente("Nicolas", 20, "nicolasgarasa123@gmail.com");
        //NuevoCliente.MostrarInformacion();
        Factura NuevaFactura = new Factura(NuevoCliente);
        //NuevaFactura.MostrarInformacion();
        Item_Venta NuevoProducto = new Item_Venta("Vino", "Alma Mora Malbec", 780);
        Item_Venta NuevoProducto2 = new Item_Venta("Gin", "Bombay Saphire", 9700);
        NuevaFactura.Agregar_Item_Venta(NuevoProducto);
        NuevaFactura.Agregar_Item_Venta(NuevoProducto2);
        NuevaFactura.MostrarInformacion();*/
        // EJERCICIO 3
        /*Cliente NuevoCliente = new Cliente("Nicolas", true);
        NuevoCliente.MostrarInformacion();
        CuentaBancaria NuevaCuentaBancaria = new CuentaBancaria(10000, NuevoCliente);
        NuevaCuentaBancaria.Extraer(100);
        NuevaCuentaBancaria.Depositar(50);
        CuentaBancaria NuevaCuentaBancaria_2 = new CuentaBancaria();
        NuevaCuentaBancaria_2.Depositar(5000);
        NuevaCuentaBancaria_2.setCliente(NuevoCliente);*/
        // EJERCICIO 4
    }
}