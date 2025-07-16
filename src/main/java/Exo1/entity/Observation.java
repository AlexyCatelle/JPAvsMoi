package Exo1.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Specie specie;

    private String observerName;
    private String location;
    private Double latitude;
    private Double longitude;
    private LocalDate observationDate;

    private String comment;
}

