package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;

@Entity
@Table(name = "notes_module")
public class NModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
