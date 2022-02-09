// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationResponseLowTraffic extends io.pulumi.resources.InvokeArgs {

    public static final DefaultRolloutSpecificationResponseLowTraffic Empty = new DefaultRolloutSpecificationResponseLowTraffic();

    @InputImport(name="regions")
    private final @Nullable List<String> regions;

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }

    @InputImport(name="waitDuration")
    private final @Nullable String waitDuration;

    public Optional<String> getWaitDuration() {
        return this.waitDuration == null ? Optional.empty() : Optional.ofNullable(this.waitDuration);
    }

    public DefaultRolloutSpecificationResponseLowTraffic(
        @Nullable List<String> regions,
        @Nullable String waitDuration) {
        this.regions = regions;
        this.waitDuration = waitDuration;
    }

    private DefaultRolloutSpecificationResponseLowTraffic() {
        this.regions = List.of();
        this.waitDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationResponseLowTraffic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> regions;
        private @Nullable String waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationResponseLowTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setWaitDuration(@Nullable String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }

        public DefaultRolloutSpecificationResponseLowTraffic build() {
            return new DefaultRolloutSpecificationResponseLowTraffic(regions, waitDuration);
        }
    }
}
