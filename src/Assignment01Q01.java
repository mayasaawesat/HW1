public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            char firstCh=args[i].charAt(0);
            if (firstCh%5==0){
                System.out.println(firstCh);
            }

        }
    }
}
