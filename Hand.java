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
      boolean strait == true;
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
      //this file is complete shit and wont work ;)
      sum = hand.get(0).value + hand.get(1).value + hand.get(2).value + hand.get(3).value + hand.get(4).value;
      if(hand.get(0).suit.equals(hand.get(1).suit) && hand.get(0).suit.equals(hand.get(2).suit) && hand.get(0).suit.equals(hand.get(3).suit) && hand.get(0).suit.equals(hand.get(4).suit) )
        suitSame == false;
      if(hand.get(0).value == hand.get(1).value -1 && hand.get(1).value == hand.get(2).value -1 && hand.get(2).value == hand.get(3).value -1 && hand.get(3).value == hand.get(4).value-1)
        straight == true;
      if(sum == 60 && suitSame)
        return 10000;
      else if(straight && suitSame)
        return 9000;
      else if()

      return "TODO: String of Best Hand; may need helper methods";
   }

   public int compareTo(Object x){
      Hand other = (Hand)x;
      //TODO: Compare hands by ordering above; return -1, 1, or 0
      return 0;
   }
}
