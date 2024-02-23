
package entity;

import enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author JAMES
 */
@Entity
@Data
@Table(name = "users")

public class User {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)//El idice aumentara de uno en uno.
    private long id;
    
    private String email;
    
    private String password;
    
    private String name;
    
    private UserRole role;
    
    @Lob //Large object
    @Column(columnDefinition = "longblob")
    private byte [] img;

}
