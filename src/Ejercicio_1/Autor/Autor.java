package Ejercicio_1.Autor;

public class Autor {
    // ATRIBUTOS
    private String Nombre;
    private String Apellido;
    private String Mail;
    private boolean Genero; // 0 MASCULINO // 1 FEMENINO

    // METODOS
    public void MostrarInformacion(){
        System.out.print("\n Autor[Nombre: \""+getNombre()+"\". Apellido: \""+getApellido()+"\". Mail: \""+getMail()+"\". Genero: ");
        if (isGenero()){
            System.out.print("Femenino]");
        }else {
            System.out.print("Masculino]");
        }
    }

    // CONSTRUCTORES
    public Autor(){}
    public Autor(String _Nombre, String _Apellido, String _Mail, boolean _Genero){
        setApellido(_Apellido);
        setNombre(_Nombre);
        setMail(_Mail);
        setGenero(_Genero);
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getMail() {
        return Mail;
    }
    public void setMail(String mail) {
        Mail = mail;
    }
    public boolean isGenero() {
        return Genero;
    }
    public void setGenero(boolean genero) {
        Genero = genero;
    }
}
