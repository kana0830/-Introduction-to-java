// 練習問題5-1解答
public class Main {
  public static void main(String[] args) {
    introduceOneself();
  }
  public static void introduceOneself() {
    String name = "賢志郎";
    int age = 36;
    double height = 170;
    char animal = '子';
    System.out.println("僕は" + name + "。" + age + "歳の" + animal + "年で、" + "身長は" + height + "cmだよ");
  }
}

// 練習問題5-2解答
public class Main {
  public static void main(String[] args) {
    String title = "明日の予定";
    String address = "test@test.com";
    String text = "10時待ち合わせで！";
    email(title, address, text);
  }
  
  public static void email(String title, String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}

// 練習問題5-3解答
public class Main {
  public static void main(String[] args) {
    String title = "明日の予定";
    String address = "test@test.com";
    String text = "10時待ち合わせで！";
    email(title, address, text);
    email(address, text);
  }
  
  public static void email(String title, String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  
  public static void email(String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("無題");
    System.out.println("本文：" + text);
  }
}

// 練習問題5-4解答
public class Main {
  public static void main(String[] args) {
    System.out.println(calcTraiangleArea(3, 5));
    System.out.println(calcCircleArea(2));
  }
  
  public static double calcTraiangleArea(double bottom, double height){
    return bottom * height / 2;
  }
  
  public static double calcCircleArea(double radius){
    return radius * radius * 3.14;
  }
}