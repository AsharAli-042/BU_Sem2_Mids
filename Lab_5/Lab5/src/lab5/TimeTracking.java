
package lab5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeTracking {
    private int startHour, startMin, endHour, endMin;
    int result;
    

    public TimeTracking(int startHour, int startMin, int endHour, int endMin) {
        this.startHour = startHour;
        this.startMin = startMin;
        this.endHour = endHour;
        this.endMin = endMin;
        
    }

    public int calculateIntervalInMin() {
        int startTotalMin = (startHour * 60) + startMin;
        int endTotalMin = (endHour * 60) + endMin;
        result = endTotalMin - startTotalMin;
        return result;
    }
}
