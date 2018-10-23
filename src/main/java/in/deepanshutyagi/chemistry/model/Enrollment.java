package in.deepanshutyagi.chemistry.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "course_enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @CreatedDate
    @Column(name = "enrollment_date", nullable = false, updatable = false)
    private Instant enrolledAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToOne(mappedBy = "enrollment", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Feedback feedback;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Progress> progresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getEnrolledAt() {
        return enrolledAt;
    }

    public void setEnrolledAt(Instant enrolledAt) {
        this.enrolledAt = enrolledAt;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public Set<Progress> getProgresses() {
        return progresses;
    }

    public void setProgresses(Set<Progress> progresses) {
        this.progresses = progresses;
    }
}
