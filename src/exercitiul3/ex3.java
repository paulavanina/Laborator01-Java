package exercitiul3;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti un nr natural: ");
        int numar=scanner.nextInt();

        System.out.println("Divizorii numarului "+numar+ "sunt");
        afisare(numar);
    }
    public static void afisare(int numar)
    {
        boolean prim=true;
        for(int i=1;i<=numar;i++)
        {
            if(numar%i==0)
            {
                System.out.print(i+" ");
                if(i!=1&&i!=numar){
                    prim=false;
                }
            }
        }
    }
}
