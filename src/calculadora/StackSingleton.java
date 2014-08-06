
package calculadora;

public class StackSingleton<F>
{
    private static <F> instance;
    
    private StackSingleton(){}
    
    public static StackSingleton getInstance()
    {
        if (instance == null)//aqui es donde se verifica si ya ha sido creado algo o no
        {
            instance = new <F>;//aqui hiria la comparacion
        }
        return instance;
    }
}
        // seleccion de la implementacion a utilizar:
	/*if (entry.equals("S"))
		return new Single<F>(); //regresa ArrayList
	if (entry.equals("D"))
                return new DoubleLista<F>();
	else
		return new Circular<F>(); //regresa Vector*/
}
