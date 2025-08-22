package dev.akshith.model;

/**
 * Review class CSIS 505
 *
 * @author Akshith
 */
public class Review {

    private int reviewId;
    private int userId;
    private int roomId;
    private String comment;
    private String createdAt;

    public Review() {
    }

    public Review(int reviewId, int userId, int roomId, String comment, String createdAt) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.roomId = roomId;
        this.comment = comment;
        this.createdAt = createdAt;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
