// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ZoneAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ZoneAssociationState Empty = new ZoneAssociationState();

    /**
     * The account ID of the account that created the hosted zone.
     * 
     */
    @Import(name="owningAccount")
      private final @Nullable Output<String> owningAccount;

    public Output<String> getOwningAccount() {
        return this.owningAccount == null ? Output.empty() : this.owningAccount;
    }

    /**
     * The VPC to associate with the private hosted zone.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    /**
     * The VPC's region. Defaults to the region of the AWS provider.
     * 
     */
    @Import(name="vpcRegion")
      private final @Nullable Output<String> vpcRegion;

    public Output<String> getVpcRegion() {
        return this.vpcRegion == null ? Output.empty() : this.vpcRegion;
    }

    /**
     * The private hosted zone to associate.
     * 
     */
    @Import(name="zoneId")
      private final @Nullable Output<String> zoneId;

    public Output<String> getZoneId() {
        return this.zoneId == null ? Output.empty() : this.zoneId;
    }

    public ZoneAssociationState(
        @Nullable Output<String> owningAccount,
        @Nullable Output<String> vpcId,
        @Nullable Output<String> vpcRegion,
        @Nullable Output<String> zoneId) {
        this.owningAccount = owningAccount;
        this.vpcId = vpcId;
        this.vpcRegion = vpcRegion;
        this.zoneId = zoneId;
    }

    private ZoneAssociationState() {
        this.owningAccount = Output.empty();
        this.vpcId = Output.empty();
        this.vpcRegion = Output.empty();
        this.zoneId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> owningAccount;
        private @Nullable Output<String> vpcId;
        private @Nullable Output<String> vpcRegion;
        private @Nullable Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(ZoneAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owningAccount = defaults.owningAccount;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcRegion = defaults.vpcRegion;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder owningAccount(@Nullable Output<String> owningAccount) {
            this.owningAccount = owningAccount;
            return this;
        }
        public Builder owningAccount(@Nullable String owningAccount) {
            this.owningAccount = Output.ofNullable(owningAccount);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }
        public Builder vpcRegion(@Nullable Output<String> vpcRegion) {
            this.vpcRegion = vpcRegion;
            return this;
        }
        public Builder vpcRegion(@Nullable String vpcRegion) {
            this.vpcRegion = Output.ofNullable(vpcRegion);
            return this;
        }
        public Builder zoneId(@Nullable Output<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = Output.ofNullable(zoneId);
            return this;
        }        public ZoneAssociationState build() {
            return new ZoneAssociationState(owningAccount, vpcId, vpcRegion, zoneId);
        }
    }
}
