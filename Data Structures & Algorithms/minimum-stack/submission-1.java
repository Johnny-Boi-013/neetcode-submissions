class MinStack {

    private List<Integer> items;

    public MinStack() {
        this.items = new ArrayList<>();
    }
    
    public void push(int val) {
        items.add(val);
    }
    
    public void pop() {
        items.removeLast();
    }
    
    public int top() {
        return items.get(items.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        for (Integer item : items) {
            if (min > item) {
                min = item;
            }
        }

        return min;
    }
}
