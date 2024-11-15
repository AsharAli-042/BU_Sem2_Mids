//
//package lab5;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Lab5_5 {
//    private List<TimeTracking> taskIntervals;
//
//    public void addTaskInterval(int startHour, int startMin, int endHour, int endMin) {
//        taskIntervals.add(new TimeTracking(startHour, startMin, endHour, endMin));
//    }
//
//    public Lab5_5() {
//        taskIntervals = new ArrayList<>();
//    }
//
//    public int calcTotalTime() {
//        int totalMinutes = 0;
//        for (int i = 0; i < taskIntervals.size(); i++) 
//        {
//            totalMinutes += taskIntervals.get(i).calculateIntervalInMin();
//        }
//
//        return totalMinutes;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Lab5_5 timeTrackingTool = new Lab5_5();
//
//        System.out.print("Number of tasks tracked this week: ");
//        int numberOfTasks = sc.nextInt();
//        System.out.println("----------(Note: Use Military Time)----------");
//        // Ensure the loop runs exactly 'numberOfTasks' times
//        for (int i = 0; i < numberOfTasks; i++) {
//            System.out.print("Time (Hours : Minutes) for task " + (i + 1) + ": ");
//            int startHour = sc.nextInt();
//            int startMinute = sc.nextInt();
//
//            System.out.print("Time (Hours : Minutes) for task " + (i + 1) + ": ");
//            int endHour = sc.nextInt();
//            int endMinute = sc.nextInt();
//
//            timeTrackingTool.addTaskInterval(startHour, startMinute, endHour, endMinute);
//        }
//
//        int totalTimeInMin = timeTrackingTool.calcTotalTime();
//        int totalHours = totalTimeInMin / 60;
//        int remainingMin = totalTimeInMin % 60;
//
//        System.out.println("Time spent on Tasks this week: " + totalHours + " Hours and " + remainingMin + " Minutes");
//
//        if (totalTimeInMin < 2400) {
//            System.out.println("Warning: Total time spent less than 40 hours.");
//        }
//
//    }
//}
//
//
