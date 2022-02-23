// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
 * 
 */
public final class IPAMIpamOperatingRegionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAMIpamOperatingRegionArgs Empty = new IPAMIpamOperatingRegionArgs();

    /**
     * The name of the region.
     * 
     */
    @InputImport(name="regionName", required=true)
      private final Input<String> regionName;

    public Input<String> getRegionName() {
        return this.regionName;
    }

    public IPAMIpamOperatingRegionArgs(Input<String> regionName) {
        this.regionName = Objects.requireNonNull(regionName, "expected parameter 'regionName' to be non-null");
    }

    private IPAMIpamOperatingRegionArgs() {
        this.regionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMIpamOperatingRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMIpamOperatingRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionName = defaults.regionName;
        }

        public Builder setRegionName(Input<String> regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }

        public Builder setRegionName(String regionName) {
            this.regionName = Input.of(Objects.requireNonNull(regionName));
            return this;
        }
        public IPAMIpamOperatingRegionArgs build() {
            return new IPAMIpamOperatingRegionArgs(regionName);
        }
    }
}
