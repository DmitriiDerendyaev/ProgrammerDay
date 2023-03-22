public class LeapChecker {
    private int currentYear;

    public LeapChecker(int currentYear) {
        this.currentYear = currentYear;
    }

    public LeapChecker() {
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public boolean isLeapYear() {
        return currentYear % 400 == 0 || (currentYear % 100 != 0 && currentYear % 4 == 0);
    }
}
