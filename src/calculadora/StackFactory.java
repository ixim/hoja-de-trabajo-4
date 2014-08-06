
package calculadora;

import java.util.Scanner;

class StackFactory<E> 
{
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
    Scanner entrada2 = new Scanner(System.in);
    
    public Stack<E> getStack(String entry) 
    {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
		return new StackArrayList<E>(); //regresa ArrayList
      	if (entry.equals("V"))
                return new StackVector<E>(); //regresa Vector
	if (entry.equals("L"))
        {
                System.out.println("Seleccione la letra del tipo de lista:\nS - Simple\nD - Doblemente enlazada\nC - Circular");
                String b = entrada2.nextLine();
                // Solicitar la implementacion deseada del Stack:
		//  S:  Simple
		//  d:  Doblemente encadenado
		//  C:  Circular
            	StackSingleton<String> sSingleton = new StackSingleton<String>();
		InterfazLista<String> miStackLista = sSingleton.getInstance(b);
        }
        return null;
    }
}