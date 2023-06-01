package sc.vsu.ru.server.data.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "Ipu")
public class IpuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="personal_account", nullable=false)
    private PersonEntity person;
    @Column(name = "type", length = 64)
    private String type;
    @OneToMany(mappedBy="ipu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<IndicationEntity> indications;
}
