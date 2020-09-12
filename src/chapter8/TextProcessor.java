package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love anime.");
        reverseString("Hello world");
        addSpaces("HeyWorld!It'sMeBassam");
    }

    /**
     * Split a String into array.
     * @param text Full String to be split.
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contain %d words: ",numberOfWords);
        System.out.println(message);

        for (int i = 0; i<numberOfWords;i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order.
     * @param text Full String to be reversed.
     */
    public static void reverseString(String text){
        //start from last index then decrement it by i--.
        for (int i = text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i<modifiedText.length();i++){
            //check if its not index 0 and check the char at the index is uppercase
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                //after add space, need to increment index
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
