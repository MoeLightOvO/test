package stringjoinerdemo;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String []args){
        StringJoiner sj=new StringJoiner(",","(",")");
        sj.add("aaa").add("bbb").add("ccc");
        String s=sj.toString();
        System.out.println(sj);
        System.out.println(sj.length());
        System.out.println(s);
    }
}
