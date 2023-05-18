public class StringArr {

    public static String f(String s, int num){
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
                if(cnt < num){
                    sb.append(s.charAt(i));
                }
            }else{
//                if(cnt <= num){
                    sb.append(s.charAt(i));
//                }
                cnt = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "aaaabbbbcccccdeffaaa";
        System.out.println(f(s,2));
    }
}
