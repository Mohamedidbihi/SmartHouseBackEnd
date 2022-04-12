package com.example.smarthouse.service;

import com.example.smarthouse.entity.Device;

import java.util.List;

public interface DeviceService {

    Device addDevice(Device device);

    void deleteDevice(String id);

    Device updateDevice(Device device);

    Device getDevice(String id);

    Boolean changeState(String deviceId);

    List<Device> getAllDevices();

}
