package Package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Женя on 10.04.2016.
 */
public class DemoBufferedReader {
    public static void main(String args[]){
        char symbol;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сообщение, для выхода введите q:");
        boolean count=true;
        while(count) {
            try {
                symbol=(char) bf.read();
                if (symbol=='q')
                    count=false;
                else
                    System.out.println(symbol);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("кнец!");
    }
}
