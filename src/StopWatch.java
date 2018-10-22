
public class StopWatch {
    private long startTime;
    private long endTime;

    public long start(){
        return startTime = System.nanoTime();
    }
    public long end(){
        return endTime = System.nanoTime();
    }

    public long getElapsedTime(long start, long end){
        return (end-start)/1000000;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
