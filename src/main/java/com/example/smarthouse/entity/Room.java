package com.example.smarthouse.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Room")
public class Room {
    @Id
    private String id;
    private int roomNumber;
    @DBRef
    private List<Device> devices;
}
