public class Record {
    private final byte[]  rawData;

    public Record(byte[] rawData) {
        this.rawData = rawData;
    }
    public static class Reader {
        private final Record record;
        private int position;

        public Reader(Record record) {
            this.record = record;
        }
        public boolean canRead() {
            return this.position < this.record.rawData.length;
        }
        public byte readByte() {
            return this.record.rawData[this.position++];
        }
        public String readSignature() {

        }
    }
}
