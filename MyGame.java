
import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.object.AnimatedSprite;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.background.ImageBackground;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class MyGame extends Game{
    Background background;
    Sprite gawang_kiri, gawang_kanan;
    AnimatedSprite player;
    
    @Override
    public void initResources() {
        background = new ImageBackground(getImage("Resources/background.jpg"),800,600);
        gawang_kiri = new Sprite(getImage("Resources/Gawang_Kiri.png"),0,235);
        gawang_kanan = new Sprite(getImage("Resources/Gawang_Kanan.png"), 755,235);
        
        BufferedImage[]images_player = getImages("Resources/Player.png",2,1);
        player = new AnimatedSprite(images_player,400,300);
     }
      
    @Override
    public void update(long l) {
        
        if(keyDown(KeyEvent.VK_LEFT)){
            player.setAnimationFrame(0, 0);
            player.setSpeed(-0.2, 0);
            player.update(1);
        }
     }

    @Override
    public void render(Graphics2D gd) {
        background.render(gd);
        gawang_kiri.render(gd);
        gawang_kanan.render(gd);
        player.render(gd);
     }
    public static void main(String[] args) {
        GameLoader game = new GameLoader();
        game.setup(new MyGame(), new Dimension(800,600),true);
        game.start();
    }
}
