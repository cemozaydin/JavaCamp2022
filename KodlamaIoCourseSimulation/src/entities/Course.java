package entities;

public class Course {
    private int courseId;
    private int categoryId;
    private int instructorId;
    private String courseName;
    private String courseImagePath;
    private double price;
    private double progressRate;

    public Course(int courseId, int categoryId, int instructorId, String courseName, String courseImagePath, double price, double progressRate) {
        this.courseId = courseId;
        this.categoryId = categoryId;
        this.instructorId = instructorId;
        this.courseName = courseName;
        this.courseImagePath = courseImagePath;
        this.price = price;
        this.progressRate = progressRate;
    }

    public Course()
    {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImagePath() {
        return courseImagePath;
    }

    public void setCourseImagePath(String courseImagePath) {
        this.courseImagePath = courseImagePath;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getProgressRate() {
        return progressRate;
    }

    public void setProgressRate(double progressRate) {
        this.progressRate = progressRate;
    }
}
