// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.AutoscaleSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CreateUpdateOptions are a list of key-value pairs that describe the resource. Supported keys are "If-Match", "If-None-Match", "Session-Token" and "Throughput"
 * 
 */
public final class CreateUpdateOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateUpdateOptionsArgs Empty = new CreateUpdateOptionsArgs();

    /**
     * Specifies the Autoscale settings.
     * 
     */
    @Import(name="autoscaleSettings")
      private final @Nullable Output<AutoscaleSettingsArgs> autoscaleSettings;

    public Output<AutoscaleSettingsArgs> getAutoscaleSettings() {
        return this.autoscaleSettings == null ? Output.empty() : this.autoscaleSettings;
    }

    /**
     * Request Units per second. For example, "throughput": 10000.
     * 
     */
    @Import(name="throughput")
      private final @Nullable Output<Integer> throughput;

    public Output<Integer> getThroughput() {
        return this.throughput == null ? Output.empty() : this.throughput;
    }

    public CreateUpdateOptionsArgs(
        @Nullable Output<AutoscaleSettingsArgs> autoscaleSettings,
        @Nullable Output<Integer> throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    private CreateUpdateOptionsArgs() {
        this.autoscaleSettings = Output.empty();
        this.throughput = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateUpdateOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscaleSettingsArgs> autoscaleSettings;
        private @Nullable Output<Integer> throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateUpdateOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder autoscaleSettings(@Nullable Output<AutoscaleSettingsArgs> autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }
        public Builder autoscaleSettings(@Nullable AutoscaleSettingsArgs autoscaleSettings) {
            this.autoscaleSettings = Output.ofNullable(autoscaleSettings);
            return this;
        }
        public Builder throughput(@Nullable Output<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = Output.ofNullable(throughput);
            return this;
        }        public CreateUpdateOptionsArgs build() {
            return new CreateUpdateOptionsArgs(autoscaleSettings, throughput);
        }
    }
}
