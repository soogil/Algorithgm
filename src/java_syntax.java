import java.util.*;


public class java_syntax {
    public static void main(String[] args) {
// List/ArrayList
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.addAll(List.of(1,2));
        a.get(0); // a.getFirst(); 로 사용가능
        a.set(0, 9);
        a.remove(Integer.valueOf(2));     // 값으로 삭제
        a.remove(0);                      // 인덱스로 삭제
        a.sort(Comparator.naturalOrder()); // 정렬
        Collections.binarySearch(a, 9);    // 이진탐색(정렬된 상태 필요)
        a.removeIf(x -> x < 0);            // 조건 삭제

// Map/HashMap
        Map<String, Integer> m = new HashMap<>();
        m.put("a", 1);
        m.getOrDefault("x", 0);
        m.putIfAbsent("b", 0);
        m.merge("a", 1, Integer::sum);     // 누적(빈도수 계산 핵심)
        m.computeIfAbsent("key", k -> 0);  // 없으면 생성
        m.remove("a", 2);                  // (키,값)쌍 일치 시에만 삭제
        for (var e : m.entrySet()) { System.out.println(e.getKey()+" "+e.getValue()); }

// 순서가 필요한 Map
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(); // 입력 순서 보존
        Map<Integer,String> treeMap = new TreeMap<>();       // 자동 정렬(키 오름차순)
        Map<Integer,String> hashMap = new HashMap<>();
//        tm.headMap(10);
//        tm.tailMap(10);
//        tm.subMap(3, 10); // 구간 조회
    }
}
