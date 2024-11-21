package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int cero = 0;
        int siguiente = 0;
        while (cero <= num)
        {
            siguiente = cero+1;
            if (cero <= num)
            {
                System.out.println(cero + " < " + num + ". El proximo ciclo valdra: " + siguiente);
            }
            cero++;
        }

    }
}