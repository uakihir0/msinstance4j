package msinstance4j.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author u_akihir0
 */
public class Pagination implements Serializable {

    @SerializedName("total")
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
