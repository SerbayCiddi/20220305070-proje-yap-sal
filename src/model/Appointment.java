package model;

public class Appointment {
    private int id;
    private int userId;
    private String date;
    private String time;

    public Appointment(int id, int userId, String date, String time) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.time = time;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getDate() { return date; }
    public String getTime() { return time; }

    public void setId(int id) { this.id = id; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setDate(String date) { this.date = date; }
    public void setTime(String time) { this.time = time; }
}
