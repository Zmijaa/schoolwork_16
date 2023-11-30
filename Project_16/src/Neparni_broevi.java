import java.util.Scanner;

public class Neparni_broevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Внесете должина: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i += 1) {
            sum += i;
        }

        System.out.println("Сумата на непарните броеви до " + n + " е: " + sum);
    }



	}


