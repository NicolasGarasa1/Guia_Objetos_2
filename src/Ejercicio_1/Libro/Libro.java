package Ejercicio_1.Libro;
import Ejercicio_1.Autor.Autor;

import java.util.ArrayList;

public class Libro {
    // ATRIBUTOS
    private String Titulo;
    private double Precio;
    private int Stock;
    private ArrayList<Autor> Autores;

    // METODOS
    public void MostrarInformacion(){
        if (getAutores().size()==1){
            System.out.print("\n Libro[Titulo: \""+getTitulo()+"\". Precio: "+getPrecio()+". Stock: "+getStock()+". Autor: \""+getAutores().get(0).getNombre()+" "+getAutores().get(0).getApellido()+"\".");
        }
        else{
            System.out.print("\n Libro[Titulo: \""+getTitulo()+"\". Precio: "+getPrecio()+". Stock: "+getStock()+".\n Autores:");
            for(int i=0 ; i<getAutores().size() ; i++){
                System.out.print("\n Nombre: \""+getAutores().get(i).getNombre()+" "+getAutores().get(i).getApellido()+"\".");
            }
        }
    }
    public void Agregar_Autor(Autor _Autor){
        getAutores().add(_Autor);
    }

    // CONSTRUCTORES
    public Libro(){
        setAutores(new ArrayList<>());
    }
    public Libro(String _Titulo, double _Precio, int _Stock, Autor _Autor){
        setTitulo(_Titulo);
        setPrecio(_Precio);
        setStock(_Stock);
        setAutores(new ArrayList<>());
        getAutores().add(_Autor);
    }
    public Libro(String _Titulo, double _Precio, int _Stock){
        setTitulo(_Titulo);
        setPrecio(_Precio);
        setStock(_Stock);
        setAutores(new ArrayList<>());
    }

    // GETTERS AND SETTERS
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int stock) {
        Stock = stock;
    }
    public ArrayList<Ejercicio_1.Autor.Autor> getAutores() {
        return Autores;
    }
    public void setAutores(ArrayList<Ejercicio_1.Autor.Autor> autores) {
        Autores = autores;
    }
}
