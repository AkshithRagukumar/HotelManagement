package dev.akshith.model;

/**
 * Support ticket class CSIS 505
 *
 * @author Akshith
 */
public class SupportTicket {

    private int ticketId;
    private String name;
    private String email;
    private String title;
    private String status;

    public SupportTicket() {
    }

    public SupportTicket(int ticketId, String name, String email, String title, String status) {
        this.ticketId = ticketId;
        this.name = name;
        this.email = email;
        this.title = title;
        this.status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
