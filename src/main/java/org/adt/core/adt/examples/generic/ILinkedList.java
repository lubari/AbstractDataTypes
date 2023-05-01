package org.adt.core.adt.examples.generic;

/**
 * Precondicion: para usar cualquier de estos metodos la estructura debe estar inicializada.
 *
 * @param <T> Tipo de dato que va a almacenar
 */
public interface ILinkedList<T> {

    /**
     * Agregar un elemento al en la ultima posicion.
     *
     * @param value contiene el valor a guardar en la ultima posicion.
     */
    void add(T value);

    /**
     * Postcondicion: Inserta un elemento solo si el indice es valido.
     *
     * @param index valido si esta en el rango [0, length], con length la longitud de la lista.
     * @param value contiene el valor a guardar en la posicion indicada.
     */
    void insert(int index, T value);

    /**
     * Postcondicion: Elimina el elemento si existe. De lo contrario no hace nada.
     *
     * @param index positivo o cero, menor que el tamaño de la lista.
     */
    void remove(int index);

    /**
     * @param index valido si esta en el rango [0, length), con length la longitud de la lista.
     * @return valor que se encuentra en la posicion indicada.
     */
    T get(int index);

    /**
     * @return longitud de la lista.
     */
    int size();

    /**
     * @return <code>true</code> solo cuando la lista esta vacia, <code>false</code> en otro caso.
     */
    boolean isEmpty();
}