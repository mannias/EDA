package Ejercicio1;

public interface PriorityQueue<T> {
	/**
	* Encola un elemento.
	* @param priority Un n�mero mayor a cero que especifica la prioridad. Cuanto
	* menor es este n�mero mayor es la prioridad.
	*/
	public void enqueue(T elem, int priority);
	/**
	* Desencola un elemento.
	* @throws NoSuchElementException Si la cola est� vac�a.
	*/
	public T dequeue();
	/**
	* Eval�a si la cola est� vac�a o no.
	*/
	public boolean isEmpty();
	}