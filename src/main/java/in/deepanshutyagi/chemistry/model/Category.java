package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "course_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "*Please provide an title")
    @Column(name = "title")
    private String title;

    @NotEmpty(message = "*Please provide a description")
    @Column(columnDefinition="TEXT", name = "description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Course> courses = new ArrayList<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}