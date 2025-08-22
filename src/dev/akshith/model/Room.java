package dev.akshith.model;

/**
 * Room class CSIS 505
 * @author Akshith
 */
public class Room {

    private int roomId;
    private String type;
    private int totalRooms;
    private int availableRooms;
    
    public Room() {
    }

    // Constructor
    public Room(int roomId, String type, int totalRooms, int availableRooms) {
        this.roomId = roomId;
        this.type = type;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }
}
