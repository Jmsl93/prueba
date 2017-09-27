package Reto1;

import java.util.Scanner;

public class Reto1 {
	public static void main(String[] args){
		String cadena;
		int desplazamiento;
		
		System.out.println("Introduzca cadena a codificar y el desplazamiento");
		Scanner c=new Scanner(System.in);
		cadena=c.nextLine();
		desplazamiento=c.nextInt();
		char [] mensaje_codificado=codificar(cadena,desplazamiento);
		System.out.println(mensaje_codificado);
		
		
	}
		public static  char[] codificar(String c, int desplazamiento){
			char[] carac=c.toCharArray();
			for(int i =0;i<c.length();i++){
				if(Character.isUpperCase(carac[i]) || Character.isLowerCase(carac[i])){
					if(carac[i]+desplazamiento>90){
						carac[i]=(char) (carac[i]-26+desplazamiento);
				}else
					carac[i] += desplazamiento;
			}else{
				
			}
				
			
		}
			return carac;
	}

}
