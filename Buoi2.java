package Buoi02;
import java.util.Scanner;

/*
 * Operator
 * Standard input
 */

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Unary
		 * 	Postfix: a++, a--
		 * 	Prefix: ++a, --a
		 */
//		int a = 10;
//		System.out.println(a++);
//		System.out.println(a);
//		a++;
//		System.out.println(a);
//		System.out.println(a++ + 10 + a);  // a++ + 10 + a++
//											 // Gọi expr1 là a++ + 10 = 20  (expr1 -> postfix)
//											 // Gọi expr2 là expr1 + a++ (expr2 -> postfix)
//		System.out.println(a);
//		System.out.println(++a);
//		a++;
//		System.out.println(a);
//		System.out.println(++a + 10 + ++a);  // 11 + 10 + 12
//		System.out.println(++a + 10 + a++ + ++a + a++);  // 11 + 10 + 11 + 13 + 13
		// Gọi x1 = ++a + 10 (trước khi x1 thì a được tăng 1 đơn vị là = 11) x1 = 11 + 10
		// Gọi x2 = x1 + a++ (sau khi x2 thì a được tăng 1 đơn vị là = 12) x2 = 11 + 10 + 11
		// Gọi x3 = x2 + ++a (trước khi x3 thì a được tăng 1 đơn vị là = 13) x3 = 11 + 10 + 11 + 13
		// Gọi x4 = x3 + a++ (sau khi x4 thì a được tăng 1 đơn vị là = 14) x4 = 11 + 10 + 11 + 13 + 13
//		System.out.println(a);
//		System.out.println(++a + 10 + a-- + ++a + --a + a++);
		// x1 = ++a + 10 (trước x1 thì a = 11) x1 = 11 + 10
		// x2 = x1 + a-- (sau x2 thì a = 10) x2 = 11 + 10 + 11
		// x3 = x2 + ++a (trước x3 thì a = 11) x3 = 11 + 10 + 11 + 11
		// x4 = x3 + --a (trước x4 thì a = 10) x4 = 11 + 10 + 11 + 11 + 10
		// x5 = x4 + a++ (sau x5 thì a = 11) x5 = 11 + 10 + 11 + 11 + 10 + 10
		
		/*
		 * Phép /
		 * 	Nếu chia giữa 2 số nguyên thì kết quả là phép chia lấy nguyên
		 * 	Các trường hợp còn lại thì kết quả là phép chia lấy thực
		 */
//		int a = 17;
//		int b = 4;
//		System.out.println(1.0*a/b);
		
		/*
		 * Comparison
		 */
//		int a = 10;
//		int b = 10;
//		System.out.println(a >= b);
		
		/*
		 * Equality
		 */
//		String a = new String("Hello world!");
//		String b = new String("Hello world!");
//		System.out.println("Address of a: " + System.identityHashCode(a));
//		System.out.println("Address of b: " + System.identityHashCode(b));
//		System.out.println(a == b);
		
		/*
		 * Logical
		 * 	&& (và): chỉ trả về true nếu cả 2 vế điều kiện nó true
		 * 	|| (hoặc): chỉ trả về false nếu cả 2 vế điều kiện nó false
		 */
//		int a = 13;
//		int b = 11;
//		int c = 12;
////		System.out.println(a >= b || a < c);
//		System.out.println(!(a > b));
		
		/*
		 * Assignment
		 */
//		int a = 10;
////		a = a + 5;
//		a += 5;
		
		/*
		 * Input
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Hãy nhập vào tuổi của bạn: ");
		int age = input.nextInt();
		System.out.println("Tuổi của bạn là: " + age);
		input.close();
		
	}

}
