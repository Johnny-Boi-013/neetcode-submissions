class Solution {
    public boolean isValid(String s) {
        boolean check = true;
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (character == '}') {
                if (!brackets.isEmpty() && brackets.peek() == '{') {
                    brackets.pop();
                } else {
                    check = false;
                    break;
                }
            } else if (character == ']') {
                if (!brackets.isEmpty() && brackets.peek() == '[') {
                    brackets.pop();
                } else {
                    check = false;
                    break;
                }
            } else if (character == ')') {
                if (!brackets.isEmpty() && brackets.peek() == '(') {
                    brackets.pop();
                } else {
                    check = false;
                    break;
                }
            } else {
                brackets.push(character);
            }
        }

        return check && brackets.isEmpty();
    }
}
