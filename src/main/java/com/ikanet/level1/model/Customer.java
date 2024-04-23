package com.ikanet.level1.model;

import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
public class Customer {

    private Long ID;
    private String Name;
    private String Number;

    public Customer(String _Name, String _Number) {
        this.Name = _Name;
        this.Number = _Number;
    }

}
