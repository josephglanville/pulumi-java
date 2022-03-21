// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionPhysicalConnectionRequirements {
    /**
     * The availability zone of the connection. This field is redundant and implied by `subnet_id`, but is currently an api requirement.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * The security group ID list used by the connection.
     * 
     */
    private final @Nullable List<String> securityGroupIdLists;
    /**
     * The subnet ID used by the connection.
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private ConnectionPhysicalConnectionRequirements(
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("securityGroupIdLists") @Nullable List<String> securityGroupIdLists,
        @CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.availabilityZone = availabilityZone;
        this.securityGroupIdLists = securityGroupIdLists;
        this.subnetId = subnetId;
    }

    /**
     * The availability zone of the connection. This field is redundant and implied by `subnet_id`, but is currently an api requirement.
     * 
    */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * The security group ID list used by the connection.
     * 
    */
    public List<String> getSecurityGroupIdLists() {
        return this.securityGroupIdLists == null ? List.of() : this.securityGroupIdLists;
    }
    /**
     * The subnet ID used by the connection.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionPhysicalConnectionRequirements defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable List<String> securityGroupIdLists;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionPhysicalConnectionRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.securityGroupIdLists = defaults.securityGroupIdLists;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder securityGroupIdLists(@Nullable List<String> securityGroupIdLists) {
            this.securityGroupIdLists = securityGroupIdLists;
            return this;
        }
        public Builder securityGroupIdLists(String... securityGroupIdLists) {
            return securityGroupIdLists(List.of(securityGroupIdLists));
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public ConnectionPhysicalConnectionRequirements build() {
            return new ConnectionPhysicalConnectionRequirements(availabilityZone, securityGroupIdLists, subnetId);
        }
    }
}
