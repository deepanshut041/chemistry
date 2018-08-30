package in.deepanshutyagi.chemistry.model;

import javax.persistence.*;

@Entity
@Table(name = "modules")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
