
package sumar.promedio;

import java.util.Scanner;

public class SumarPromedio {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1, num2, num3, num4, num5, num6, num7, num8, num9, suma, promedio;
        System.out.print("Ingrese el primer valor: ");
        num1=teclado.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        num2=teclado.nextFloat();
        System.out.print("Ingrese el tercer valor: ");
        num3=teclado.nextFloat();
        System.out.print("Ingrese el cuarto valor: ");
        num4=teclado.nextFloat();
        System.out.print("Ingrese el quinto valor: ");
        num5=teclado.nextFloat();
        System.out.print("Ingrese el sexto valor: ");
        num6=teclado.nextFloat();
        System.out.print("Ingrese el septimo valor: ");
        num7=teclado.nextFloat();
        System.out.print("Ingrese el octavo valor: ");
        num8=teclado.nextFloat();
        System.out.print("Ingrese el noveno valor: ");
        num9=teclado.nextFloat();
        suma=num1+num2+num3+num4+num5+num6+num7+num8+num9;
        promedio=suma/9;
        System.out.print("La suma de los valores es: ");
        System.out.print(suma);
        System.out.print("\nEl promedio de la suma es: ");
        System.out.print(promedio);
    }
    
}
