package DSA.Strings;


public class StringDuplicates {
    public static void main(String[] args) {
        String str="ABCACABCAA";
        String res=" ";
        for(int i=0;i<str.length();i++){
            String ch=""+str.charAt(i);//char to str
            if(res.contains(ch)){
                continue;
            }
            res += ch;
        }
        System.out.println(res);
    }
}
