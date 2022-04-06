// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ZoneAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ZoneAssociationArgs Empty = new ZoneAssociationArgs();

    /**
     * The VPC to associate with the private hosted zone.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
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
    @Import(name="zoneId", required=true)
      private final Output<String> zoneId;

    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public ZoneAssociationArgs(
        Output<String> vpcId,
        @Nullable Output<String> vpcRegion,
        Output<String> zoneId) {
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
        this.vpcRegion = vpcRegion;
        this.zoneId = Objects.requireNonNull(zoneId, "expected parameter 'zoneId' to be non-null");
    }

    private ZoneAssociationArgs() {
        this.vpcId = Output.empty();
        this.vpcRegion = Output.empty();
        this.zoneId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> vpcId;
        private @Nullable Output<String> vpcRegion;
        private Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(ZoneAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
    	      this.vpcRegion = defaults.vpcRegion;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
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
        public Builder zoneId(Output<String> zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Output.of(Objects.requireNonNull(zoneId));
            return this;
        }        public ZoneAssociationArgs build() {
            return new ZoneAssociationArgs(vpcId, vpcRegion, zoneId);
        }
    }
}