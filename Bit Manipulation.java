import java.util.Scanner;

public class BS {
     int getBit(int n ,int i){
        int mask= (1<<i);
        int bit = (n & mask) > 0 ? 1:0;
        return bit;
    }
    int UpdateNum(int n,int i){
         int mask = ~(1<<i);
         int bit = n & mask;
         return bit;
    }
    int changeAperticularBit(int n,int p,int cng){
         int mask = (1<<p);
         return (n & ~mask)|(cng<<p);
    }
    int setBit(int n, int i){
         int mask =(1<<i);
         int bit = (n | mask);
         return bit;
    }
    public static void main(String[] args) {
         BS b = new BS();
        Scanner sc =new Scanner(System.in);

        System.out.println(b.changeAperticularBit(5,4,1));

    }


}

