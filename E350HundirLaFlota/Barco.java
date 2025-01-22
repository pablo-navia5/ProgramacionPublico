package E350HundirLaFlota;

public class Barco {
    private Tablero tablero;
    private String denominacion;
    private int tamanno;
    private boolean[] disparos;
    private int cantidadDisparos;
    private int fil;
    private int col;
    private boolean vertical;

    public Barco(Tablero tablero, String denominacion, int tamanno) {
        this.tablero = tablero;
        this.denominacion = denominacion;
        this.tamanno = tamanno;
    }

    public boolean colocar(int fil, int col, boolean vertical) {

    }

    public boolean disparar(int fil, int col) {

    }

    public boolean hundido(){

    }


}
