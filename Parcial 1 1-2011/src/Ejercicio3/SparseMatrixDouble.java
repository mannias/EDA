package Ejercicio3;

/**
* Matriz bidimensional infinita de valores Double.
* La matriz se crea inicialmente con valores nulos.
*/
public interface SparseMatrixDouble {
/**
* Agrega un valor en la posici�n determinada por los par�metros de entrada.
* Si ya existe un valor en esa posici�n, actualiza el mismo con el nuevo par�metro.
*/
public void set(int row, int col, Double value);
/**
* Elimina el valor ubicado en la fila y columna de la matriz, seg�n los par�metros de
* entrada.
* Si valor en esa posici�n fuera nulo, no hace nada.
*/
public void remove(int row, int col);
/**
* Obtiene el valor asociado a una posici�n de la matriz determinada por los par�metros
* de entrada.
*/
public Double get(int row, int col);
/**
* Retorna la suma de dos matrices.
* En caso de que exista alg�n error, retorna null.
*/
public SparseMatrixDouble sum(SparseMatrixDouble otherSparseMatrix);
}
