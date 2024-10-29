public class ApproximateTime {
    public static void main(String[] args) {
        // Below is how to display how many milliseconds have passed since the Unix
        // Epoch
        long totalMilliseconds = System.currentTimeMillis();
        // Below is how to convert that time to seconds (why 1000? because there are
        // 1000 milliseconds in a second)
        long totalSeconds = totalMilliseconds / 1000;
        // Below is how to get the current second
        // by getting the remainder of totalSeconds divided by 60
        // (because there are 60 seconds in a minute...
        // and what is left over is the remaining second which is the current second)
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long currentHourEST = currentHour - 4;
        System.out.println("The current time is " + currentHourEST + ":" + currentMinute + ":" + currentSecond);
    }
}
