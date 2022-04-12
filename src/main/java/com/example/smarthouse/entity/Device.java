package com.example.smarthouse.entity;

import com.example.smarthouse.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "Device")
public class Device {
        @Id
        private String id;
        @Field("name")
        private String name;
        private Status status;


}
