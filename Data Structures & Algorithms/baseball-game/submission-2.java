class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ops = new Stack<>();
        int totalScore = 0;

        for (int i = 0; i < operations.length; i++) {
            String oper = operations[i];

            if (oper.equals("+")) {
                int last = ops.pop();
                int secondLast = ops.peek();
                ops.push(last);
                ops.push(last + secondLast);
            } else if (oper.equals("D")) {
                ops.push(ops.peek() * 2);
            } else if (oper.equals("C")) {
                ops.pop();
            } else {
                ops.push(Integer.parseInt(operations[i]));
            }
        }

        while (!ops.isEmpty()) {
            totalScore += ops.pop();
        }

        return totalScore;
    }
}