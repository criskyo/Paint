package Default;

import Presentacion.Modelo;

public class Launcher {

    private Modelo paint;

    public Launcher(){
        paint = new Modelo();
        paint.iniciar();

    }

    public static void main(String[] args) {
       new Launcher();
    }

}
