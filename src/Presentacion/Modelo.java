package Presentacion;

public class Modelo {
    private Vista paint;

    public void iniciar(){
        getVista().setSize(800,600);
        getVista().setVisible(true);

    }

    public Vista getVista(){
        if (paint==null){
            paint= new Vista(this);
        }
        return paint;
    }

}
