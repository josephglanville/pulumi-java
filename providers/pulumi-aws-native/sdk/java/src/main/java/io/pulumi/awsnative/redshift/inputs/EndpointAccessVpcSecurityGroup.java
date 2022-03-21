// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the members of a VPC security group.
 * 
 */
public final class EndpointAccessVpcSecurityGroup extends io.pulumi.resources.InvokeArgs {

    public static final EndpointAccessVpcSecurityGroup Empty = new EndpointAccessVpcSecurityGroup();

    /**
     * The status of the VPC security group.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The identifier of the VPC security group.
     * 
     */
    @Import(name="vpcSecurityGroupId")
      private final @Nullable String vpcSecurityGroupId;

    public Optional<String> getVpcSecurityGroupId() {
        return this.vpcSecurityGroupId == null ? Optional.empty() : Optional.ofNullable(this.vpcSecurityGroupId);
    }

    public EndpointAccessVpcSecurityGroup(
        @Nullable String status,
        @Nullable String vpcSecurityGroupId) {
        this.status = status;
        this.vpcSecurityGroupId = vpcSecurityGroupId;
    }

    private EndpointAccessVpcSecurityGroup() {
        this.status = null;
        this.vpcSecurityGroupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessVpcSecurityGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String status;
        private @Nullable String vpcSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessVpcSecurityGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.vpcSecurityGroupId = defaults.vpcSecurityGroupId;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder vpcSecurityGroupId(@Nullable String vpcSecurityGroupId) {
            this.vpcSecurityGroupId = vpcSecurityGroupId;
            return this;
        }        public EndpointAccessVpcSecurityGroup build() {
            return new EndpointAccessVpcSecurityGroup(status, vpcSecurityGroupId);
        }
    }
}
