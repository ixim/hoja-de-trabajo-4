
package calculadora;

class StackSingleton<F>
{
    public StackLista<F> getStackLista(String entry) 
    {
        // seleccion de la implementacion a utilizar:
	if (entry.equals("S"))
		return new Single<F>(); //regresa ArrayList
	if (entry.equals("D"))
                return new Double<F>();
	else
		return new Circular<F>(); //regresa Vector
    }
}
