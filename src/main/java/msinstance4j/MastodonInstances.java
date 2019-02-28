package msinstance4j;

import msinstance4j.internal.InstancesResource;

/**
 * @author u_akihir0
 */
public class MastodonInstances {

    private final InstancesResource instances;

    public MastodonInstances(String accessToken) {
        this.instances = new InstancesResource(accessToken);
    }

    public InstancesResource instances() {
        return this.instances;
    }
}
