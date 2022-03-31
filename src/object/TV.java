package object;

public class TV {
    String color;

    int channel;

    boolean power;

    void power() {
        power = !power;
    }

    void upChannel(){
        ++channel;
    }


    void downChannel(){
        --channel;
    }
}

class main {
    public static void main(String[] args) {

        TV t = new TV();

        t.channel = 7;

        t.downChannel();
        System.out.println(t.channel);

        t.upChannel();
        System.out.println(t.channel);

        t.power = true;
        System.out.println(t.power);

        t.power();
        System.out.println(t.power);



    }


}
