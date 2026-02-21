package javanotes;

import java.util.*;

public class StackReference {
    public static void main(String[] args) {
        Deque<String> languages = new ArrayDeque<>(); // new Stack<>();

        // Push
        languages.push("Java");
        languages.push("Python");
        languages.push("C++");
        System.out.println(languages);

        // Peek, Pop, Empty
        System.out.println(languages.peek());
        String removedLanguage = languages.pop();
        System.out.println(removedLanguage);
        System.out.println(languages.isEmpty());
    }
}
