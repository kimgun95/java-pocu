package academy.pocu.comp2500.lab11.app;

import academy.pocu.comp2500.lab11.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) throws IOException {
        // write your code here
        App app = new App();

        app.run(new BufferedReader(new InputStreamReader(System.in)), System.out, System.err);
    }
}
