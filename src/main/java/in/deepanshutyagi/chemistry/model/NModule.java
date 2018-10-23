package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;

@Entity
@Table(name = "notes_module")
public class NModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
