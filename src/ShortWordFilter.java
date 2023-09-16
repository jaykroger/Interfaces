public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        boolean isAccepted = false;

        if (x instanceof String)
        {
            String word = (String) x;
            if(word.length() < 5)
            {
                isAccepted = true;
            }
        }
        return isAccepted;
    }
}

