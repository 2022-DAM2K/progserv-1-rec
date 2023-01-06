package org.iesfm.examen.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private int userId;
    private String nif;
    private String fullName;
    private String email;
}
