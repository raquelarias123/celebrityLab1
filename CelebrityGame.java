import java.util.ArrayList;

public class CelebrityGame
{
    private ArrayList<Celebrity> celebGameList;
    private Celebrity gameCelebrity;
    private CelebrityFrame gameWindow;

    public CelebrityGame()
    {
        celebGameList = new ArrayList<Celebrity>();
        gameWindow = new CelebrityFrame(this);
    }

    public void prepareGame()
    {
        celebGameList = new ArrayList<Celebrity>();
        gameWindow.replaceScreen("START");
    }

    public boolean validateCelebrity(String name)
    {
        return name != null && name.trim().length() >= 4;
    }

    public boolean validateClue(String clue, String type)
    {
        return clue != null && clue.trim().length() >= 10;
    }

    public void addCelebrity(String name, String guess, String type)
    {
        Celebrity celeb;

        if(type.equalsIgnoreCase("Music"))
        {
            celeb = new MusicCelebrity(name, guess, "Unknown");
        }
        else
        {
            celeb = new Celebrity(name, guess);
        }

        celebGameList.add(celeb);
    }

    public int getCelebrityGameSize()
    {
        return celebGameList.size();
    }

    public void play()
    {
        if(celebGameList.size() > 0)
        {
            gameCelebrity = celebGameList.get(0);
            gameWindow.replaceScreen("GAME");
        }
    }

    public boolean processGuess(String guess)
    {
        boolean matches = false;

        if(guess.trim().equalsIgnoreCase(gameCelebrity.getAnswer()))
        {
            matches = true;

            celebGameList.remove(0);

            if(celebGameList.size() > 0)
            {
                gameCelebrity = celebGameList.get(0);
            }
        }

        return matches;
    }

    public String sendClue()
    {
        return gameCelebrity.getClue();
    }
}

