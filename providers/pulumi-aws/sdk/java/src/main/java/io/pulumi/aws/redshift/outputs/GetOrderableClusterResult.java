// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetOrderableClusterResult {
    /**
     * List of Availability Zone names where the Redshit Cluster is available.
     * 
     */
    private final List<String> availabilityZones;
    private final String clusterType;
    private final String clusterVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String nodeType;
    private final @Nullable List<String> preferredNodeTypes;

    @CustomType.Constructor
    private GetOrderableClusterResult(
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("clusterType") String clusterType,
        @CustomType.Parameter("clusterVersion") String clusterVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nodeType") String nodeType,
        @CustomType.Parameter("preferredNodeTypes") @Nullable List<String> preferredNodeTypes) {
        this.availabilityZones = availabilityZones;
        this.clusterType = clusterType;
        this.clusterVersion = clusterVersion;
        this.id = id;
        this.nodeType = nodeType;
        this.preferredNodeTypes = preferredNodeTypes;
    }

    /**
     * List of Availability Zone names where the Redshit Cluster is available.
     * 
    */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    public String getClusterType() {
        return this.clusterType;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getNodeType() {
        return this.nodeType;
    }
    public List<String> getPreferredNodeTypes() {
        return this.preferredNodeTypes == null ? List.of() : this.preferredNodeTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private String clusterType;
        private String clusterVersion;
        private String id;
        private String nodeType;
        private @Nullable List<String> preferredNodeTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderableClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.clusterType = defaults.clusterType;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.id = defaults.id;
    	      this.nodeType = defaults.nodeType;
    	      this.preferredNodeTypes = defaults.preferredNodeTypes;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder clusterType(String clusterType) {
            this.clusterType = Objects.requireNonNull(clusterType);
            return this;
        }
        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public Builder preferredNodeTypes(@Nullable List<String> preferredNodeTypes) {
            this.preferredNodeTypes = preferredNodeTypes;
            return this;
        }
        public Builder preferredNodeTypes(String... preferredNodeTypes) {
            return preferredNodeTypes(List.of(preferredNodeTypes));
        }        public GetOrderableClusterResult build() {
            return new GetOrderableClusterResult(availabilityZones, clusterType, clusterVersion, id, nodeType, preferredNodeTypes);
        }
    }
}
