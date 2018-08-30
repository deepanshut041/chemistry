package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;


@Entity
@Table(name = "notes_step")
public class NStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
