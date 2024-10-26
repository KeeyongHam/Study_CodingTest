import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int result;

        while(true){
            try{
                int n = scanner.nextInt();
                int k = scanner.nextInt();

                result = n;

                while(true){
                    if(result / k == 0){
                        break;
                    }else{
                        n = n + result / k;
                        result = result / k + result % k;
                    }
                }

                System.out.println(n);

            }catch (Exception e){
                break;
            }
        }
    }
}  