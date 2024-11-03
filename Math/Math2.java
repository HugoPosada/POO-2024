package Math;

public class Math2 implements IExtremos  {
    @Override
    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double max(double[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

