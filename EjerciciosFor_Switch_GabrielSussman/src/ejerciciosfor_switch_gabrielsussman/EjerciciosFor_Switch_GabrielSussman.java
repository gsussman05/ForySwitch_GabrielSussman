/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosfor_switch_gabrielsussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EjerciciosFor_Switch_GabrielSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("BIENVENIDO A LA PRACTICA DE SWITCH Y FOR");
            System.out.println("1. Cuantos numeros pares e impares hay entre este rango?");
            System.out.println("2. Triangulos y Mas Triangulos");
            System.out.println("3. Anita Lava La Tina");
            System.out.println("4. Codigos Scretos");
            System.out.println("Ingrese Su Opcion: ");
            int opcion_m = sc.nextInt();
            switch (opcion_m) {
                case 1:
                    System.out.println("CUANTOS NUMEROS E IMPARES HAY ENTRE ESTE RANGO?");
                    System.out.println("Ingrese un numero: ");
                    int num = sc.nextInt();
                    if (num > 0) {
                        int numPares = 0;
                        int numImpares = 0;
                        System.out.print("Entre 0 y " + num + " existen" + numPares + " numeros pares y estos son");
                        for (int i = 0; i <= num; i++) {
                            if (i % 2 == 0) {
                                numPares++;
                                if (numPares == 1) {
                                    System.out.print(i);
                                } else {
                                    System.out.print(", " + i);
                                }
                            } else {
                                numImpares++;
                            }
                        }
                        System.out.println(" Entre 0 y " + num + " existen " + numImpares + " numeros impares y estos son: ");
                        for (int i = 0; i <= num; i++) {
                            if (i % 2 == 1) {
                                if (i == num) {
                                    System.out.print(i);
                                } else {
                                    System.out.print(i + ", ");
                                }
                            }
                        }
                        System.out.println();
                    }
                case 2:
                    System.out.println("TRIANGULOS Y MAS TRIANGULOS");
                    System.out.println("Desea dibujar un triangulo equilatero o rectangulo: ");
                    System.out.println("1. Triangulo Equilatero");
                    System.out.println("2. Triangulo Rectangulo");
                    int opTri = sc.nextInt();
                    switch (opTri) {
                        case 1:
                            System.out.println("Que altura desea para su triangulo equilatero: ");
                            int altEqui = sc.nextInt();
                            for (int i = 1; i <= altEqui; i++) {
                                for (int j = 1; j <= altEqui - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= (i * 2) - 1; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        case 2:
                            System.out.println("Que altura desea para su triangulo rectangulo: ");
                            int altRec = sc.nextInt();
                            for (int i = 1; i <= altRec; i++) {
                                for (int j = 1; j <= altRec - 1; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                    }
                case 3:
                    System.out.println("ANITA LAVA LA TINA");
                    System.out.println("Ingrese la palabra que desea comprobar si es palindroma: ");
                    sc.nextLine();
                    String palabra = sc.nextLine();
                    boolean esPalindroma = true;
                    int izq = 0;
                    int der = palabra.length() - 1;
                    while (izq < der && esPalindroma) {
                        char izq1 = Character.toLowerCase(palabra.charAt(izq));
                        char der1 = Character.toLowerCase(palabra.charAt(der));
                        if (izq1 != der1) {
                            esPalindroma = false;
                        }
                        izq++;
                        der--;
                    }
                    System.out.println("La palabra " + palabra + "  es palindroma?" + esPalindroma);
                //True=La palabra es palindroma
                //False=la palabra no es palindroma
                case 4:
                    System.out.println("CODIGOS SECRETOS");
                    System.out.println("Ingrese palabra: ");
                    String palabra1 = sc.next();
                    int posicion = 0;
                    int num2 = 1;
                    for (int i = 0; i < palabra1.length(); i += 2) {
                        if (num2 >= palabra1.length()) {
                            break;
                        }
                        char x = palabra1.charAt(i);
                        char y = palabra1.charAt(num2);
                        String num3=Character.toString(y);
                        posicion = Integer.parseInt(num3);
                        for (int j = 0; j < posicion; j++) {
                            System.out.print(x);
                        }
                        num2 += 2;
                    }

            }

        }

    }

}
