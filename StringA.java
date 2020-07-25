public class StringA {
    public String remove_A(String s){
        if(s.length()==0 || (s.length()==1 && s.charAt(0)=='A'))
            return "";
        if(s.length()==1 && s.charAt(0)!='A')
            return s;
        if(s.charAt(1)=='A')
            s = s.charAt(0)+s.substring(2);
        if(s.charAt(0)=='A')
            s = s.substring(1);
        final String st = s;
        return st;
    }
}