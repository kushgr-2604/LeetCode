class Solution {

    int top = -1;
    char[] arr;

    void push(char x) {
        arr[++top] = x;
    }

    char pop() {
        return arr[top--];
    }

    boolean isMatching(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }

    public boolean isValid(String s) {

        arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                push(x);
            } else {
                if (top == -1) return false;

                char open = pop();

                if (!isMatching(open, x))
                    return false;
            }
        }
        return top == -1;
    }
}
