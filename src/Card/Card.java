package Card;

public class Card {

    static int width = 100;

    static int height = 50;

    int num;

    Card (int num){

        this.num = num;

    }

    int vs (int a,int b){

        if (a > b){
            return a;
        }
        return b;
    }
}

