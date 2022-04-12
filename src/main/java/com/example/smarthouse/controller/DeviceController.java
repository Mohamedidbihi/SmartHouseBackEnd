package com.example.smarthouse.controller;

import com.example.smarthouse.entity.Device;
import com.example.smarthouse.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Device addDevice(@RequestBody Device device) {
        return deviceService.addDevice(device);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Device updateDevice(@RequestBody Device device) {
        return deviceService.updateDevice(device);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<?> deleteDevice(@PathVariable("id") String id) {
        if(deviceService.getDevice(id)!= null) {
            deviceService.deleteDevice(id);
            return new ResponseEntity<>("Device deleted",HttpStatus.ACCEPTED );
        }
        else {
            return new ResponseEntity<>("Device not found" + id, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> getDevice(@PathVariable("id") String id) {
        if(deviceService.getDevice(id)!= null) {
            return new ResponseEntity<>(deviceService.getDevice(id), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Device not found", HttpStatus.NOT_FOUND);
        }

    }
}

