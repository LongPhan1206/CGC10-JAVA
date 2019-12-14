package ClassAndObject;

public class StopWatch {
    private  long startTime;
    private  long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start() {
        this.startTime = System.nanoTime();
    }
    public void stop() {
        this.endTime = System.nanoTime();
    }
    public double getElapsedTime() {
        return getEndTime()-getStartTime();
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        System.out.println(time.getElapsedTime());
        time.stop();
        System.out.println(time.getElapsedTime());
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 101);
        }
    }
}
