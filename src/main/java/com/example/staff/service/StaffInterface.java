package com.example.staff.service;

import com.example.staff.model.Staff;

import java.util.List;

public interface StaffInterface {
    List<Staff> findAll();

    Object save(Staff staff);
    void update(int index, Staff staff);
    Staff  findById(int id);
    void  delete(Staff staff);

}
