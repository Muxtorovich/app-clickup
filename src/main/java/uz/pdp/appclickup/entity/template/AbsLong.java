package uz.pdp.appclickup.entity.template;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class AbsLong extends AbsMain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
