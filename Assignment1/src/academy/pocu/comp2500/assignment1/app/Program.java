package academy.pocu.comp2500.assignment1.app;

import academy.pocu.comp2500.assignment1.App;
import academy.pocu.comp2500.assignment1.Blog;
import academy.pocu.comp2500.assignment1.Post;
import academy.pocu.comp2500.assignment1.registry.Registry;

import java.time.OffsetDateTime;

public class Program {

    public static void main(String[] args) {

		Blog gun = new Blog();

		Post post1 = new Post("hope", "Harry", "this is my first story");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.print("error");
		}
		Post post2 = new Post("love", "David", "this is my second story");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.print("error");
		}
		Post post3 = new Post("jordi", "Junho", "this is my third story");

		gun.addPost(post1);
		gun.addPost(post2);
		gun.addPost(post3);
//		gun.setPostOrder(2);

		post1.addPostTag("animal");
		post2.addPostTag("book");
		post3.addPostTag("book");
		post2.addPostTag("math");
//		System.out.print(post1.getTags() + " " + System.lineSeparator());
//		System.out.print(post2.getTags() + " " + System.lineSeparator());
//		System.out.print(post3.getTags() + " " + System.lineSeparator());

//		gun.setTagFilter("math");

//		System.out.print(gun.getAuthorFilter() + " " + System.lineSeparator());

//		gun.setAuthor("Junho");
		gun.getPostList();

		Registry registry = new Registry();
		App app = new App(registry);
		registry.validate();
	}
}
