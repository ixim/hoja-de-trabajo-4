
package calculadora;

import java.util.Scanner;
//import java.io.*;
import java.io.FileReader;

public class StackCalculadora
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);	//objeto de tipo Scanner
                System.out.println("Ingrese el tipo de instancia que desea\nAL para ArrayList\nV para Vector\nL para lista");
		String a = entrada.nextLine();
                
                //if (a.equals("AL")||a.equals("V")){}
		StackFactory<String> sFactory = new StackFactory<String>();	// llamada al factory
		// Solicitar la implementacion deseada del Stack:
		//  AL:	implementacion con ArrayList
		//  V:  implementacion con Vector
		//  L: 	implementacion List
		Stack<String> miStack = sFactory.getStack(a);
                
		try
		{    
                    FileReader archivo = new FileReader("C:\\Users\\Dila Margarita\\Documents\\ixim\\UVG\\semestre 6\\algoritmos y estructura de datos\\hoja  de trabajo 4 netbeans\\Calculadora\\src\\calculadora\\datos.txt"); //Abrir el fichero indicado en la variable 
                        
                        int caracter1 = 0,caracter2 = 0,resultado = 0;
			do
			{
				caracter1 = archivo.read(); //Leer el primer carácter
				
				if (caracter1==49||caracter1==50||caracter1==51||caracter1==52||caracter1==53||caracter1==54||caracter1==55||caracter1==56||caracter1==57)//si caracter es un numero
				{
					miStack.push(String.valueOf((char)caracter1));//convierte caracter a char para luego pasarlo a String, se guarda en forma de string en el stack
				}
				if (caracter1 == 43)//suma
				{
					caracter1 = Integer.parseInt(miStack.pop());//retorna primer valor ingresado en el stack
					caracter2 = Integer.parseInt(miStack.pop());//retorn segundo valor ingresado en el stack
					resultado = caracter1 + caracter2;//suma valores
					System.out.print(caracter2+"+"+caracter1+"="+resultado+"\n");//imprime el resultado de la operacion realizada
					miStack.push(String.valueOf(resultado));//ingresa el resultado en el stack
				}
				if (caracter1 == 45)//resta
				{
					caracter1 = Integer.parseInt(miStack.pop());
					caracter2 = Integer.parseInt(miStack.pop());
					resultado = caracter2-caracter1;//resta valores
					System.out.print(caracter2+"-"+caracter1+"="+resultado+"\n");
					miStack.push(String.valueOf(resultado));//ingresa el resultado en el stack
				}
				if (caracter1 == 42)//multiplicacion
				{
					caracter1 = Integer.parseInt(miStack.pop());
					caracter2 = Integer.parseInt(miStack.pop());
					resultado = caracter1*caracter2;//multiplica valores
					System.out.print(caracter2+"*"+caracter1+"="+resultado+"\n");
					miStack.push(String.valueOf(resultado));//ingresa el resultado en el stack
				}
				if (caracter1 == 47)//division
				{
					caracter1 = Integer.parseInt(miStack.pop());
					caracter2 = Integer.parseInt(miStack.pop());
					resultado = caracter2/caracter1;//divide valores
					System.out.print(caracter2+"/"+caracter1+"="+resultado+"\n");
					miStack.push(String.valueOf(resultado));//ingresa el resultado en el stack
				}
			}
			while(caracter1 != -1); //Se recorre el fichero hasta encontrar el carácter -1 que marca el final del fichero
				
			archivo.close(); //Cerrar el fichero
		}
                catch (Exception e)
		{
			System.out.println("Error de lectura del fichero");
		}
  }
}