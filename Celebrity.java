public class Celebrity
{
    private String answer;
    private String clue;

    public Celebrity(String answer, String clue)
    {
        this.answer = answer;
        this.clue = clue;
    }

    public String getAnswer()
    {
        return answer;
    }

    public String getClue()
    {
        return clue;
    }

    public String toString()
    {
        return "Celebrity: " + answer + " Clue: " + clue;
    }
}


