import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a:");
        a=scanner.nextInt();
        System.out.println("nhap b");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("khong duoc dau");
        }
        while (a!=b){
            if(a>b){
                a=a-b;
            }
            else
                b=b-a;
        }
        System.out.println("uoc chung lon nhat la"+a);
    }
}
