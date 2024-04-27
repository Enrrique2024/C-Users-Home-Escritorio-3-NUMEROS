//Zahid Enrrique Esquivel Lainez
//Soy del grupo 1M7-S
//Numero de carnet 2024-1693U

import java.util.Scanner;

public class OperacionesNumericas { // Aqui declare la clase como Operaciones numercias

    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in); // Aqui abri el Scanner para que me lea los datos interos

        // Aqui vamos a pedirle al usuario que ingrese los numeros...

        System.out.println("Porfavor ingrese el primer numero:");
        int num1 = Scanner.nextInt(); // Aqui declare los enteros, mas el scanner para que lea los datos al
                                      // introducirlos, al igual que el Num 1,2 y 3

        System.out.println("Porgavor ingrese el segundo numero:");
        int num2 = Scanner.nextInt();

        System.out.println("Porfavor ingrese el tercer numero:");
        int num3 = Scanner.nextInt();
        // -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Aqui vamos a calcular la suma de los 2 numeros mas bajos...

        int SumaMenores = num1 + num2 + num3 - Math.max(Math.max(num1, num2), num3);
                                                                                     // suma de los tres numeros y
                                                                                     // despues resto...
        // el numero mas grande de los tres , teniendo asi la suma de los 2 numeros mas
        // chiquita. La funcion Math.max la utilizo para que me devuelva el numero
        // mayore de los 3 que en este caso seria...
        // num1,2 y 3

        // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Aqui vamos a calcular la diferencia de los 2 numeros mas altos...

        int diferenciaMayores = Math.max(Math.max(num1, num2), num3) - Math.min(Math.min(num1, num2), num3);// Aqui lo
                                                                                                            // que nada
                                                                                                            // mas hice
                                                                                                            // fue
                                                                                                            // calcular
                                                                                                            // la
                                                                                                            // diferencia
                                                                                                            // entre el
                                                                                                            // numero
                                                                                                            // mas
                                                                                                            // grande y
                                                                                                            // el numero
                                                                                                            // mas
                                                                                                            // pequeño
                                                                                                            // de los
                                                                                                            // tres,,,
        // en este caso utilice el Math.main para que me devuelva el numero menor de los
        // 3
        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
        // Aqui nosotros vamos a encotrar el numero mayor...

        int mayor = Math.max(Math.max(num1, num2), num3);

        // Ahora aqui vamos a mostrar las respuestas

        System.out.println("La suma de los dos numeros menores es:" + SumaMenores);
        System.out.println("La diferencia de los numeros mayores es:" + diferenciaMayores);
        System.out.println("El numero mayor es:" + mayor);

        Scanner.close();// Y aqui nada mas hago cerra el Scanner
    }
}
 //Y eso es todo, si hay un error porfavor hagamelo saber, para poder mejorar mas ;)