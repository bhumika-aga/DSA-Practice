package Others;

//Given a string, remove all a's from it and return the resulting string
public class RemoveChar {
    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        System.out.println(remove(str));
    }

    static String remove(String str) {
        String[] s = str.split("a");
        str = "";
        for (int i = 0; i < s.length; i++) {
            str += s[i];
        }
        return str;
    }
}