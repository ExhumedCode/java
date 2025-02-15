public class Main {
    public static void main(String[] args) {
        String oldString = """
                \"Why do programmers prefer dark mode?\" she asked.
                \"Because light attracts bugs!\" I replied.
                """;

        String youngAndStrongTextBlock = oldString.stripIndent().translateEscapes();

        System.out.println(youngAndStrongTextBlock);
        String text = """
                The compiler
                cannot handle
                the truth""";
        System.out.println(text);
    }
}