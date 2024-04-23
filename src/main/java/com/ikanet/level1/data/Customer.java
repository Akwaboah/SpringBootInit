package com.ikanet.level1.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {

    private Long ID;
    private String Name;
    private String Number;

    public Customer(String name, String number) {
        this.Name = name;
        this.Number = number;
    }

}
