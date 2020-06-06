package modelo;

import modelo.tareas.Tarea;

import java.util.LinkedList;

public interface InterfaceModelo {
    LinkedList<Tarea> getTareas();
    boolean NuevaTarea(Tarea tarea);
    LinkedList<Tarea> filtrarPrioridadAlta(LinkedList<Tarea> tareas);
    LinkedList<Tarea> filtrarPrioridadMedia(LinkedList<Tarea> tareas);
    LinkedList<Tarea> filtrarPrioridadBaja(LinkedList<Tarea> tareas);
    LinkedList<Tarea> filtrarCompletados(LinkedList<Tarea> tareas);
    LinkedList<Tarea> filtraNoCompletados(LinkedList<Tarea> tareas);
}
