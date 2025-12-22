package searching;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String word = "Thahir is Learning DSA";
        char target = 'L';
        System.out.println(linearSearchINString(word, target));
    }

    private static boolean linearSearchINString(String word, char target) {

        if(word.isEmpty()) return false;

        for(char c : word.toCharArray()){
            if(c == target) return true;
        }

        return false;
    }


}
