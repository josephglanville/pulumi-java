// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscaleSettingsResponse Empty = new AutoscaleSettingsResponse();

    /**
     * Represents maximum throughput, the resource can scale up to.
     * 
     */
    @InputImport(name="maxThroughput")
      private final @Nullable Integer maxThroughput;

    public Optional<Integer> getMaxThroughput() {
        return this.maxThroughput == null ? Optional.empty() : Optional.ofNullable(this.maxThroughput);
    }

    public AutoscaleSettingsResponse(@Nullable Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
    }

    private AutoscaleSettingsResponse() {
        this.maxThroughput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxThroughput = defaults.maxThroughput;
        }

        public Builder setMaxThroughput(@Nullable Integer maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }
        public AutoscaleSettingsResponse build() {
            return new AutoscaleSettingsResponse(maxThroughput);
        }
    }
}
