package um;

import object.TV;

import static java.lang.System.out;

public class ARR extends sans{

    int z;

    ARR(int x, int y,int z) {

        super(x, y);

        this.z = z;
    }

    String add(){
        return "x:"+x+" y:"+y+" z:"+z;
    }

}

