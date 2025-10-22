package lab5;

import lab5.Point;

public class Point {
    private double x;
    private double y;

    // 构造方法（Constructor）
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 计算当前点与另一点之间的欧几里得距离（Euclidean distance）
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // getter 方法（为了封装性）
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // hashCode 方法（简单线性组合）
    @Override
    public int hashCode() {
        return (int) (3 * x + 5 * y);
    }

    // equals 方法，用于比较两个 Point 对象是否相等
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Point other = (Point) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
    }

    // 可选：方便打印点坐标
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
