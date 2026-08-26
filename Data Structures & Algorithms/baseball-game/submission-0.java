class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>();

        for (String ops : operations) {
            int count = record.size();

            if (ops.equals("+")) {
                record.add(record.get(count - 2) + record.get(count - 1));
            } else if (ops.equals("D")) {
                record.add(record.get(count - 1) * 2);
            } else if (ops.equals("C")) {
                record.remove(count - 1);
            } else {
                record.add(Integer.parseInt(ops));
            }
        }

        int totalSum = 0;

        for (int score : record) {
            totalSum += score;
        }

        return totalSum;
    }
}