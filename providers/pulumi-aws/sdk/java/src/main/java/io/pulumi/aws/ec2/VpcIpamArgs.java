// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamArgs Empty = new VpcIpamArgs();

    /**
     * A description for the IPAM.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
     * 
     */
    @Import(name="operatingRegions", required=true)
      private final Output<List<VpcIpamOperatingRegionArgs>> operatingRegions;

    public Output<List<VpcIpamOperatingRegionArgs>> getOperatingRegions() {
        return this.operatingRegions;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public VpcIpamArgs(
        @Nullable Output<String> description,
        Output<List<VpcIpamOperatingRegionArgs>> operatingRegions,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.operatingRegions = Objects.requireNonNull(operatingRegions, "expected parameter 'operatingRegions' to be non-null");
        this.tags = tags;
    }

    private VpcIpamArgs() {
        this.description = Output.empty();
        this.operatingRegions = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<VpcIpamOperatingRegionArgs>> operatingRegions;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.operatingRegions = defaults.operatingRegions;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder operatingRegions(Output<List<VpcIpamOperatingRegionArgs>> operatingRegions) {
            this.operatingRegions = Objects.requireNonNull(operatingRegions);
            return this;
        }
        public Builder operatingRegions(List<VpcIpamOperatingRegionArgs> operatingRegions) {
            this.operatingRegions = Output.of(Objects.requireNonNull(operatingRegions));
            return this;
        }
        public Builder operatingRegions(VpcIpamOperatingRegionArgs... operatingRegions) {
            return operatingRegions(List.of(operatingRegions));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public VpcIpamArgs build() {
            return new VpcIpamArgs(description, operatingRegions, tags);
        }
    }
}