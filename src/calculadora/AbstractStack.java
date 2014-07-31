
package calculadora;

abstract public class AbstractStack<E> implements Stack<E>
{
    public boolean empty()
    // post: regresa true si el stack esta vacio
    {
        return size() == 0;
    }
}
