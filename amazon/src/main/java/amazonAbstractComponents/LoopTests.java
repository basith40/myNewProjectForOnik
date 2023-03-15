package amazonAbstractComponents;

import org.testng.annotations.Test;

public class LoopTests {
    @Test
    public void loopWhile(){
        int i = 0;
        while (i<10){
           System.out.println(i);
           i++;
        }
    }
    @Test
    public void loopDoWhile(){
        int i = 10;
        do{
            System.out.println(i);
            i++;
        }while (i<20);
    }
    @Test
    public void loopNested(){
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }
    }
    @Test
    public void loopnestedOposit(){
        int k = 1;
        for (int i = 1; i < 5; i++){
            for(int j = 1; j< i*3; j++){
                System.out.print(j);
                System.out.print("\t");
               k++;
            }
            System.out.println(" ");
        }
    }
}

