package reto2.piramide;

public class process {
    public static void printTriangle(short altura){
        for(short i = 1; i <= altura; ++i){
            for(short j = 1; j <= i; ++j)
                System.out.print("*");

        }
        System.out.println();
        for(int i= altura-1;1>=1;i--){
            for (short j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
