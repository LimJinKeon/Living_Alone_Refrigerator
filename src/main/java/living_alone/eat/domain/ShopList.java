package living_alone.eat.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class ShopList {

    @Id @GeneratedValue
    private long id;
}
