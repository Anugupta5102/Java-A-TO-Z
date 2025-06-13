package DSA.Strings;

public class CountVowelsConsonants {
    public static void count(String str){
        int v=0;
        int con=0;

        str=str.toLowerCase();

        for(char c : str.toCharArray()){
            if(c >= 'a' || c<= 'z'){
                if(c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u'){
                    v++;
                }
                else{
                    con++;
                }
            }
        }
        System.out.println("Total vowels: "+v);
        System.out.println("Total consonants: "+con);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        count(str);
    }
}
