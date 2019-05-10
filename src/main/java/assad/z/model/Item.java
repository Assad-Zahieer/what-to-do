package assad.z.model;



import javax.persistence.*;

@Entity
public class Item {
    @Column(name = "user_id")
    private Long user_id;
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private Long item_id;
    @Column(name="item")
    private String item;
    @Column(name = "status")
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

