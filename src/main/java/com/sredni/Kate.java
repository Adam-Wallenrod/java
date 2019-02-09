package com.sredni;

public class Kate extends Girl {

    private String name;
    private int age;
    private WeekPlanner weekPlanner = null;

    public Kate(String name, int age, WeekPlanner weekPlanner) {
        this.name = name;
        this.age = age;
        this.weekPlanner = weekPlanner;
    }

    public Kate(String name, int age) {
        if (this.weekPlanner == null) {
            this.weekPlanner = new WeekPlanner();
            this.weekPlanner.setSalsaDay(3);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int calculateNextSalsaClass(int currentDayOfWeek) {

        int waitingDaysToSalsa = this.weekPlanner.getSalsaDay() - currentDayOfWeek;
        if (waitingDaysToSalsa == 0) {
            return 0;
        } else if (waitingDaysToSalsa > 0) {
            return waitingDaysToSalsa;
        } else {
            return 7 + waitingDaysToSalsa;
        }
    }

}