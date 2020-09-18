public class Main {
  // 練習問題4-1解答
  public static void points(String[] args) {
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];
  }

  // 練習問題4-2解答
  public static void moneyList(String[] args) {
    int[] moneyList = {121902, 8302, 55100};
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    for (int list: moneyList) {
      System.out.println(list);
    }
  }

  // 練習問題4-4解答
  public static void numbers(String[] args) {
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int num: numbers) {
      if (num == input){
        System.out.println("アタリ！");
      }
    }
  }
}