package Package1;

/**
 * Created by Женя on 10.04.2016.
 */
public class DemoObj {
    public static void main(String args[]){
        Integer obI = new Integer(100);
        Integer obIn  = new Integer(99);
        int i = obI.intValue();
        Boolean obB = new Boolean(obI<obIn);
        boolean b = obB.booleanValue();
        System.out.println(i  + " object " + obI);
        System.out.println("boolean obB: " + b);
    }
}
