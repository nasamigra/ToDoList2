package modelo.filtros;

import modelo.tareas.Tarea;
import java.util.LinkedList;

public class FiltroPrioridad implements Filtro {

    Tarea.Prioridad prioridad;

    public FiltroPrioridad(Tarea.Prioridad prioridad){
        this.prioridad = prioridad;
    }

    @Override
    public LinkedList<Tarea> Filtrar(LinkedList<Tarea> tareas) {
        LinkedList<Tarea> filtradas = new LinkedList<>();
        System.out.println(prioridad.getPrioridad());
        for (Tarea elem :tareas) {
            if (elem.getTipoPrioridad().equals(prioridad.getPrioridad())){
                filtradas.add(elem);
            }
        }
        return filtradas;

    }
}
