import java.util.Scanner;

public class operarting_system {

	public static void main(String[] args) throws Exception {
		String cam_re = null;
		String ram_re = null;
		String int_storage_re = null;
		Scanner scn = new Scanner(System.in);
		int input = 0;
		while (input < 4) {
			System.out.println("Enter The Operating System from following options: ");
			System.out.println("Enter 1 for Android");
			System.out.println("Enter 2 for iOS");
			System.out.println("Enter 3 for Windows");
			input = scn.nextInt();

			switch (input) {
			case 1:
				Android and = new Android();
				System.out.println("Select Features you want");
				System.out.println("Select number of camera's");
				and.no_of_cam();
				int a = scn.nextInt();
				if (a == 1)
					cam_re = and.cam_no_1;
				else if (a == 2)
					cam_re = and.cam_no_2;
				else if (a == 3)
					cam_re = and.cam_no_3;

				System.out.println("Select ram");
				and.ram();
				int b = scn.nextInt();
				if (b == 1)
					ram_re = and.ram_1;
				else if (b == 2)
					ram_re = and.ram_2;
				else if (b == 3)
					ram_re = and.ram_3;

				System.out.println("Select Internal Storage");
				and.int_storage();
				int c = scn.nextInt();
				if (c == 1)
					int_storage_re = and.int_storage_1;
				else if (c == 2)
					int_storage_re = and.int_storage_2;
				else if (c == 3)
					int_storage_re = and.int_storage_3;

				System.out.println("You have selected following features in your android device:");
				and.android_phone();
				System.out.println("Number of Camera's : " + cam_re);
				System.out.println("Random Access Memory : " + ram_re);
				System.out.println("Internal Storage : " + int_storage_re);
				System.out.println("---------------------------------------------");

				break;
			case 2:
				iOS is = new iOS();
				System.out.println("Select Features you want");
				System.out.println("Select number of camera's");
				is.no_of_cam();
				int e = scn.nextInt();
				if (e == 1)
					cam_re = is.cam_no_1;
				else if (e == 2)
					cam_re = is.cam_no_2;
				else if (e == 3)
					cam_re = is.cam_no_3;

				System.out.println("Select ram");
				is.ram();
				int f = scn.nextInt();
				if (f == 1)
					ram_re = is.ram_1;
				else if (f == 2)
					ram_re = is.ram_2;
				else if (f == 3)
					ram_re = is.ram_3;

				System.out.println("Select Internal Storage");
				is.int_storage();
				int g = scn.nextInt();
				if (g == 1)
					int_storage_re = is.int_storage_1;
				else if (g == 2)
					int_storage_re = is.int_storage_2;
				else if (g == 3)
					int_storage_re = is.int_storage_3;

				System.out.println("You have selected following features in your iOS device:");
				is.android_phone();
				System.out.println("Number of Camera's : " + cam_re);
				System.out.println("Random Access Memory : " + ram_re);
				System.out.println("Internal Storage : " + int_storage_re);
				break;
			case 3:
				windows win = new windows();
				System.out.println("Select Features you want");
				System.out.println("Select number of camera's");
				win.no_of_cam();
				int h = scn.nextInt();
				if (h == 1)
					cam_re = win.cam_no_1;
				else if (h == 2)
					cam_re = win.cam_no_2;
				else if (h == 3)
					cam_re = win.cam_no_3;

				System.out.println("Select ram");
				win.ram();
				int i = scn.nextInt();
				if (i == 1)
					ram_re = win.ram_1;
				else if (i == 2)
					ram_re = win.ram_2;
				else if (i == 3)
					ram_re = win.ram_3;

				System.out.println("Select Internal Storage");
				win.int_storage();
				int j = scn.nextInt();
				if (j == 1)
					int_storage_re = win.int_storage_1;
				else if (j == 2)
					int_storage_re = win.int_storage_2;
				else if (j == 3)
					int_storage_re = win.int_storage_3;

				System.out.println("You have selected following features in your windows device:");
				win.android_phone();
				System.out.println("Number of Camera's : " + cam_re);
				System.out.println("Random Access Memory : " + ram_re);
				System.out.println("Internal Storage : " + int_storage_re);
				break;

			}
		}
		scn.close();

	}

}
