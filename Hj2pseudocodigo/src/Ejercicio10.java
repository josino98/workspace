/*10) Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
diga cu�l es el numero primo m�s cercano a �l por debajo.*/

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado=new Scanner(System.in);

		int n, i, num, conta;
		boolean encontrado;
		System.out.println("introducir un numero");
		n=teclado.nextInt();

		while (n<=0){
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		num = n; 
		encontrado = false;
		//while(!encontrado){
		while(encontrado ==false ){//mientras no encuentre el numero primo
			num = num - 1; //busco un numero menos
			conta = 0;//contador de divisores
			for(i=2; i<num; i++){// buscamos posibles divisores(menos el 1 y el propio numero)
				if(num % i ==0){
					conta = conta +1;
				}//end if

			}//end for
			if(conta == 0){//es primo
				encontrado = true;//ya lo he encontrado
				System.out.println("el numero " + num + " es el mas cercano a " + n + " por debajo");
			}//end if

		}//end while



	}

}