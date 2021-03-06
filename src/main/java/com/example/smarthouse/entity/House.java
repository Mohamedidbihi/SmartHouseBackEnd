package com.example.smarthouse.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "House")
public class House {
    @Id
    private Long id;
    private String name;
    private String address;
    @DBRef
    private List<Floor> floors;
}
