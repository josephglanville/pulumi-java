// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesInstanceGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


public final class SpokeLinkedRouterApplianceInstancesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedRouterApplianceInstancesGetArgs Empty = new SpokeLinkedRouterApplianceInstancesGetArgs();

    /**
     * The list of router appliance instances
     * 
     */
    @Import(name="instances", required=true)
      private final Output<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances;

    public Output<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> getInstances() {
        return this.instances;
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    @Import(name="siteToSiteDataTransfer", required=true)
      private final Output<Boolean> siteToSiteDataTransfer;

    public Output<Boolean> getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    public SpokeLinkedRouterApplianceInstancesGetArgs(
        Output<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances,
        Output<Boolean> siteToSiteDataTransfer) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer, "expected parameter 'siteToSiteDataTransfer' to be non-null");
    }

    private SpokeLinkedRouterApplianceInstancesGetArgs() {
        this.instances = Codegen.empty();
        this.siteToSiteDataTransfer = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstancesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances;
        private Output<Boolean> siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstancesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder instances(Output<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs> instances) {
            this.instances = Output.of(Objects.requireNonNull(instances));
            return this;
        }
        public Builder instances(SpokeLinkedRouterApplianceInstancesInstanceGetArgs... instances) {
            return instances(List.of(instances));
        }
        public Builder siteToSiteDataTransfer(Output<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }
        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Output.of(Objects.requireNonNull(siteToSiteDataTransfer));
            return this;
        }        public SpokeLinkedRouterApplianceInstancesGetArgs build() {
            return new SpokeLinkedRouterApplianceInstancesGetArgs(instances, siteToSiteDataTransfer);
        }
    }
}
