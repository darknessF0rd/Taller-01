import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        menu();
    }
    static int hallarGcd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int primero = sc.nextInt();
        System.out.println("Ingresa otro numero: ");
        int segundo = sc.nextInt();
        int mayor;
        int menor;
        int modulo;

        if(primero < segundo){
            mayor = segundo;
            menor = primero;
        }
        else{
            mayor = primero;
            menor = segundo;
        }
        do{
            modulo = mayor % menor;
            mayor = menor;
            menor = modulo;
        }while (modulo!=0);

        return mayor;
    }
    static void menu(){
        Scanner scr = new Scanner(System.in);
        boolean salir = false;
        do{
            System.out.println("ELIGE UNA DE LAS OPCIONES:\n1) Hallar el Gcd de dos numeros.\n2) Salir.");
            String opcion = scr.next();
            switch (opcion){
                case "1":
                    int resultado = hallarGcd();
                    System.out.println("EL Gcd es: " + resultado);
                    break;
                case "2":
                    salir = true;
                    break;
                default:
                    System.out.println("Error: elije una opcion valida.");
                    break;
            }
        }while (!salir);
    }
}