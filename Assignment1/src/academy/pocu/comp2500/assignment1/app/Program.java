package academy.pocu.comp2500.assignment1.app;

import academy.pocu.comp2500.assignment1.*;
import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
		Registry registry = new Registry();
		App app = new App(registry);
		registry.validate();

		Blog blog = new Blog("gun's blog");
		User a1 = new User("a1", "a1@naver.com");
		User a2 = new User("a2", "a2@google.com");
		Post p1 = new Post("p1", "something", a1);
		Post p2 = new Post("p2", "hello", a1);
		Post p3 = new Post("p3", "yay", a2);

		blog.addPost(p1);
		blog.addPost(p2);
		blog.addPost(p3);
		System.out.println(blog.getPostList());

		p1.addTag("t1");
		p2.addTag("t2");
		p3.addTag("t1");
		p3.addTag("t2");

		HashSet<String> tags = new HashSet<>();
		tags.add("t1");
		blog.setTagFilter(tags);
		System.out.println(blog.getPostList());

		tags.remove("t1");
		tags.add("t2");
		blog.setTagFilter(tags);
		System.out.println(blog.getPostList());

		tags.add("t1");
		blog.setTagFilter(tags);
		System.out.println(blog.getPostList());
	}
}