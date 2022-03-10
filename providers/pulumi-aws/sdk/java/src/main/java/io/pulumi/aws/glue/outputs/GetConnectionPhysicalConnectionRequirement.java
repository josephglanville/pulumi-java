// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetConnectionPhysicalConnectionRequirement {
    private final String availabilityZone;
    private final List<String> securityGroupIdLists;
    private final String subnetId;

    @OutputCustomType.Constructor
    private GetConnectionPhysicalConnectionRequirement(
        @OutputCustomType.Parameter("availabilityZone") String availabilityZone,
        @OutputCustomType.Parameter("securityGroupIdLists") List<String> securityGroupIdLists,
        @OutputCustomType.Parameter("subnetId") String subnetId) {
        this.availabilityZone = availabilityZone;
        this.securityGroupIdLists = securityGroupIdLists;
        this.subnetId = subnetId;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    public List<String> getSecurityGroupIdLists() {
        return this.securityGroupIdLists;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionPhysicalConnectionRequirement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityZone;
        private List<String> securityGroupIdLists;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionPhysicalConnectionRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.securityGroupIdLists = defaults.securityGroupIdLists;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setSecurityGroupIdLists(List<String> securityGroupIdLists) {
            this.securityGroupIdLists = Objects.requireNonNull(securityGroupIdLists);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetConnectionPhysicalConnectionRequirement build() {
            return new GetConnectionPhysicalConnectionRequirement(availabilityZone, securityGroupIdLists, subnetId);
        }
    }
}
