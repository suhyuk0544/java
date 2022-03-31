package Card;

import java.util.concurrent.Callable;

class p {

    public static void main(String[] args) {
        Card card = new Card(10);

        Card card1 = new Card(20);

        System.out.println(card.vs(1,2));

        if (card.num > card1.num){
            System.out.println(card.num + " > " + card1.num);
        }
        else {
            System.out.println(card.num + " > " + card1.num);
        }

    }

}


