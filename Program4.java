import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> res = new HashMap<>();

        for(int num:a)
            for(int i=1;i<=9;i++)
                if(num%i==0)
                    res.put(i, res.getOrDefault(i, 0)+1);

        for(int i=1;i<=9;i++)
            System.out.print(i + ":"+res.getOrDefault(i, 0)+" ");

    }
}
