package builder;

/**
 * @Author rope
 * @Date 2020/9/1 21:44
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0;i < count;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb.toString());
    }
}
