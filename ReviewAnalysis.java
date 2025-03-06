import java.util.ArrayList;
public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;


    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis(Review[] reviews) 
    {
        allReviews = reviews;
    }


    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() 
    {
       double average = 0; 
       for(int i = 0; i < allReviews.length; i++)
       {
        average += allReviews[i].getRating();
       }
       return average / allReviews.length;
    }


    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() 
    {
     String current = "";
     ArrayList<String> comments = new ArrayList<String>();
     for(int i = 0; i < allReviews.length; i++)
       {
        current = allReviews[i].getComment();
        if(current.length() > 0){
        if(current.indexOf("!") >= 0)
        {
            if(!(current.substring(current.length()-1).equals(".") || current.substring(current.length()-1).equals("!")))
            {
                current += ".";
            }
            comments.add(i + "-" + current) ;
        }
       }
    }
       return comments;
    }


}
