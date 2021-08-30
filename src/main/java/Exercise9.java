
/*
I had a dream that Name ate a Color Animal
and said it tasted like Food!
to
I had a dream that Jake ate a blue dog
and said it tasted like hamburger!
 */
public class Exercise9 {
    public static void main(String[] args) {
        String word="I had a dream that Name ate a Color Animal\n" +
                "and said it tasted like Food!";
        String newWord=word.replace("Name","Jake");
        String finalWord=newWord.replace("Food","hamburger");
        System.out.println(finalWord);
    }
}
