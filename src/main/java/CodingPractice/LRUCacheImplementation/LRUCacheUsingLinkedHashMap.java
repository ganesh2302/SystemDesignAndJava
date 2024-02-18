package CodingPractice.LRUCacheImplementation;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheUsingLinkedHashMap extends LinkedHashMap<Integer, Integer> {
        private final int maxCap;

        public LRUCacheUsingLinkedHashMap(int capacity) {
            super(capacity, 1.0f, true);
            maxCap = capacity;
        }

        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > maxCap;
        }

        public int get(int key) {
            return super.getOrDefault(key, -1);
        }
}
