// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.networkmanager.inputs.SiteLocationArgs;
import io.pulumi.awsnative.networkmanager.inputs.SiteTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteArgs Empty = new SiteArgs();

    /**
     * The description of the site.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
      private final Output<String> globalNetworkId;

    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The location of the site.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<SiteLocationArgs> location;

    public Output<SiteLocationArgs> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The tags for the site.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<SiteTagArgs>> tags;

    public Output<List<SiteTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SiteArgs(
        @Nullable Output<String> description,
        Output<String> globalNetworkId,
        @Nullable Output<SiteLocationArgs> location,
        @Nullable Output<List<SiteTagArgs>> tags) {
        this.description = description;
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.location = location;
        this.tags = tags;
    }

    private SiteArgs() {
        this.description = Output.empty();
        this.globalNetworkId = Output.empty();
        this.location = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> globalNetworkId;
        private @Nullable Output<SiteLocationArgs> location;
        private @Nullable Output<List<SiteTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.location = defaults.location;
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
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Output.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }
        public Builder location(@Nullable Output<SiteLocationArgs> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable SiteLocationArgs location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder tags(@Nullable Output<List<SiteTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<SiteTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(SiteTagArgs... tags) {
            return tags(List.of(tags));
        }        public SiteArgs build() {
            return new SiteArgs(description, globalNetworkId, location, tags);
        }
    }
}
