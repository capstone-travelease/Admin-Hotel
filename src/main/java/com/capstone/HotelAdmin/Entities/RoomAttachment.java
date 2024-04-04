package com.capstone.HotelAdmin.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class RoomAttachment {
    @Id
    private Integer room_id;
    @Column(name = "attachment_id")
    private Integer attachmentId;

    public RoomAttachment() {
    }

    public RoomAttachment(Integer room_id, Integer attachmentId) {
        this.room_id = room_id;
        this.attachmentId = attachmentId;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Integer getattachmentId() {
        return attachmentId;
    }

    public void setattachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }
}
