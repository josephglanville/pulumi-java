// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.AutoscaleSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CassandraViewGetPropertiesResponseOptions extends io.pulumi.resources.InvokeArgs {

    public static final CassandraViewGetPropertiesResponseOptions Empty = new CassandraViewGetPropertiesResponseOptions();

    @InputImport(name="autoscaleSettings")
    private final @Nullable AutoscaleSettingsResponse autoscaleSettings;

    public Optional<AutoscaleSettingsResponse> getAutoscaleSettings() {
        return this.autoscaleSettings == null ? Optional.empty() : Optional.ofNullable(this.autoscaleSettings);
    }

    @InputImport(name="throughput")
    private final @Nullable Integer throughput;

    public Optional<Integer> getThroughput() {
        return this.throughput == null ? Optional.empty() : Optional.ofNullable(this.throughput);
    }

    public CassandraViewGetPropertiesResponseOptions(
        @Nullable AutoscaleSettingsResponse autoscaleSettings,
        @Nullable Integer throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    private CassandraViewGetPropertiesResponseOptions() {
        this.autoscaleSettings = null;
        this.throughput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraViewGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleSettingsResponse autoscaleSettings;
        private @Nullable Integer throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraViewGetPropertiesResponseOptions defaults) {
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

        public CassandraViewGetPropertiesResponseOptions build() {
            return new CassandraViewGetPropertiesResponseOptions(autoscaleSettings, throughput);
        }
    }
}
