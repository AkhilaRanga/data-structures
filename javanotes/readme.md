### Java data structures

#### Run
`java <FileName>.java`
`java ArrayListReference.java`

#### Order
```
ArraysReference
ArrayListReference
LinkedListReference
StackReference
QueueReference
DequeReference
PriorityQueueReference
HashSetReference
HashMapReference
```

#### Quick reference
```java
StringBuilder sb = new StringBuilder();            // append, reverse, toString, charAt, setCharAt, deleteCharAt, length, insert
List<Integer> list = new ArrayList<>();            // add, remove, get, set, contains, size
Queue<Integer> queue = new ArrayDeque<>();         // offer, poll, peek, isEmpty, size
Deque<Integer> stack = new ArrayDeque<>();         // push, pop, peek, isEmpty, size
Deque<Integer> dq = new ArrayDeque<>();            // offerFirst, offerLast, pollFirst, pollLast, peekFirst, peekLast  // monotonic, deque
Set<Integer> set = new HashSet<>();                // add, remove, contains, isEmpty, size
Map<Integer, Integer> map = new HashMap<>();       // put, remove, getOrDefault, putIfAbsent, containsKey, isEmpty, size, keySet, values, entrySet
PriorityQueue<Integer> mn = new PriorityQueue<>(); // offer, poll, peek, size, isEmpty
PriorityQueue<Integer> mx =
    new PriorityQueue<>(Comparator.reverseOrder()); // offer, poll, peek, size, isEmpty
PriorityQueue<int[]> pq =
    new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // Double, Character
TreeSet<Integer> ts = new TreeSet<>();             // ceiling, floor, higher, lower  // sorted
TreeSet<Integer> revTs =
    new TreeSet<>(Comparator.reverseOrder());      // reverse sorted
TreeMap<Integer, Integer> tm = new TreeMap<>();    // ceilingKey, floorKey, higherKey, lowerKey, firstKey, lastKey  // sorted
LinkedHashSet<Integer> ls = new LinkedHashSet<>(); // add, remove, contains, iterator  // preserve insertion order
LinkedHashMap<Integer, Integer> lm = 
    new LinkedHashMap<>();                         // put, remove, getOrDefault, containsKey  // preserve insertion order
```