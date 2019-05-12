package assad.z.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Item {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long item_id;
    @Column(name = "user_id")
    private Long user_id;
    private String item;
    private boolean status = true;

    public Item() {

    }

    public Item(String item) {
        this.item = item;

    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



}

