public class Persona {

    String nombre;
    String apellido;
    int edad;
    Educacion educacion;

    public String nombreCompleto(){

        return nombre +" "+ apellido;

    }

    public String enviarSaludo(String saludado){
        if (edad > 40) return "Hola como estas, querido "+saludado;
        return "Hola como estas "+saludado;
    }

}
