// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.AutoscaleSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableGetPropertiesResponseOptions {
    private final @Nullable AutoscaleSettingsResponse autoscaleSettings;
    private final @Nullable Integer throughput;

    @OutputCustomType.Constructor({"autoscaleSettings","throughput"})
    private TableGetPropertiesResponseOptions(
        @Nullable AutoscaleSettingsResponse autoscaleSettings,
        @Nullable Integer throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    public Optional<AutoscaleSettingsResponse> getAutoscaleSettings() {
        return Optional.ofNullable(this.autoscaleSettings);
    }
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleSettingsResponse autoscaleSettings;
        private @Nullable Integer throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(TableGetPropertiesResponseOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder setAutoscaleSettings(@Nullable AutoscaleSettingsResponse autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }

        public TableGetPropertiesResponseOptions build() {
            return new TableGetPropertiesResponseOptions(autoscaleSettings, throughput);
        }
    }
}
