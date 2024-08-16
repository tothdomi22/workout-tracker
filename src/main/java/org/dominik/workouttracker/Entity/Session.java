package org.dominik.workouttracker.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "session")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sets_and_reps")
    private String sets_and_reps;

}
