package StringManipulation;

public class CaseToggle {

    public static String toggleCase(String s){
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()){

            if ( c >= 'A' && c <= 'Z'){
                result.append((char) (c + 32));

            } else if(c>= 'a' && c <= 'z'){
                result.append((char) (c - 32));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main (String[] args){
        String s = ".Hel.lo World.";
        System.out.println(toggleCase(s));
    }
}

