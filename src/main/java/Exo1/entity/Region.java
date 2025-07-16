package Exo1.entity;
import java.util.List;
import Exo1.util.Climat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Region {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double surface;
    private Climat climat;

    @ManyToMany
    private List<Specie> specieList;

}