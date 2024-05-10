package aed;


public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;
    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha);
        this.horario = horario;
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return new Fecha(this.fecha);
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        {
            String str = this.mensaje + " @ " + this.fecha.toString() + " " + this.horario.toString();
            return str;
        }
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
        if (otro == null || getClass() != otro.getClass()) {
            return false;
        }
        Recordatorio otroRecordatorio = (Recordatorio) otro;
        return (this.mensaje == null ? otroRecordatorio.mensaje == null : this.mensaje.equals(otroRecordatorio.mensaje)) &&
               this.fecha.equals(otroRecordatorio.fecha) &&
               this.horario.equals(otroRecordatorio.horario);
    }
        
}
