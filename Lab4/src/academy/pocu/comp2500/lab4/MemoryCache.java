package academy.pocu.comp2500.lab4;

import java.time.OffsetDateTime;
import java.util.*;

public class MemoryCache {
    private static HashMap<String, MemoryCache> instance = new HashMap<String, MemoryCache>();
    private static int memoryCacheMaxSize = 10;
    private OffsetDateTime modifiedDateTime;

    private MemoryCache() {
        this.modifiedDateTime = OffsetDateTime.now();
    }
    public static MemoryCache getInstance(String hardDiskName) {
        if (!instance.containsKey(hardDiskName)) {
            if (memoryCacheMaxSize == instance.size()) {
                List<Map.Entry<String, MemoryCache>> entries = new LinkedList<>(instance.entrySet());
                Collections.sort(entries, (t1, t2) -> t2.getValue().modifiedDateTime.compareTo(t1.getValue().modifiedDateTime));
                instance.remove(entries.get(0).getKey());
            }
            instance.put(hardDiskName, new MemoryCache());
        }
        System.out.println("hi" + instance);
        return instance.get(hardDiskName);
    }
    public void clear() {
        ArrayList<String> keyList = new ArrayList<String>();
        keyList.addAll(instance.keySet());
        for (String key : keyList) {
            instance.remove(key);
        }
    }
    public void setMaxInstanceCount(int size) {
        memoryCacheMaxSize = size;
    }

}
