public class Persona {

    String nombre;
    String apellido;
    int edad;
    Educacion educacion;

    public Persona(String nombre, String apellido, int edad, String nombreeducacion, int duracion, boolean enCurso){
        educacion = new Educacion(nombreeducacion, duracion, enCurso);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }

    public String nombreCompleto(){

        return nombre +" "+ apellido;

    }

    public String enviarSaludo(String saludado){
        if (edad > 40) return "Hola como estas, querido "+saludado;
        return "Hola como estas "+saludado;
    }

}
