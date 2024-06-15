import java.util.*;
public class solution {
    public String fashionOrganize(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Use a max heap to store characters by their frequencies
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        // Step 3: Build the result string
        char[] result = new char[s.length()];
        int index = 0;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            int count = entry.getValue();
            char ch = entry.getKey();

            // Place the most frequent character
            for (int i = 0; i < count; ++i) {
                if (index >= s.length()) {
                    index = 1; // Start placing at the odd index
                }
                result[index] = ch;
                index += 2;
            }

            // If placing was not successful (more occurrences than allowed), return ""
            if (index >= s.length() && !maxHeap.isEmpty()) {
                return "";
            }
        }

        return new String(result);
    }
    public static void main(String[] args) {
        solution solution = new solution();
        
        String input;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        String result = solution.fashionOrganize(input);
        System.out.println("Result: " + result); 
    }
}