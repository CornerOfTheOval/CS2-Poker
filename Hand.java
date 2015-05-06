import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush
   Straight Flush
   Four of a Kind
   Full House
   Flush
   Straight
   Three of a Kind
   Two Pair
   One Pair
   High Card
   WORST
   */
   public String handValue() {
      boolean suitSame == false;
      boolean strait == false;
      boolean twoPair == false;
      ArrayList<Integer> containsNums = new ArrayList<Integer>(0,0,0,0,0);
      for(int i=0;i<5;i++){
        for(int j =0;j<5;j++){
          if(hand.get(i).value == hand.get(j).value)
            containsNums.set(i,containsNums.get(i)++);
        }
      }

      int highest = 0;
      for(int i=0;i<5;i++){
        if(containsNums.get(i) > highest)
          highest = containsNums.get(i);
      }

      int highIndex = hand.get(containsNums.indexOf(highest));

      containsNums.remove(containsNums.indexOf(highest));
      if(containsNums.contains(highest) && highest == 2)
        twoPair = true;

      int nxtHighest = 0;
      for(int i=0;i<5;i++){
        if(containsNums.get(i) > nxtHighest)
          nxtHighest = containsNums.get(i);
      }
      containsNums.add(highest);

      //this file is complete shit and wont work ;)
      sum = hand.get(0).value + hand.get(1).value + hand.get(2).value + hand.get(3).value + hand.get(4).value;
      if(hand.get(0).suit.equals(hand.get(1).suit) && hand.get(0).suit.equals(hand.get(2).suit) && hand.get(0).suit.equals(hand.get(3).suit) && hand.get(0).suit.equals(hand.get(4).suit) )
        suitSame == false;
      if(hand.get(0).value == hand.get(1).value -1 && hand.get(1).value == hand.get(2).value -1 && hand.get(2).value == hand.get(3).value -1 && hand.get(3).value == hand.get(4).value-1)
        straight == true;
      if(sum == 60 && suitSame)
        return "Royal Flush";//10000;
      else if(straight && suitSame)
        return "Straight Flush";//9000;
      else if(highest == 4)
        return "Four of a Kind";//8000;
      else if(highest == 3 && nxtHighest == 2)
        return "Full House";//7000;
      else if(suitSame)
        return "Flush";//6000;
      else if(straight)
        return "Straight";//5000;
      else if(highest == 3)
        return "Three of a Kind";//4000;
      else if(twoPair)
        return "Two Pair";//3000;
      else if(highest == 2)
        return "One Pair";//2000;
      else
        return "High Card";/*hand.get(highIndex).value*/


      return "TODO: String of Best Hand; may need helper methods";
   }

   public int compareTo(Object x){
      Hand other = (Hand)x;
      //TODO: Compare hands by ordering above; return -1, 1, or 0
      return 0;
   }
}
