
package calculadora;

public interface StackLista<F>
{
    public void push(F item);
    // post: el item es agregado al stack. Sera
    //       el proximo en salir
    public int size();
    //post: regresa la cantidad de elementos
//      en el stack
}
