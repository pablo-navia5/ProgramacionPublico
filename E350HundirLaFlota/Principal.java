package E350HundirLaFlota;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fila;
        int col;
        int barcosColocados = 0;
        int jugadorActual = 1;
        Tablero tablero1 = new Tablero();
        Tablero tablero2 = new Tablero();

        System.out.println("Juego de hundir la flota: ");
        for (int i = 1; i <= 2; i++) {
            System.out.printf("Jugador %d ingrese condenadas para poner los barcos.\n", jugadorActual);
            for (int j = 1; j <= 7; j++) {
                System.out.printf("Introduce las cordenadas en las que poner el %s", j == 1 ? "Portaaviones (1x5)" : j == 2 ? "Buque (1x4)" : j == 3 ? "Submarino (1x3)" : j >= 6 ? "Lancha (1x1)" : "Crucero (1x2)");
                do {
                    System.out.print("Fila: ");
                    fila = teclado.nextInt();
                } while (fila < 1 || fila > 10);

                do {
                    System.out.print("Columna: ");
                    col = teclado.nextInt();
                } while (col < 1 || col > 10);

                if (jugadorActual == 1) tablero1.colocarBarco(fila, col);
                else tablero2.colocarBarco(fila, col);
            }
            jugadorActual = jugadorActual == 1 ? 2 : 1;
        }

//        do { //bucle para intentar hundir los barcos
//            System.out.println("Introduce cordenadas para disparar: ");
//
//            do {
//                System.out.print("Fila: ");
//                fila = teclado.nextInt();
//            } while (fila < 1 || fila > 10);
//
//            do {
//                System.out.print("Columna: ");
//                col = teclado.nextInt();
//            } while (col < 1 || col > 10);
//            Tablero1.disparar(fila - 1, col - 1);
//            System.out.println(Tablero1);
//        } while (!Tablero1.todosBarcosHundidos());

    }

    private void colocarBarcos(Tablero tablero) {



    }
}