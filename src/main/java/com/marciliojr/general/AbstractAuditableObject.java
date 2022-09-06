package com.marciliojr.general;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class AbstractAuditableObject implements Serializable {

    private LocalDate createDate;
    private LocalDate updateDare;
    private String user;

}
