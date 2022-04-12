package com.example.smarthouse.service;

import com.example.smarthouse.entity.Device;
import com.example.smarthouse.enums.Status;
import com.example.smarthouse.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceRepository deviceRepository;

    @Override
    public Device addDevice(Device device) {
       deviceRepository.save(device);
       return device;
    }

    @Override
    public void deleteDevice(String id) {
        if(deviceRepository.existsById(id)){
            deviceRepository.deleteById(id);
        }
        else{
            throw new RuntimeException("Device not found");
        }
    }

    @Override
    public Device updateDevice(Device device) {

       if(deviceRepository.existsById(device.getId())){
           deviceRepository.save(device);
           return device;
       }
       else{
           throw new RuntimeException("Device not found");
       }

    }

    @Override
    public Device getDevice(String id) {

        return deviceRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean changeState(String deviceId) {

        Device device = deviceRepository.findById(deviceId).orElse(null);
        if(device == null){
            return false;
        }
        if(device.getStatus() == Status.ON){
            device.setStatus(Status.OFF);
        }else{
            device.setStatus(Status.ON);
        }
        deviceRepository.save(device);
        return true;
    }

    @Override
    public List<Device> getAllDevices() {

        return deviceRepository.findAll();
    }

}
