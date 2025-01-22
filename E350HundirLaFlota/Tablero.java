package E350HundirLaFlota;

public class Tablero {
    enum resultadoDisparo {AGUA, TOCADO, HUNDIDO}
    private final int TAMANIOTABLERO = 10;
    private int[][] tablero = new int[TAMANIOTABLERO][TAMANIOTABLERO];
    private Barco[] barcos = new Barco[7];
    private int numPartesBarco = 0;
    private int numAciertos = 0;

    public int getNumPartesBarco() {
        return numPartesBarco;
    }

    public String toString(){
        StringBuilder repesentacionTablero = new StringBuilder();
        repesentacionTablero.append("    1   2   3   4   5   6   7   8   9   10\n");
        for (int fila = 0; fila < TAMANIOTABLERO; fila++) {
            repesentacionTablero.append("  ").append("+---".repeat(TAMANIOTABLERO)).append(String.format("+\n%2d", fila + 1));
            for (int column = 0; column < TAMANIOTABLERO; column++) {
                repesentacionTablero.append(String.format("| %s ", tablero[fila][column] == 1 ? "X" : " "));
            }
            repesentacionTablero.append("|\n");
        }
        repesentacionTablero.append("  ").append("+---".repeat(TAMANIOTABLERO)).append("+\n");
        return repesentacionTablero.toString();
    }

    public void colocarBarco(int fil, int col){

    }

    public void disparar(int fil, int col) {
        if (barcos[fil][col]) {
            numAciertos++;
        }
        disparos[fil][col] = true;
    }

    public boolean todosBarcosHundidos(){
        return numAciertos == numPartesBarco;
    }

    public boolean hayDisparo(int fil, int col) {
        return false;
    }

    public boolean hayBarco(int fil, int col) {
        return false;
    }

}
