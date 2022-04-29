// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHeatWaveClusterClusterNode {
    /**
     * @return The ID of the node within MySQL HeatWave cluster.
     * 
     */
    private final String nodeId;
    /**
     * @return The current state of the HeatWave cluster.
     * 
     */
    private final String state;
    /**
     * @return The date and time the HeatWave cluster was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the HeatWave cluster was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetHeatWaveClusterClusterNode(
        @CustomType.Parameter("nodeId") String nodeId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.nodeId = nodeId;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The ID of the node within MySQL HeatWave cluster.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }
    /**
     * @return The current state of the HeatWave cluster.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the HeatWave cluster was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the HeatWave cluster was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHeatWaveClusterClusterNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeId;
        private String state;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHeatWaveClusterClusterNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeId = defaults.nodeId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetHeatWaveClusterClusterNode build() {
            return new GetHeatWaveClusterClusterNode(nodeId, state, timeCreated, timeUpdated);
        }
    }
}
