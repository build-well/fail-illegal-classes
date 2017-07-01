package io.buildwell.foundation;

public class Calculator {
    public Result add(int a, int b) {
        return Result.now(a + b);
    }
}
