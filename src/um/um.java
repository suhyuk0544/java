package um;

import object.TV;

import java.util.Date;

import static java.lang.System.out;


public class um{


    public static void main(String[] args) {

        Date date = new Date();

        ARR arr = new ARR(1,2,3);

        TV t1 = new TV();

//        arr.x = 1;
//
//        arr.y = 2;
//
//        arr.z = 3;




        out.println(arr.add());

        out.println(date);

        out.println(arr);


    }
}
