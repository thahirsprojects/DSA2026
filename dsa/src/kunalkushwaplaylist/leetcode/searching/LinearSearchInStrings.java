package kunalkushwaplaylist.leetcode.searching;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String str = "Thahir is Learning DSA";
        char target = 'L';
        System.out.println(linearSearchINString(str, target));
    }

    private static boolean linearSearchINString(String str, char target) {

        if(str.isEmpty()) return false;

//        Using for each
//        for(char c : str.toCharArray()){
//            if(c == target) return true;
//        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)) return true;
        }

        return false;
    }


}
