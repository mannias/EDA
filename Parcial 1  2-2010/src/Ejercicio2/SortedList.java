package Ejercicio2;

public interface SortedList<T> {
/**
* Agrega un elemento a la lista (en la posici�n correspondiente seg�n el comparador).
* No se debe permitir almacenar valores null, si se invoca con null
* lanza IllegalArgumentException.
*/
public void add(T elem);
/**
* Elimina el elemento agregado m�s recientemente. Se lo puede invocar sucesivas veces,
* eliminando as� los elementos en el orden inverso al que fueron agregados a la lista.
* Si la lista est� vac�a no hace nada.
*/
public void undo();
/**
* Imprime los elementos de la lista.
*/
public void print();
}