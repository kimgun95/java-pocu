

public class Main {
    public static void main(String[] args) {
        Record record = new Record(fileData);

        Record.Reader reader1 = new Record.Reader(record);
        Record.Reader reader2 = new Record.Reader(record);

        if (reader1.canRead()) {
            System.out.println(reader1.readByte());
        }
        System.out.println(reader1.readSignature());
    }
}
