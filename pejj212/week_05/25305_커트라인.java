public class Main {
    public static void main(String args[]) {
        /*
         * 2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다.
         * 이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
         * 커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
         */

        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        Integer arr[] =new Integer[N];
        for(int i=0; i<N; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[k-1]);
    }
}