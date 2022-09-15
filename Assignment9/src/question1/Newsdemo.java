package question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Newsdemo{

    static List<News> news = Arrays.asList(
            new News(101,"Ajith","Bhargavi","This is rediculous"),
            new News(203,"Manohar","Rakshith","Obviousely rediculous,i am not aware of budgets"),
            new News(203,"Manohar","Ramu","Heavyly rain"),
            new News(608,"Gangadar","HArih","Politics never made budgets correctly "),
            new News(608,"Gangadar","Rakshith","Politics move forward "),
            new News(234,"Namith","Gagan","call by ravindra"));
            

    public static void main(String[] args) {

 //newsId with max comments
 			
   // Optional<News> maxCommentedNewsId =news.stream().
    //		collect(Collectors. maxBy(Comparator.comparing(News::getComment)));
  //  System.out.println("NewsId with max comments:"+ 
 //   (maxCommentedNewsId .isPresent()? maxCommentedNewsId.get():"Not Applicable"));
    	List<News> maximum=news.stream()
    			.collect(groupingBy(News::getComment))
    			.entrySet()
    			.stream().max(Comparator.comparing(Map.Entry::getKey)).get().getValue();
 //newsId with min comments
      Optional<News> minCommentedId =news .stream().
	  collect(Collectors.minBy(Comparator.comparing(News::getComment)));
       System.out.println("Newsid with min comments:"+ 
	   (minCommentedId .isPresent()? minCommentedId.get():"Not Applicable"));
    	
 //budget count
    	long ex=news.stream().filter(s->s.getComment().contains("budget")).count();
    	System.out.println(ex);
    
    	
 //display commentbyuser wise number of comments
    List<News> sortedList = news.stream()
     			.sorted(Comparator.comparing(News::getCommentByUser)).
     			collect(Collectors.toList());
        sortedList.forEach(System.out::println); 
        //which user has posted more comments 
        Optional<News> maxPostNewsId =news.stream().
        		collect(Collectors. maxBy(Comparator.comparing(News::getPostedByUser)));
        System.out.println("NewsId with max comments:"+ 
        (maxPostNewsId .isPresent()? maxPostNewsId.get():"Not Applicable"));
        
    	
 }
static class News {
int newsId;
String postedByUser;
String commentByUser;
String comment;
public News(int newsId, String postedByUser, String commentByUser, String comment) {
	super();
	this.newsId = newsId;
	this.postedByUser = postedByUser;
	this.commentByUser = commentByUser;
	this.comment = comment;
}
public static Object stream() {
	// TODO Auto-generated method stub
	return null;
}
public int getNewsId() {
	return newsId;
}
public void setNewsId(int newsId) {
	this.newsId = newsId;
}
public String getPostedByUser() {
	return postedByUser;
}
public void setPostedByUser(String postedByUser) {
	this.postedByUser = postedByUser;
}
public String getCommentByUser() {
	return commentByUser;
}
public void setCommentByUser(String commentByUser) {
	this.commentByUser = commentByUser;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
@Override
public String toString() {
    return "News{" +
           "newsId=" +newsId+"->"+  "posetdByUser=" +postedByUser+"->"+ "CommentByUser" + "->"+ commentByUser+
           "->"+ "comment=" +comment+"}";
}
}
}
