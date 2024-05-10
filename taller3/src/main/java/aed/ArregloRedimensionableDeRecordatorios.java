package aed;



class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    private Recordatorio[] recordatorios;
    private int longitud;

    public ArregloRedimensionableDeRecordatorios() {
        recordatorios = new Recordatorio[1];
        longitud = 0;
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAtras(Recordatorio recordatorio) {
        if (longitud == recordatorios.length) {
            Recordatorio[] nuevoArreglo = new Recordatorio[recordatorios.length * 2];
            for (int i = 0; i < longitud; i++) {
                nuevoArreglo[i] = recordatorios[i];
            }
            recordatorios = nuevoArreglo;
        }
        recordatorios[longitud] = recordatorio;
        longitud++;
    }

    public Recordatorio obtener(int i) {
        return recordatorios[i];
    }

    public void quitarAtras() {
        if (longitud > 0) {
            longitud--;
            recordatorios[longitud] = null; // Liberar referencia al objeto eliminado
        }
    }

    public void modificarPosicion(int i, Recordatorio recordatorio) {
        recordatorios[i] = recordatorio;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios copia = new ArregloRedimensionableDeRecordatorios();
        for (int i = 0; i < longitud; i++) {
            copia.agregarAtras(recordatorios[i]);
        }
        return copia;
    }
}