package ed.u2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cita implements Comparable<Cita> {
    private String id;
    private String apellido;
    private LocalDateTime fechaHora;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

    public Cita(String id, String apellido, String fechaHoraS){
        this.id = id;
        this.apellido = apellido;
        //parseamos el String de fechaHora a LocalDateTiem
        this.fechaHora = LocalDateTime.parse(fechaHoraS, formatter);
    }

    //sobreCarga del constructor
    //para mayor flexibilidad

    public Cita(String id, String apellido, LocalDate fecha, int hora){
        this.id = id;
        this.apellido = apellido;
        this.fechaHora = fecha.atTime(hora, 0);
    }

    @Override
    public int compareTo(Cita otraCita) {
        return this.fechaHora.compareTo(otraCita.fechaHora);
    }

    public String getId() {
        return id;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    @Override
    public String toString() {
        return "Cita{" +
                "id='" + id + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaHora=" + fechaHora.format(formatter) +
                '}';
}
}
