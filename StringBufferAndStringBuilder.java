public class StringBufferAndStringBuilder {
    public static void main(String[] args){
        // String Buffer.
        // By using the string buffer we can change the string into a mutable string.
        StringBuffer sb = new StringBuffer("Vivin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" S.R");
        System.out.println(sb);

        sb.deleteCharAt(2);
        sb.insert(2, "v");
        System.out.println(sb);

        String str1 = sb.toString();
        System.out.println(str1);
    }
}
