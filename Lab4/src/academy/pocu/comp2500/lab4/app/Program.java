package academy.pocu.comp2500.lab4.app;

import academy.pocu.comp2500.lab4.EvictionPolicy;
import academy.pocu.comp2500.lab4.MemoryCache;

public class Program {

    public static void main(String[] args) {
//        MemoryCache memCacheA = MemoryCache.getInstance("A");
//        MemoryCache memCacheB = MemoryCache.getInstance("B");
//        MemoryCache memCacheC = MemoryCache.getInstance("C");
//
//        memCacheA.setEvictionPolicy(EvictionPolicy.FIRST_IN_FIRST_OUT);
//
//        memCacheB.getEvictionPolicy();
//        MemoryCache.clear();
//        memCacheA.getEvictionPolicy();

//        memCacheC.setEvictionPolicy(EvictionPolicy.LAST_IN_FIRST_OUT);
//        memCacheA.getEvictionPolicy();


//        assert (memCacheA != memCacheB) && memCacheA != memCacheC;
//        assert memCacheB != memCacheC;
//
//        MemoryCache memCacheA = MemoryCache.getInstance("A");
//        MemoryCache memCacheB = MemoryCache.getInstance("B");
//        MemoryCache memCacheC = MemoryCache.getInstance("C");
//
//        MemoryCache.clear();
//        assert (memCacheA != MemoryCache.getInstance("A"));
//        assert (memCacheB != MemoryCache.getInstance("B"));
//        assert (memCacheC != MemoryCache.getInstance("C"));
//
//        MemoryCache memCacheA = MemoryCache.getInstance("A");
//        MemoryCache memCacheB = MemoryCache.getInstance("B");
//        MemoryCache memCacheC = MemoryCache.getInstance("C");
//        MemoryCache.setMaxInstanceCount(3);
//        MemoryCache memCacheD = MemoryCache.getInstance("D"); // memCacheA가 제거됨
//        //memCacheA = null;
//        assert (memCacheA != MemoryCache.getInstance("A"));
//
//
//        MemoryCache.clear();
//        MemoryCache.setMaxInstanceCount(5); // 여기 삭제하고도 잘 작동하는지??
//
//        MemoryCache memCacheA = MemoryCache.getInstance("A");
//        MemoryCache memCacheB = MemoryCache.getInstance("B");
//        MemoryCache memCacheC = MemoryCache.getInstance("C");
//        MemoryCache memCacheD = MemoryCache.getInstance("D");
//        MemoryCache memCacheE = MemoryCache.getInstance("E");
//
//
//        assert memCacheA != null;
//        assert memCacheB != null;
//        assert memCacheC != null;
//        assert memCacheD != null;
//        assert memCacheE != null;
//
//        assert memCacheA == MemoryCache.getInstance("A");
//        assert memCacheB == MemoryCache.getInstance("B");
//        assert memCacheC == MemoryCache.getInstance("C");
//        assert memCacheD == MemoryCache.getInstance("D");
//        assert memCacheE == MemoryCache.getInstance("E");
//
//        memCacheA.addEntry("test", "test");
//        assert memCacheA.getEntryOrNull("test").equals("test");
//        memCacheA.addEntry("test", "test2");
//        assert memCacheA.getEntryOrNull("test").equals("test2");
//
//        memCacheB.addEntry("test", "test");
//        assert memCacheB.getEntryOrNull("test").equals("test");
//
//        MemoryCache.setMaxInstanceCount(3);
//
//        assert memCacheC == MemoryCache.getInstance("C");
//        assert memCacheD == MemoryCache.getInstance("D");
//        assert memCacheE == MemoryCache.getInstance("E");
//        assert memCacheA != MemoryCache.getInstance("A");
//        assert memCacheB != MemoryCache.getInstance("B");
//
//        memCacheA = MemoryCache.getInstance("A");
//        memCacheB = MemoryCache.getInstance("B");
//        assert memCacheA.getEntryOrNull("test") == null;
//        assert memCacheB.getEntryOrNull("test") == null;
//
//        MemoryCache.clear();




//        MemoryCache memCacheA = MemoryCache.getInstance("A");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        MemoryCache memCacheB = MemoryCache.getInstance("B");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        MemoryCache memCacheC = MemoryCache.getInstance("C");
//
//        assert memCacheA == MemoryCache.getInstance("A");
//        assert memCacheB == MemoryCache.getInstance("B");
//        assert memCacheC == MemoryCache.getInstance("C");
//
//        memCacheA.setMaxInstanceCount(3);
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        MemoryCache memCacheD = MemoryCache.getInstance("D");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//
//        assert memCacheA != MemoryCache.getInstance("A");
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        assert memCacheC == MemoryCache.getInstance("C");
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        assert memCacheB != MemoryCache.getInstance("B");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        assert memCacheD != MemoryCache.getInstance("D");
//
//        memCacheA.clear();
//
//        MemoryCache memCache = MemoryCache.getInstance("A");
//        memCache.addEntry("key1", "value1");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        memCache.addEntry("key2", "value2");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        memCache.addEntry("key3", "value3");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        memCache.addEntry("key4", "value4");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.print("error");
//        }
//        memCache.addEntry("key5", "value5");
//
//        memCache.setMaxEntryCount(3);
//
//        assert memCache.getEntryOrNull("key1") == null;
//        assert memCache.getEntryOrNull("key2") == null;
//        assert memCache.getEntryOrNull("key3") != null;
//        assert memCache.getEntryOrNull("key4") != null;
//        assert memCache.getEntryOrNull("key5") != null;
//
//        memCache.addEntry("key6", "value6");
//
//        assert memCache.getEntryOrNull("key3") == null;
//
//        memCache.getEntryOrNull("key4");
//        memCache.getEntryOrNull("key5");
//        memCache.getEntryOrNull("key4");
//
//        memCache.addEntry("key7", "value7");
//
//        assert memCache.getEntryOrNull("key6") == null;
//
//        memCache.addEntry("key5", "value5_updated");
//        memCache.addEntry("key8", "value8");
//
//        assert memCache.getEntryOrNull("key4") == null;
//
//        assert memCache.getEntryOrNull("key5").equals("value5_updated");
//
//        memCache.setEvictionPolicy(EvictionPolicy.FIRST_IN_FIRST_OUT);
//
//        memCache.addEntry("key9", "value9");
//        assert memCache.getEntryOrNull("key5") == null;
//
//        memCache.addEntry("key10", "value10");
//        assert memCache.getEntryOrNull("key7") == null;
//
//        memCache.setMaxEntryCount(1);
//
//        assert memCache.getEntryOrNull("key8") == null;
//        assert memCache.getEntryOrNull("key9") == null;
//        assert memCache.getEntryOrNull("key10").equals("value10");
//
//        memCache.setMaxEntryCount(5);
//        memCache.setEvictionPolicy(EvictionPolicy.LAST_IN_FIRST_OUT);
//
//        memCache.addEntry("key11", "value11");
//        memCache.addEntry("key12", "value12");
//        memCache.addEntry("key13", "value13");
//        memCache.addEntry("key14", "value14");
//
//        assert memCache.getEntryOrNull("key10") != null;
//        assert memCache.getEntryOrNull("key11") != null;
//        assert memCache.getEntryOrNull("key12") != null;
//        assert memCache.getEntryOrNull("key13") != null;
//        assert memCache.getEntryOrNull("key14") != null;
//
//        memCache.addEntry("key15", "value15");
//
//        assert memCache.getEntryOrNull("key14") == null;
//
//        assert memCache.getEntryOrNull("key13") != null;
//        assert memCache.getEntryOrNull("key11") != null;
//        assert memCache.getEntryOrNull("key12") != null;
//        assert memCache.getEntryOrNull("key10") != null;
//        assert memCache.getEntryOrNull("key15") != null;
//
//        memCache.setEvictionPolicy(EvictionPolicy.LEAST_RECENTLY_USED);
//
//        memCache.addEntry("key16", "value16");
//
//        assert memCache.getEntryOrNull("key13") == null;
//        assert memCache.getEntryOrNull("key10") != null;
//        assert memCache.getEntryOrNull("key11") != null;
//        assert memCache.getEntryOrNull("key12") != null;
//        assert memCache.getEntryOrNull("key15") != null;
//        assert memCache.getEntryOrNull("key16") != null;
    }
}
