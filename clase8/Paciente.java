

public class Paciente {
    


    public Paciente(String nombre, int edad, String enfermedad, Date fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}