import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        this.graphics.clearScreen(1.f, 0.f, 0.f, 0.f); // argb
        this.graphics.clear(255, 0.f, 0.f, 255); // rgba
        try {
            // 시도할 코드들
        } catch (<예외 클래스 1> <변수명>) {
            // 예외 발생할 경우 처리할 코드
        } catch (<예외 클래스 2> <변수명>) {
            // 예외 발생할 경우 처리할 코드
        } finally {
            // 예외 발생 여부와 상관없이 항상 실행되는 코드
        }



    }
    public void writeByte(String relativePath, byte b) {
        Path path = Paths.get(getClassPath(), relativePath);

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(new File(path.toString()), true);
            out.write(b);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {

                }
            }
        }
    }
}

