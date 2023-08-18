package com.rtf.rms.rms.current_organizations;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "current_organization")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class CurrentOrganization {
    @SequenceGenerator(
            sequenceName = "orgId",
            name = "orgId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orgId"
    )
    @Id
    private Long orgId;
    private String name;
    private String address;
    private String contact;
}
