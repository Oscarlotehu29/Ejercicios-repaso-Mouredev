import java.util.Arrays;
public class ProblemTwo{
    public static void main(String[] args) {
        System.out.print(IsAnagram("amor", "roma")); 
    }
    
    public static boolean IsAnagram(String wordOne, String wordTwo){
        String WordOne = wordOne.toLowerCase();
        String WordTwo = wordTwo.toLowerCase();
        if(WordOne.equals(WordTwo)){
            return false;
        }
        else{
        char [] chars = WordOne.toCharArray();
        Arrays.sort(chars);
        WordOne = new String(chars);
        
        chars = WordTwo.toCharArray();
        Arrays.sort(chars);
        WordTwo = new String(chars);

        return WordOne.equals(WordTwo);
        }
    }
}