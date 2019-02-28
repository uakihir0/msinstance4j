package msinstance4j.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author u_akihir0
 */
public class Instances implements Serializable {

    @SerializedName("instances")
    private Instance[] Instances;

    @SerializedName("pagination")
    private Pagination pagination;

    public Instance[] getInstances() {
        return Instances;
    }

    public void setInstances(Instance[] instances) {
        Instances = instances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
