public class WackyStringCount {

    public static void main(String[] args){

        String wacky = "supercalifragilisticexpialidocious";
        String foo = wacky.substring(wacky.length()-5, wacky.length()-1);
        String bar = wacky.substring(foo.length() +1, foo.length()+6);
        System.out.println(bar);

    }
}
