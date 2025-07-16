package Exo1.entity;

import Exo1.util.TravelMode;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TravelLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Observation observation;

    private Double distanceKm;

    @Enumerated(EnumType.STRING)
    private TravelMode mode;
}
