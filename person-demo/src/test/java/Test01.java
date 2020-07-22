import java.util.ArrayList;

/**
 * @author ChuanTan
 * @date 2020-07-20 - 22:50
 */
public class Test01 {
    public static void main(String[] args) {
        int num=10;
        System.out.println("num = " + num);

        String[] arr=new String[]{"hanmeiemi","make","lilei","koo"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
        for (String s : arr) {
            System.out.println(s);

        }
        System.out.println("-----------------");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        for (Object o : list) {
            System.out.println(o);

        }
        System.out.println("-----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);

        }

    }
}
