package academy.pocu.comp2500.lab4;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MemoryCache {
    private static HashMap<String, MemoryCache> instance = new HashMap<String, MemoryCache>();
    // 무조건 입력 순서대로
    private static LinkedList<String> instanceLinkedList = new LinkedList<>();
    // 무조건 수정 순서대로
    private static LinkedHashSet<String> instanceLinkedHashSet = new LinkedHashSet<>();
    private static int memoryCacheMaxSize = 1000000;
    private static EvictionPolicy evictionPolicy = EvictionPolicy.LEAST_RECENTLY_USED;
    private HashMap<String, String> entry = new HashMap<>();
    private LinkedList<String> entryLinkedList = new LinkedList<>();
    private LinkedHashSet<String> entryLinkedHashSet = new LinkedHashSet<>();
    private int entryMaxSize = 1000000;

    private MemoryCache() {
    }
    public static MemoryCache getInstance(String hardDiskName) {
        if (!instance.containsKey(hardDiskName)) {
            if (MemoryCache.memoryCacheMaxSize == instance.size()) {
                if (evictionPolicy == EvictionPolicy.FIRST_IN_FIRST_OUT) {
                    instance.remove(instanceLinkedList.getFirst());
                    instanceLinkedHashSet.remove(instanceLinkedList.getFirst());
                    instanceLinkedList.remove(0);
                } else if (evictionPolicy == EvictionPolicy.LAST_IN_FIRST_OUT) {
                    instance.remove(instanceLinkedList.getLast());
                    instanceLinkedHashSet.remove(instanceLinkedList.getLast());
                    instanceLinkedList.remove(instanceLinkedList.size() - 1);
                } else {
                    instance.remove(instanceLinkedHashSet.iterator().next());
                    int cnt = 0;
                    for (String str : instanceLinkedList) {
                        if (str.equals(instanceLinkedHashSet.iterator().next())) {
                            instanceLinkedList.remove(cnt);
                            break;
                        }
                        cnt += 1;
                    }
                    instanceLinkedHashSet.remove(instanceLinkedHashSet.iterator().next());
                }
            }
            instance.put(hardDiskName, new MemoryCache());
            instanceLinkedList.add(hardDiskName);
        } else {
            instanceLinkedHashSet.remove(hardDiskName);
        }
        instanceLinkedHashSet.add(hardDiskName);
        //System.out.println("inst" + instance);
        //System.out.println("LRU" + instanceLinkedHastSet);
        //System.out.println("FIFO" + instanceLinkedList);
        return instance.get(hardDiskName);
    }
    public static void clear() {
        instance.clear();
        instanceLinkedList.clear();
        instanceLinkedHashSet.clear();
    }
    public static void setMaxInstanceCount(int size) {
        memoryCacheMaxSize = size;
        while (memoryCacheMaxSize < instance.size()) {
            if (evictionPolicy == EvictionPolicy.FIRST_IN_FIRST_OUT) {
                instance.remove(instanceLinkedList.getFirst());
                instanceLinkedHashSet.remove(instanceLinkedList.getFirst());
                instanceLinkedList.remove(0);
            } else if (evictionPolicy == EvictionPolicy.LAST_IN_FIRST_OUT) {
                instance.remove(instanceLinkedList.getLast());
                instanceLinkedHashSet.remove(instanceLinkedList.getLast());
                instanceLinkedList.remove(instanceLinkedList.size() - 1);
            } else {
                instance.remove(instanceLinkedHashSet.iterator().next());
                int cnt = 0;
                for (String str : instanceLinkedList) {
                    if (str.equals(instanceLinkedHashSet.iterator().next())) {
                        instanceLinkedList.remove(cnt);
                        break;
                    }
                    cnt += 1;
                }
                instanceLinkedHashSet.remove(instanceLinkedHashSet.iterator().next());
            }
        }
    }
    public void setEvictionPolicy(EvictionPolicy evictPolicy) {
        evictionPolicy = evictPolicy;
    }
    public void addEntry(String key, String value) {
        if (!this.entry.containsKey(key)) {
            if (entryMaxSize == entry.size()) {
                if (evictionPolicy == EvictionPolicy.FIRST_IN_FIRST_OUT) {
                    entry.remove(entryLinkedList.getFirst());
                    entryLinkedHashSet.remove(entryLinkedList.getFirst());
                    entryLinkedList.remove(0);
                } else if (evictionPolicy == EvictionPolicy.LAST_IN_FIRST_OUT) {
                    entry.remove(entryLinkedList.getLast());
                    entryLinkedHashSet.remove(entryLinkedList.getLast());
                    entryLinkedList.remove(entryLinkedList.size() - 1);
                } else {
                    entry.remove(entryLinkedHashSet.iterator().next());
                    int cnt = 0;
                    for (String str : entryLinkedList) {
                        if (str.equals(entryLinkedHashSet.iterator().next())) {
                            entryLinkedList.remove(cnt);
                            break;
                        }
                        cnt += 1;
                    }
                    entryLinkedHashSet.remove(entryLinkedHashSet.iterator().next());
                }
            }
            entry.put(key, value);
            entryLinkedList.add(key);
        } else {
            entry.put(key, value);
            entryLinkedHashSet.remove(key);
        }
        entryLinkedHashSet.add(key);
        //System.out.println("inst" + entry);
        //System.out.println("LRU" + entryLinkedHashSet);
        //System.out.println("FIFO" + entryLinkedList);
    }
    public void setMaxEntryCount(int size) {
        this.entryMaxSize = size;
        while (entryMaxSize < entry.size()) {
            if (evictionPolicy == EvictionPolicy.FIRST_IN_FIRST_OUT) {
                entry.remove(entryLinkedList.getFirst());
                entryLinkedHashSet.remove(entryLinkedList.getFirst());
                entryLinkedList.remove(0);
            } else if (evictionPolicy == EvictionPolicy.LAST_IN_FIRST_OUT) {
                entry.remove(entryLinkedList.getLast());
                entryLinkedHashSet.remove(entryLinkedList.getLast());
                entryLinkedList.remove(entryLinkedList.size() - 1);
            } else {
                entry.remove(entryLinkedHashSet.iterator().next());
                int cnt = 0;
                for (String str : entryLinkedList) {
                    if (str.equals(entryLinkedHashSet.iterator().next())) {
                        entryLinkedList.remove(cnt);
                        break;
                    }
                    cnt += 1;
                }
                entryLinkedHashSet.remove(entryLinkedHashSet.iterator().next());
            }
        }
        //System.out.println("inst" + entry);
        //System.out.println("LRU" + entryLinkedHashSet);
        //System.out.println("FIFO" + entryLinkedList);
    }
    public String getEntryOrNull(String key) {
        if (!entry.containsKey(key)) {
            return null;
        } else {
            entryLinkedHashSet.remove(key);
            entryLinkedHashSet.add(key);
            return entry.get(key);
        }
    }
}
