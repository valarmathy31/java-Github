package stringbuilder;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("valar");

    //append
    sb.append(" is learning");
    sb.append(" java");
    System.out.println("Result: " + sb);

    //Insert
    sb.insert(5, "mathy");
    System.out.println("After insert: " + sb);

    //replace
    sb.replace(23, 27, "python");
    System.out.println("After replace: " + sb);

    //delete
    sb.delete(10, 29);
    System.out.println("After delete: " + sb);

    //toString
    String result=sb.toString();
    System.out.println("result: " + result);

    //reverse
    sb.reverse();
    System.out.println("After reverse: " + sb);

    //capacity and length
    System.out.println("capacity: " + sb.capacity());
    System.out.println("length: " + sb.length());

  }
}
