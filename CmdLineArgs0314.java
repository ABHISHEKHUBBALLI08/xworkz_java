public class CmdLineArgs0314{
    public static void main(String[] lens) {
        for(int i=0;i<lens.length;i++){
            if(lens[1]=="Java"){
                System.out.println(lens[i]);
                return;
            }else{
                System.out.println("not present");
            }
        }
    }
}
