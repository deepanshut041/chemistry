package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "nModule")
    private List<NStep> nSteps = new ArrayList<>();


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

    public List<NStep> getnSteps() {
        return nSteps;
    }

    public void setnSteps(List<NStep> nSteps) {
        this.nSteps = nSteps;
    }
}
