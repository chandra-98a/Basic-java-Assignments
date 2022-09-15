package question1;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
public class Transactiondemo{
	

	 public static void main(String[] args){    
		 
	        Trader raoul = new Trader("Raoul", "Cambridge");
	        Trader mario = new Trader("Mario","Milan");
	        Trader alan = new Trader("Alan","Cambridge");
	        Trader brian = new Trader("Brian","Cambridge");
	        Trader alany = new Trader("alany","delhi");
	        Trader chandra = new Trader("Chandra","pune");
	        
			List<Transaction> transactions = Arrays.asList(
					new Transaction(brian, 2011, 300),
					new Transaction(raoul, 2012, 1000),
					new Transaction(raoul, 2011, 400),
	            new Transaction(mario, 2012, 710),
	            new Transaction(mario, 2012, 700),
	            new Transaction(chandra, 2018,500),
	            new Transaction(alan, 2012, 950));
			
//year 2011 by value(small to high)
			List<Transaction> tr2011 = transactions.stream()
					.filter(transaction -> transaction
							.getYear() == 2011)
                    .sorted(comparing(Transaction::getValue))
                    .collect(toList());
             System.out.println(tr2011);
             System.out.println("................................");
 //uniquecities
                 List<String> cities = 
                         transactions.stream()
                                     .map(transaction -> transaction.getTrader().getCity())
                                     .distinct()
                                     .collect(toList());
                     System.out.println(cities);
                     System.out.println("................................");
  // Find all traders from Pune and sort them by name.
                     
                     List<Trader> traders = 
                         transactions.stream()
                                     .map(Transaction::getTrader)
                                     .filter(trader -> trader.getCity().equals("pune"))
                                     .distinct()
                                     .sorted(comparing(Trader::getName))
                                     .collect(toList());
                     System.out.println(traders);
                     System.out.println("................................");
 //Return a string of all traders’ names sorted alphabetically.
                     
   String traderStr = 
          transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                 .reduce("", (n1, n2) -> n1 + n2);
     System.out.println(traderStr);
     System.out.println("................................");
// Are there any trader based in Indor?
                     
   boolean milanBased =
           transactions.stream()
                       .anyMatch(transaction -> transaction.getTrader()
                       .getCity()
                       .equals("Indor"));
   System.out.println(milanBased);
   System.out.println("................................");
//Find all traders from delhi 
      List<Trader> traders1 = 
          transactions.stream()
                      .map(Transaction::getTrader)
                      .filter(trader -> trader.getCity().equals("delhi")).distinct()
                      .sorted(comparing(Trader::getName))
                      .collect(toList());
          System.out.println(traders1);
          System.out.println("................................");
// What's the highest value in all the transactions?
      int highestValue = 
          transactions.stream()
                      .map(Transaction::getValue)
                      .reduce(0, Integer::max);
      System.out.println("highestValue:"+highestValue);      
      System.out.println("................................");
//  What's the smallest value in all the transactions?
     int smallestValue = 
         transactions.stream()
                     .map(Transaction::getValue)
                     .reduce(1000, Integer::min);
     System.out.println("smallestValue:"+smallestValue);      
 }
}
                     

