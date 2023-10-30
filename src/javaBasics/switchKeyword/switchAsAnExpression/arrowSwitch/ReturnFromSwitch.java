package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

enum Cards { HEART, SPADE, SPARKLY, CLUB }

public class ReturnFromSwitch {
    public static void main(String[] args) {
        Cards card = Cards.SPADE;

        String cardType = switch(card){
          case HEART -> "hearts";
          case SPADE -> "spades";
          case SPARKLY -> "sparkly";
          case CLUB -> "clubs";
        };      // semicolon is compulsory here
        System.out.println("Card type: " + cardType);
    }
}
