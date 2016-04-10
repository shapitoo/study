package Package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Женя on 10.04.2016.
 */
public class TinyEdit {
    public static void main(String args[]){
        int counter=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String array[]=new String[100];
        System.out.println("введите строки! для прерывание напишите 'стоп'!");
        try {
        for(int i=0; i<100; i++) {
            array[i] = br.readLine();
            if (array[i].equals("стоп")) {
                counter=i;
                break;
            }
        }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        for(int i=0; i<counter; i++) {
            System.out.println(array[i]);
        }
    }
    }

