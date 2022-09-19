package company.ss4_OOP.bai_tap.stop_watch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();

    }

    public int getElapsedTime() {
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600+(endTime.getMinute()-startTime.getMinute())*60+(endTime.getSecond()-startTime.getSecond()))*1000;
        return  miliSecond;
    }


}
