package util;

import java.util.Scanner;

public class MenuUtil {
    public byte entry(){
        System.out.println(
                "[1].Eat meat(+9%)"+"\n"+
                        "[2].Drink milk(+8%)"+ "\n"+
                        "[3].Show energy"

        );
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose: ");
        byte option=scanner.nextByte();
        return option;
    }
}
