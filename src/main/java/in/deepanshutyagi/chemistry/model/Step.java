package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;

@Entity
@Table(name = "steps")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
