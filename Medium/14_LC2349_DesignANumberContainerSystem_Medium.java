import java.util.*;

class NumberContainers {

    HashMap<Integer, Integer> container = new HashMap<>();
    HashMap<Integer, TreeSet<Integer>> numbers = new HashMap<>();

    public NumberContainers() {
    }

    public void change(int index, int number) {

        if (container.containsKey(index)) {

            int oldNumber = container.get(index);

            numbers.get(oldNumber).remove(index);
        }

        container.put(index, number);

        numbers.putIfAbsent(number, new TreeSet<>());

        numbers.get(number).add(index);
    }

    public int find(int number) {

        if (!numbers.containsKey(number) ||
            numbers.get(number).isEmpty()) {
            return -1;
        }

        return numbers.get(number).first();
    }
}
