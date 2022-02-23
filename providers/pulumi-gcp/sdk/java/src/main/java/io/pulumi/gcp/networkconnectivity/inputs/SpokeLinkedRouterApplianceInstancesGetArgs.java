// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="instances", required=true)
      private final Input<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances;

    public Input<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> getInstances() {
        return this.instances;
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    @InputImport(name="siteToSiteDataTransfer", required=true)
      private final Input<Boolean> siteToSiteDataTransfer;

    public Input<Boolean> getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    public SpokeLinkedRouterApplianceInstancesGetArgs(
        Input<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances,
        Input<Boolean> siteToSiteDataTransfer) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer, "expected parameter 'siteToSiteDataTransfer' to be non-null");
    }

    private SpokeLinkedRouterApplianceInstancesGetArgs() {
        this.instances = Input.empty();
        this.siteToSiteDataTransfer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstancesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances;
        private Input<Boolean> siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstancesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder setInstances(Input<List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs>> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setInstances(List<SpokeLinkedRouterApplianceInstancesInstanceGetArgs> instances) {
            this.instances = Input.of(Objects.requireNonNull(instances));
            return this;
        }

        public Builder setSiteToSiteDataTransfer(Input<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }

        public Builder setSiteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Input.of(Objects.requireNonNull(siteToSiteDataTransfer));
            return this;
        }
        public SpokeLinkedRouterApplianceInstancesGetArgs build() {
            return new SpokeLinkedRouterApplianceInstancesGetArgs(instances, siteToSiteDataTransfer);
        }
    }
}
