import java.util.Scanner;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point_sort {

	public static void bubble_sort(Point[] a) {
		bubble_sort(a, a.length);
	}

	private static void bubble_sort(Point[] a, int size) {

		for (int i = 1; i < size; i++) {

			for (int j = 0; j < size - i; j++) {

				if ((a[j].x > a[j + 1].x) || (a[j].x == a[j + 1].x && a[j].y > a[j + 1].y)) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	private static void swap(Point[] a, int i, int j) {
		Point temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

public class _11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Point point[] = new Point[n];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			point[i] = new Point(x, y);
		}

		Point_sort.bubble_sort(point);

		for (int i = 0; i < n; i++) {
			System.out.println(point[i].x + " " + point[i].y);
		}

	}

}
