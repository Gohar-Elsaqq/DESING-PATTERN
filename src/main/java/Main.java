import java.util.*;

public class Main {
<<<<<<< HEAD
    //Write a Java method that converts a list of strings into a list of integers,
    // assuming each string is a valid number. If a string is not a valid number,
    // replace it with 0.
    //["a","12","b"] ----> [0,12,0]
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<Integer> integerList = new ArrayList<>();
//        list.add("a");
//        list.add("12");
//        list.add("b");
//        for (String num : list) {
//            try {
//                Integer x = Integer.parseInt(num);
//                System.out.println(x);
//                integerList.add(x);
//            } catch (Exception exception) {
//                integerList.add(0);
//            }
//        }
//        System.out.println(integerList);
//        StringBuffer name = new StringBuffer();
//        name.append("ahmed");
//        System.out.println(name.reverse());


//    String nName = "ahmed";
//
//    for(int i=nName.length()-1;i>=0;i--){
//        System.out.print(nName.charAt(i));
//    }

//    int number=11211;
//    String result = Integer.toString(number);
//        System.out.println(result);
//        String reversed = new StringBuilder(result).reverse().toString();
//        System.out.println(reversed);
//        int reversedNumber = Integer.parseInt(reversed);
//        System.out.println(reversedNumber);
//        String name ="asdsa";
//        System.out.println(name);
//        String revrsed = new StringBuilder(name).reverse().toString();
//        System.out.println(revrsed);
//        String reversedName = new StringBuilder(name).toString();
//        System.out.println(reversedName);
//
        ///////////////////////////////////////////
//        String word = "asddsa";  // الكلمة التي ترغب في التحقق منها
//        if (isPalindrome(word)) {
//            System.out.println(word +" :  "+ true);
//        } else {
//            System.out.println(word +" : " +false);
//        }
        /////////////////////////
        String words="h world h h java world";
        System.out.println(most(words));
}
        public static String most(String test){
        HashMap<String,Integer>map = new HashMap<>();
        String[] words=test.split("\\s+");
        for (String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        return Collections.max(map.entrySet(),HashMap.Entry.comparingByValue()).getKey();
        }
//    public static String mostFrequentWord(String text) {
//        HashMap<String, Integer> map = new HashMap<>();
//        String[] words = text.split("\\s+");
//        for (String word : words) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//        String mostFrequent = null;
//        int maxCount = 0;
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > maxCount) {
//                maxCount = entry.getValue();
//                mostFrequent = entry.getKey();
//            }
//        }
//        return mostFrequent;
//    }

//    public static boolean isPalindrome(String word){
//            char[] charArray=word.toCharArray();
//            int length=charArray.length;
//            for(int i=0;i<length/2;i++){
//                if(charArray[i] !=charArray[length -i-1]){
//                    return false;
//                }
//            }
//            return true;
//        }
//    public static boolean isPalindrome(String word) {
//        int left = 0;
//        int right = word.length() - 1;
//
//        while (left < right) {
//            if (word.charAt(left) != word.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }


=======

    public static void main(String[] args) {
        System.out.println("ultimate-design-patterns-udemy");
    }
>>>>>>> main/master
}
