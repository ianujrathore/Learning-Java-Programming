package Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String s = "Anuj";
        StringBuilder sb = new StringBuilder(s);
        sb.append("Rathore");
//        System.out.println(sb.reverse());

        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }
        System.out.println(sb);
    }
}
