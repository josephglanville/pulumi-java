// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationCanaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutSpecificationCanaryArgs Empty = new DefaultRolloutSpecificationCanaryArgs();

    @InputImport(name="regions")
      private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    @InputImport(name="skipRegions")
      private final @Nullable Input<List<String>> skipRegions;

    public Input<List<String>> getSkipRegions() {
        return this.skipRegions == null ? Input.empty() : this.skipRegions;
    }

    public DefaultRolloutSpecificationCanaryArgs(
        @Nullable Input<List<String>> regions,
        @Nullable Input<List<String>> skipRegions) {
        this.regions = regions;
        this.skipRegions = skipRegions;
    }

    private DefaultRolloutSpecificationCanaryArgs() {
        this.regions = Input.empty();
        this.skipRegions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationCanaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> regions;
        private @Nullable Input<List<String>> skipRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationCanaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.skipRegions = defaults.skipRegions;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder setSkipRegions(@Nullable Input<List<String>> skipRegions) {
            this.skipRegions = skipRegions;
            return this;
        }

        public Builder setSkipRegions(@Nullable List<String> skipRegions) {
            this.skipRegions = Input.ofNullable(skipRegions);
            return this;
        }
        public DefaultRolloutSpecificationCanaryArgs build() {
            return new DefaultRolloutSpecificationCanaryArgs(regions, skipRegions);
        }
    }
}
