class MinStack {

    private List<Integer> items;
    private int min;

    public MinStack() {
        this.items = new ArrayList<>();
        this.min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        items.add(val);
        if (val < min) {
            min = val;
        }
    }
    
    public void pop() {
        items.removeLast();
        min = Integer.MAX_VALUE;
        for (int val : items) {
            if (val < min) {
                min = val;
            }
        }
    }
    
    public int top() {
        return items.get(items.size() - 1);
    }
    
    public int getMin() {
        return min;
    }
}
