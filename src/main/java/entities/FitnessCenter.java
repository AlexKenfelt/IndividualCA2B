package entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FitnessCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private String city;
    private String pricePrMonth;

    @OneToMany (mappedBy = "member" , cascade = CascadeType.PERSIST)
    private List<Member> members;



    public FitnessCenter(Integer id, String name, String city, String pricePrMonth) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.pricePrMonth = pricePrMonth;
        this. members = new ArrayList<>();
    }
    public FitnessCenter(String name) {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPricePrMonth() {
        return pricePrMonth;
    }

    public void setPricePrMonth(String pricePrMonth) {
        this.pricePrMonth = pricePrMonth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
