
package calculadora;

class StackSingleton<T>
{
    protected InterfazLista<T> instancia;
    
    private StackSingleton(){}//constructor
    
    //public Stack<E> getStack(String entry) 
    public InterfazLista<T> getInstance(String entry)
    {
        if (instancia == null)//aqui es donde se verifica si ya ha sido creado algo o no
        {
                instancia = new SingleLista<T>();//aqui hiria la comparacion
        }
        return instancia;
    }
}
        // seleccion de la implementacion a utilizar:
	/*if (entry.equals("S"))
		return new Single<F>(); //regresa ArrayList
	if (entry.equals("D"))
                return new DoubleLista<F>();
	else
		return new Circular<F>(); //regresa Vector*/

