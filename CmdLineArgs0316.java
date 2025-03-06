public class CmdLineArgs0316 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }
        String firstArg = args[0];
        String upperCaseFirstArg = "";
        for (int i = 0; i < firstArg.length(); i++) {
            char ch = firstArg.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            }
            upperCaseFirstArg += ch;
        }
        System.out.println(upperCaseFirstArg);
        for (int i = 1; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
