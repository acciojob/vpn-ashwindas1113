package driver.model;

import com.driver.model.ServiceProvider;
import com.driver.model.User;

import javax.persistence.*;

@Entity
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private com.driver.model.ServiceProvider serviceProvider;

    @ManyToOne
    @JoinColumn
    private com.driver.model.User user;

    public Connection() {
    }

    public Connection(int id, com.driver.model.ServiceProvider serviceProvider, com.driver.model.User user) {
        this.id = id;
        this.serviceProvider = serviceProvider;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.driver.model.ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public com.driver.model.User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
