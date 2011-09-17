package Ejercicio1;

/**
 * Mapa que mantiene informaci�n hist�rica de su estado a trav�s de versiones.
 * El mapa se crea inicialmente vac�o, con n�mero de versi�n 0. Luego cada vez
 * que se lo modifica, se incrementa la versi�n.
 */
public interface VersionableMap<K, V> {
	/**
	 * Agrega un par clave-valor al mapa. Cada vez que se invoca a este m�todo
	 * se incrementa en uno la versi�n. No se deben admitir claves ni valores
	 * nulos. Si la clave ya existe, actualiza su valor asociado.
	 */
	public void put(K key, V value);

	/**
	 * Elimina un par clave-valor del mapa, seg�n la clave especificada. Si la
	 * clave no existe no hace nada. Cada vez que se invoca a este m�todo se
	 * incrementa en uno la versi�n.
	 */
	public void remove(K key);

	/**
	 * Obtiene el valor asociado a una clave dada una versi�n espec�fica del
	 * mapa. Si la clave no existe, retorna null.
	 */
	public V get(K key, int version);
}
