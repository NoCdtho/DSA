//wusestion is to skip the special chracter(#&*) and a letter next to it


public class SpecialSkipper {
    public static void main(String[] args) {
        skipper("", "#*asd$$dsaa");
        
    }
    public static void skipper(String p,  String up){
        //base case
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        String str = "";
        int indexfin = 0;
        char ch = up.charAt(0);
        if(ch == '#' || ch == '$' || ch == '*'){
            indexfin = indexFinder(up);
            if(indexfin != -1 && (indexfin+1) < up.length()){
                //new up string that removde the letter and ch
                 str = up.substring(1, indexfin) + up.substring(indexfin+1);
                 skipper(p, str);
            }
            else{
                skipper(p, "");
            }
        }
        else{
            skipper(p + ch,up.substring(1));
        }
    }

    public static int indexFinder(String up){
        for(int i = 1; i< up.length(); i++){
        char c = up.charAt(i);
            if(c != '#' && c != '*' && c != '$'){
                return  i;
            }    
        }
        return -1;
    }
}