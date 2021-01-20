package academy.pocu.comp2500.assignment1.app;

import academy.pocu.comp2500.assignment1.Blog;

import java.time.OffsetDateTime;

//import static jdk.nashorn.internal.objects.Global.print;

public class Program {

    public static void main(String[] args) {
//	    int time;
//	    OffsetDateTime t1;
//	    t1 = OffsetDateTime.now();
//		System.out.print(t1 + System.lineSeparator());
//		OffsetDateTime t2;
//		t2 = OffsetDateTime.now();
//		System.out.print(t2 + System.lineSeparator());
//		System.out.printf(String.valueOf(t1.compareTo(t2)));
		Blog gun = new Blog();
		gun.addPost("hope", "this is my first story", OffsetDateTime.now());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.print("error");
		}

		gun.addPost("love", "this is my second story", OffsetDateTime.now());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.print("error");
		}
		gun.addPost("jordi", "this is my third story", OffsetDateTime.now());

//		System.out.print(gun.getPostList());
		gun.getPostList();
	}
}
