package company.stack_queue_task.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPtuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackInteger = new Stack<Integer>();
        Stack<Integer> reverseStackInteger = new Stack<Integer>();
        System.out.println("Nhập size của mảng :");
        int listSize = sc.nextInt();
        for (int i = 0; i <listSize ; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            int n = sc.nextInt();
            stackInteger.add(n);
        }
        System.out.println("Mảng vừa nhập là : " + stackInteger);
        for (int i = 0; i <listSize ; i++) {
            int a = stackInteger.pop();
            reverseStackInteger.push(a);
        }
        System.out.println("Mảng dảo ngược là : " + reverseStackInteger);
    }

}
