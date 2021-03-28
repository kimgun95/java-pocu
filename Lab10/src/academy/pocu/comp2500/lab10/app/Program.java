package academy.pocu.comp2500.lab10.app;

import academy.pocu.comp2500.lab10.MovieStore;
import academy.pocu.comp2500.lab10.Request;
import academy.pocu.comp2500.lab10.pocuflix.*;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        Test1();
    }
    public static void Test1() {
        MovieStore store = new MovieStore();

        store.add(new Movie("Harry Potter", Rating.PG13, 180));
        store.add(new Movie("The Lord of the Rings", Rating.R, 180));

        assert (!store.remove(2));
        assert (store.remove(1));

        Request request = new Request("None");

        ResultBase result = store.handle(request);

        assert (result.getCode() == ResultCode.NOT_FOUND);
        assert (result instanceof NotFoundResult);

        request = new Request("Harry Potter");

        result = store.handle(request);

        assert (result.getCode() == ResultCode.OK);
        assert (result instanceof OkResult);

        OkResult okResult = (OkResult) result;

        assert (okResult.getMovie().getTitle().equals("Harry Potter"));
        assert (okResult.getMovie().getRating() == Rating.PG13);
        assert (okResult.getMovie().getPlayTime() == 180);
    }
}
