package linkedlist;

public class RemoveLetter {
    void main() {
        String s = "baccad";
        System.out.print(removeLetter(s, 'a'));
    }

    public static String removeLetter(String s, char remove) {

        StringBuilder res = new StringBuilder();
        StringBuilder result = removeLetter(s, 0, res, remove);

        return result.toString();
    }

    public static StringBuilder removeLetter(String s, int i, StringBuilder result, char remove) {
        if(i == s.length()) return result;

        if(s.charAt(i) != remove) {
            result.append(s.charAt(i));

        }
        return removeLetter(s, i + 1, result, remove);
    }

}
