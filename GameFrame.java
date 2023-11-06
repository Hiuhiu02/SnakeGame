import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GamePanel game;
    GameFrame(){
        GamePanel game = new GamePanel();
        this.add(game);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        

    }
}
