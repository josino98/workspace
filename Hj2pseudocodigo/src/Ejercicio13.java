/*13) Dado un numero n le�do por teclado encontrar el numero p primo mas cercano a �l
por exceso.*/

import java.util.*;

public class Ejercicio13 {

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
			num = num + 1; //busco un numero mas
			conta = 0;//contador de divisores
			for(i=2; i<num; i++){// buscamos posibles divisores(menos el 1 y el propio numero)
				if(num % i ==0){
					conta = conta +1;
				}//end if

			}//end for
			if(conta == 0){//es primo
				encontrado = true;//ya lo he encontrado
				System.out.println("el numero " + num + " es el mas cercano a " + n + " por encima");
			}//end if

		}//end while



	}

}
