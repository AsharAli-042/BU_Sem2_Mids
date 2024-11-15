
package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskInterval {
    private int startHour, startMin, endHour, endMin;

    public TaskInterval(int startHour, int startMinute, int endHour, int endMin) {
        this.startHour = startHour;
        this.startMin = startMinute;
        this.endHour = endHour;
        this.endMin = endMin;
    }

    public int calculateIntervalInMin() {
        int startTotalMin = (startHour * 60) + startMin;
        int endTotalMin = (endHour * 60) + endMin;
        return endTotalMin - startTotalMin;
    }
}
