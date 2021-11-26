import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Personaje {
    
    Laberinto maze= new Laberinto();
    private int x = 40;
    private int y = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;
   
    public void paint(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillOval(x, y, ancho, alto);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, ancho, alto);
    }

    public void teclaPresionada(KeyEvent event){
        int [][]laberinto = maze.obtieneLaberinto();
        if(event.getKeyCode() == 37){//IZQUIERDA
            if(laberinto[y/40][x/40-1] == 0){
                x -= movimiento;
            }
        }
        if(event.getKeyCode() == 39){//DERECHA
            if(laberinto[y/40][x/40+1] == 0){
                x += movimiento;
            }
        }
        if(event.getKeyCode() == 40){//ABAJO
            if(laberinto[y/40+1][x/40] == 0){
                y += movimiento;
            }
        }
        if(event.getKeyCode() == 38){//ARRIBA
            if(laberinto[y/40-1][x/40] == 0){
                y -= movimiento;
            }
            
        }
        if(event.getKeyCode() == 32){//ARRIBA
            if(laberinto[y/40-1][x/40] == 0){
                y -= movimiento;
            }
            
        }
    }
    
}
