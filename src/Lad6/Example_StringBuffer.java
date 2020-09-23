package Lad6;

public class Example_StringBuffer {


    public static void maim(String[] args){
        StringBuffer str = new StringBuffer("Phloiphailin Khaokaeo");
        str.append("RUTS");
        str.insert(21," ");
        System.out.println(str);
        str.replace(0,6," Gat");
        System.out.println(str.reverse());

    }
}
