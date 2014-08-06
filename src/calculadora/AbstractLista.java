
package calculadora;

abstract public class AbstractLista<F> implements StackLista<F>
{
    public boolean empty()
    // post: regresa true si el stack esta vacio
    {
        return size() == 0;
    }
}
