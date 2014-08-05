
package calculadora;

class StackFactory<E> 
{
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
    public Stack<E> getStack(String entry) 
    {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
		return new StackArrayList<E>(); //regresa ArrayList
	/*if (entry.equals("L"))
                StackSingleton<String> sSingleton = new StackSingleton<String>();
                StackLista<String> lista = sSingleton.getStackLista(a);*/
	else
		return new StackVector<E>(); //regresa Vector
	}
}