import javax.swing.JFrame;

public class CelebrityFrame extends JFrame
{
    private CelebrityGame baseGame;

    public CelebrityFrame(CelebrityGame game)
    {
        baseGame = game;

        setTitle("Celebrity Game");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void replaceScreen(String screen)
    {
        System.out.println("Switching to screen: " + screen);
    }
}
