import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Juego extends JPanel{
    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();

    public Juego(){
        addKeyListener(new KeyListener(){
        @Override
            public void keyTyped(KeyEvent e){
               
        }
        @Override
            public void keyPressed(KeyEvent e){
                personaje.teclaPresionada(e);
            }
        @Override
            public void keyReleased(KeyEvent e){
                
            }
        });
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
       laberinto.paint(g);
       personaje.paint(g);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Laberinto");
        Juego game = new Juego();
        frame.add(game);
        frame.setSize(920,540);
        frame.setLocation(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            game.repaint();
        }
        
    }
    
}
