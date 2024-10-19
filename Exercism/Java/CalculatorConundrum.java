class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        switch (operation) {
            case "+":
                int p = operand1 + operand2;
                return String.format("%d + %d = %d", operand1, operand2, p);
            case "*":
                int m = operand1 * operand2;
                return String.format("%d * %d = %d", operand1, operand2, m);
            case "/":
                try {
                    int d = operand1 / operand2; 
                    return String.format("%d / %d = %d", operand1, operand2, d);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e); 
                }
            default:
                throw new IllegalOperationException("Operation '" + operation + "' is not supported");
        }
    }
}

