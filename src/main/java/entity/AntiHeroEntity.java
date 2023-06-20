package entity;

import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "anti_hero_entity")
public class AntiHeroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column(nullable = false, updatable = false)
    private UUID id;

    @NotNull(message = "El primer nombre es requerido")
    private String firstName;
    private String lastName;
    private String house;
    private String knownAs;
    private String createdAt = new SimpleDateFormat("dd-MM-yyyy HH:MM:SS Z").format(new Date());



}
