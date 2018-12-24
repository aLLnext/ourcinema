package My_Little_Teamy.My_Little_Cinemy.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Column(unique = true)
    private String adress;
    private String description;
    private String icon;
    private String email;

}
