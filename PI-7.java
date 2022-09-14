import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero1;
      int numero2;
      System.out.println("Escriba el primer entero ");
      numero1 = entrada.nextInt() ;
      System.out.println("Escriba el segundo entero ");
      numero2 = entrada.nextInt() ;
      if (numero1 == numero2)
      System.out.println("El numero " + numero1 + "es igual a " + numero2) ;
      if (numero1 != numero2)  
      System.out.println("El numero " + numero1 + "es distinto a " + numero2) ;
      if (numero1 < numero2)
      System.out.println("El numero " + numero1 + "es menor a " + numero2) ;  
      if (numero1 > numero2)
      System.out.println("El numero " + numero1 + "es mayor a " + numero2) ;
      if (numero1 <= numero2)
      System.out.println("El numero " + numero1 + "es menor o igual a " + numero2) ;
      if (numero1 >= numero2)
      System.out.println("El numero " + numero1 + "es meyor o igual a " + numero2) ;
  }
}