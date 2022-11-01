
import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.background.ImageBackground;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class MyGame extends Game{
    Background background;
    
    @Override
    public void initResources() {
        background = new ImageBackground(getImage("Resources/background.jpg"),800,600);
     }
      
    @Override
    public void update(long l) {
     }

    @Override
    public void render(Graphics2D gd) {
        background.render (gd);
     }
    public static void main(String[] args) {
        GameLoader game = new GameLoader();
        game.setup(new MyGame(), new Dimension(800,600),true);
        game.start();
    }
}
