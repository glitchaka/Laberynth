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
        g.setColor(Color.RED);
        g.fillOval(x, y, ancho, alto);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, ancho, alto);
    }

    public void teclaPresionada(KeyEvent event){
        if(event.getKeyCode() == 37){//IZQUIERDA
            x -= movimiento;
        }
        if(event.getKeyCode() == 39){//DERECHA
            x += movimiento;
        }
        if(event.getKeyCode() == 40){//ABAJO
            y += movimiento;
        }
        if(event.getKeyCode() == 38){//ARRIBA
            y -= movimiento;
        }
    }
    
}
