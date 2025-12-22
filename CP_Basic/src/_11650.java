import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point_sort implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {
		if (p1.x != p2.x) {
			return p1.x - p2.x;
		}
		return p1.y - p2.y;
	}

}

public class _11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		Point point[] = new Point[n];

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			point[i] = new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}

		Arrays.sort(point, new Point_sort());

		for (int i = 0; i < n; i++) {
			System.out.println(point[i].x + " " + point[i].y);
		}

	}

}
