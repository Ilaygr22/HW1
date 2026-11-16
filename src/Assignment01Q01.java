public class Assignment01Q01 {
    public static void main(String[] args){
        for (int i = 0 ; i < args.length ; i++) {
            String word = args[i] ;
            int assci = (int) word.charAt(0)
            if (assci%5 == 0) {
            System.out.println(word.charAt(0));
                }
            }
        }
    }
}
