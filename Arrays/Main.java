package Java.Youtube.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int k = 3;
        System.out.println(removeElement(arr, k));
    }
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                list.remove(i);
                i = 0;
            }
        }
        for (int i = 0; i < 1; i++) {
            int[] ref = new int[list.size()];
            for (int j = 0; j < ref.length; j++) {
                ref[j] = list.get(j);
            }
            nums = ref;
        }
        return list.size();
    }

    static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        while (!s.isEmpty()) {
            if (st.isEmpty()) {
                st.push(s.charAt(0));
            } else if (s.charAt(0) == '{' || s.charAt(0) == '[' || s.charAt(0) == '(') {
                st.push(s.charAt(0));
            } else if (s.charAt(0) == '}' && st.peek() == '{') {
                st.pop();
            } else if (s.charAt(0) == ')' && st.peek() == '(') {
                st.pop();
            } else if (s.charAt(0) == ']' && st.peek() == '[') {
                st.pop();
            } else {
                st.push(s.charAt(0));
            }
            s = s.substring(1);
        }
        return st.isEmpty();
    }
}
