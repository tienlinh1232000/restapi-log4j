package linh.io.restapi.model;


import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Admin
 *
 */
@Entity
@Table(name = "userlog")
public class UserLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age")
    private String age;

    public UserLog() {
        super();
    }

    public UserLog(String name, String age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	

}
