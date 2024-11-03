import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задача №1
        List<Integer> nums = new ArrayList<>(List.of(1,1,2,3,4,4,5,5,6,7));
        for(int i =0; i < nums.size(); i++) {
            if(nums.get(i)%2!=0){
                System.out.println(nums.get(i));
            }
        }
        // задача №2
        System.out.println("===========================");
        List<Integer> nums1 = new ArrayList<>(List.of(1,1,2,3,4,4,5,5,6,7));
        for(int i =0; i < nums1.size(); i++) {
            if(nums1.get(i)%2==0){
                System.out.println(nums1.get(i));
            }
        }
        // задача №3
        System.out.println("===========================");
        List<String> justWords = new ArrayList<>(List.of("число","слово","слово","веревка",
                "слон","слон","ласточка","собака","собака"));
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(justWords);
        System.out.println(justWords);
        System.out.println(uniqueWords);

        // задача №4
        System.out.println("===========================");
        List<String> strings = new ArrayList<>(List.of("один","два","два","три","три","три"));
        Map<String,Integer> duplicates = new HashMap<>();
        //int i = 1;
        for(String string: strings) {
            if (duplicates.containsKey(string))
            {
                duplicates.put(string, duplicates.get(string) + 1);
            } else {
                duplicates.put(string, 1);
            }
        }
            System.out.println(duplicates.values());
    }

}