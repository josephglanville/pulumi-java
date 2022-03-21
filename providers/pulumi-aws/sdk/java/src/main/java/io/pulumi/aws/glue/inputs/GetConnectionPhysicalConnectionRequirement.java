// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetConnectionPhysicalConnectionRequirement extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionPhysicalConnectionRequirement Empty = new GetConnectionPhysicalConnectionRequirement();

    @Import(name="availabilityZone", required=true)
      private final String availabilityZone;

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    @Import(name="securityGroupIdLists", required=true)
      private final List<String> securityGroupIdLists;

    public List<String> getSecurityGroupIdLists() {
        return this.securityGroupIdLists;
    }

    @Import(name="subnetId", required=true)
      private final String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public GetConnectionPhysicalConnectionRequirement(
        String availabilityZone,
        List<String> securityGroupIdLists,
        String subnetId) {
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.securityGroupIdLists = Objects.requireNonNull(securityGroupIdLists, "expected parameter 'securityGroupIdLists' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private GetConnectionPhysicalConnectionRequirement() {
        this.availabilityZone = null;
        this.securityGroupIdLists = List.of();
        this.subnetId = null;
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

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder securityGroupIdLists(List<String> securityGroupIdLists) {
            this.securityGroupIdLists = Objects.requireNonNull(securityGroupIdLists);
            return this;
        }
        public Builder securityGroupIdLists(String... securityGroupIdLists) {
            return securityGroupIdLists(List.of(securityGroupIdLists));
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetConnectionPhysicalConnectionRequirement build() {
            return new GetConnectionPhysicalConnectionRequirement(availabilityZone, securityGroupIdLists, subnetId);
        }
    }
}
