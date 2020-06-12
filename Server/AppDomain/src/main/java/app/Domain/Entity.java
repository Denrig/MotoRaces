package app.Domain;

import java.io.Serializable;

/**
 *
 * @param <ID>
 */
public abstract class Entity<ID extends Object>  implements Serializable {
    private ID id;

    /**
     *
     * @return id
     */
    public ID getId() {
        return id;
    }

    /**
     *
     * @param id
     *
     */
    public void setId(ID id) {
        this.id = id;
    }


}
