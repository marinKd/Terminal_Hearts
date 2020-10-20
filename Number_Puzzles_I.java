import java.util.*;
import java.io.*;

public class Number_Puzzles_I{
    public static void main(String[] args) {

        //Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.
        System.out.println("testing");
        for(int x=10;x<=50;x++){;
            for(int y=10;y<=50;y++){
                if(x+y==60&&((x-y==14)||(y-x==14))){
                    System.out.println(x+" "+y);
                }
            }
        }
    }
}