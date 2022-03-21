// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A complex type that contains information about an Amazon VPC. Route 53 Resolver uses the records in the private hosted zone to route traffic in that VPC.
 * 
 */
public final class HostedZoneVPC extends io.pulumi.resources.InvokeArgs {

    public static final HostedZoneVPC Empty = new HostedZoneVPC();

    /**
     * The ID of an Amazon VPC.
     * 
     */
    @Import(name="vPCId", required=true)
      private final String vPCId;

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * The region that an Amazon VPC was created in. See https://docs.aws.amazon.com/general/latest/gr/rande.html for a list of up to date regions.
     * 
     */
    @Import(name="vPCRegion", required=true)
      private final String vPCRegion;

    public String getVPCRegion() {
        return this.vPCRegion;
    }

    public HostedZoneVPC(
        String vPCId,
        String vPCRegion) {
        this.vPCId = Objects.requireNonNull(vPCId, "expected parameter 'vPCId' to be non-null");
        this.vPCRegion = Objects.requireNonNull(vPCRegion, "expected parameter 'vPCRegion' to be non-null");
    }

    private HostedZoneVPC() {
        this.vPCId = null;
        this.vPCRegion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneVPC defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vPCId;
        private String vPCRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneVPC defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vPCId = defaults.vPCId;
    	      this.vPCRegion = defaults.vPCRegion;
        }

        public Builder vPCId(String vPCId) {
            this.vPCId = Objects.requireNonNull(vPCId);
            return this;
        }
        public Builder vPCRegion(String vPCRegion) {
            this.vPCRegion = Objects.requireNonNull(vPCRegion);
            return this;
        }        public HostedZoneVPC build() {
            return new HostedZoneVPC(vPCId, vPCRegion);
        }
    }
}
