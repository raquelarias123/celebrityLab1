
public class MusicCelebrity extends Celebrity
{
    private String genre;

    public MusicCelebrity(String answer, String clue, String genre)
    {
        super(answer, clue);
        this.genre = genre;
    }

    public String getGenre()
    {
        return genre;
    }

    @Override
    public String getClue()
    {
        return super.getClue() + " (Genre: " + genre + ")";
    }

    @Override
    public String toString()
    {
        return "Music Celebrity: " + getAnswer() + " Genre: " + genre;
    }
}
