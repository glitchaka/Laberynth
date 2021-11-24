import java.awt.Color;
import java.awt.Graphics;

public class Laberinto {
    private int fila = 0;
    private int columna = 0;
    private final int numeroFilas = 13;
    private final int numeroColumnas = 23;
    private final int anchoBloque = 10;
    private final int altoBloque = 10;

    public void paint(Graphics g){
        int[][]laberinto = obtieneLaberinto();
        for(fila=0;fila<numeroFilas;fila++){
            for(columna=0;columna<numeroColumnas;columna++){
                if(laberinto[fila][columna] == 1){
                    g.setColor(Color.BLUE);
                    g.fillRect(columna*10, fila*10, anchoBloque, altoBloque);
                    g.setColor(Color.BLACK);
                    g.drawRect(columna*10, fila*10, anchoBloque, altoBloque);
                }

            }
        }
       
}
public int[][] obtieneLaberinto(){
    int laberinto[][]={
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
};
return laberinto;
}
}

