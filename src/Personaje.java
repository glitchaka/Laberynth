import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Personaje {
    Laberinto maze= new Laberinto();
    private int x = 10;
    private int y = 10;
    private final int ancho = 10;
    private final int alto = 10;
    private final int movimiento = 10;
   
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x, y, ancho, alto);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, ancho, alto);
    }

    public void teclaPresionada(KeyEvent event){
        int [][]laberinto = maze.obtieneLaberinto();
        if(event.getKeyCode() == 37){//IZQUIERDA
            if(laberinto[y/10][x/10-1] == 0){
                x -= movimiento;
            }
        }
        if(event.getKeyCode() == 39){//DERECHA
            if(laberinto[y/10][x/10+1] == 0){
                x += movimiento;
            }
        }
        if(event.getKeyCode() == 40){//ABAJO
            if(laberinto[y/10+1][x/10] == 0){
                y += movimiento;
            }
        }
        if(event.getKeyCode() == 38){//ARRIBA
            if(laberinto[y/10-1][x/10] == 0){
                y -= movimiento;
            }
            
        }
    }
    
}
