package ed.u2.model;

public class Paciente implements Comparable<Paciente> {
    public String id;
    public String apellido;
    public int prioridad;

    public Paciente(String id, String apellido, String prioridad){
        this.id = id;
        this.apellido = apellido;
        //parseo de string a entero
        this.prioridad = Integer.parseInt(prioridad);
    }

    public Paciente(String id, String apellido, int prioridad){
        this.id = id;
        this.apellido = apellido;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente otroPaciente){
        if (this.prioridad != otroPaciente.prioridad);
        return Integer.compare(this.prioridad, otroPaciente.prioridad);
    }

    public String getId() {
        return id;
    }
    public String getApellido() {
        return apellido;
    }
    public int getPrioridad() {
        return prioridad;
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "id='" + id + '\'' +
                ", apellido='" + apellido + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
    
}

