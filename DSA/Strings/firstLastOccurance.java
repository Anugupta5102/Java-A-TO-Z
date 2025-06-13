package Strings;

public class firstLastOccurance {
        static int f=-1;
        static int l=-1;
    public static void occur(String s,char ch, int i){
        if(i==s.length()){
            System.out.println(f);
            System.out.println(l);
            return;

        }
        char curr=s.charAt(i);
        if(curr==ch){
            if(f==-1){
                f=i;
            }
            else{
                l=i;
            }
        }
        occur(s, ch, i+1);
        

    }
    public static void main(String[] args) {
        String s="ABAACDAEFAAH";
        char e='A';
        occur(s,e,0);
        
    }
    
}
