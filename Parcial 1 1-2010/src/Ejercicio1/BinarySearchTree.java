package Ejercicio1;

public interface BinarySearchTree<T> {
	/**
	 * Agrega una clave al �rbol. Si ya existe, no hace nada y el �rbol no se
	 * modifica.
	 */
	public void add(T key);

	/**
	 * Elimina una clave del �rbol. Si no existe, no hace nada y el �rbol no se
	 * modifica.
	 */
	public void remove(T key);

	/**
	 * Determina si el �rbol contiene o no una clave.
	 */
	public boolean contains(T key);

}
