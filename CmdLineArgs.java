public class CmdLineArgs{
    public static void main(String[] args) {
        int count=args.length;
        System.out.println(count);
        for(String e:args){
            System.out.println(e);
        }
    }
}
