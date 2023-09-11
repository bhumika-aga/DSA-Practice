package Others;

//Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed.
public class RemoveStringPart {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(remove(s, part));
    }

    static String remove(String s, String part) {
        int j = 1;
        while (j != 0) {
            if (s.contains(part)) {
                String[] str = s.split(part);
                s = "";
                for (int i = 0; i < str.length; i++) {
                    s += str[i];
                }
            } else {
                j = 0;
            }
        }
        return s;
    }
}