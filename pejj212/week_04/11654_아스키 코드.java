public class Main {
    public static void main(String[] args) {
        /*
         * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int b = a.charAt(0);

        System.out.println(b);
    }
}