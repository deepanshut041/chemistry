package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "notes_module")
public class NModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "*Please provide an title")
    @Column(name = "title")
    private String title;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<NStep> nSteps;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<NStep> getnSteps() {
        return nSteps;
    }

    public void setnSteps(Set<NStep> nSteps) {
        this.nSteps = nSteps;
    }
}
