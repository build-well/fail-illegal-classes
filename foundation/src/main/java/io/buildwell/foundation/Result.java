package io.buildwell.foundation;

import java.util.Date;

public class Result {
    private final int value;
    private final Date createdAt;

    public static Result now(int value) {
        return new Result(value, new Date());
    }

    public Result(int value, Date createdAt) {
        this.value = value;
        this.createdAt = createdAt;
    }

    public int getValue() {
        return value;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;

        if (value != result.value) return false;
        return createdAt != null ? createdAt.equals(result.createdAt) : result.createdAt == null;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "value=" + value +
                ", createdAt=" + createdAt +
                '}';
    }
}
