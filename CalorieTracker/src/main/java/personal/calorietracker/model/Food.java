package personal.calorietracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Foods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(unique = true)
    String barcode;
    String brand, name, servingSize;
    Double calories, protein, carbohydrates, fats;
}
