// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigValuesArgs;
import java.lang.String;
import java.util.Objects;


/**
 * A ReusableConfigWrapper describes values that may assist in creating an X.509 certificate, or a reference to a pre-defined set of values.
 * 
 */
public final class ReusableConfigWrapperArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReusableConfigWrapperArgs Empty = new ReusableConfigWrapperArgs();

    /**
     * A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    @InputImport(name="reusableConfig", required=true)
      private final Output<String> reusableConfig;

    public Output<String> getReusableConfig() {
        return this.reusableConfig;
    }

    /**
     * A user-specified inline ReusableConfigValues.
     * 
     */
    @InputImport(name="reusableConfigValues", required=true)
      private final Output<ReusableConfigValuesArgs> reusableConfigValues;

    public Output<ReusableConfigValuesArgs> getReusableConfigValues() {
        return this.reusableConfigValues;
    }

    public ReusableConfigWrapperArgs(
        Output<String> reusableConfig,
        Output<ReusableConfigValuesArgs> reusableConfigValues) {
        this.reusableConfig = Objects.requireNonNull(reusableConfig, "expected parameter 'reusableConfig' to be non-null");
        this.reusableConfigValues = Objects.requireNonNull(reusableConfigValues, "expected parameter 'reusableConfigValues' to be non-null");
    }

    private ReusableConfigWrapperArgs() {
        this.reusableConfig = Output.empty();
        this.reusableConfigValues = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigWrapperArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> reusableConfig;
        private Output<ReusableConfigValuesArgs> reusableConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigWrapperArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.reusableConfigValues = defaults.reusableConfigValues;
        }

        public Builder reusableConfig(Output<String> reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }

        public Builder reusableConfig(String reusableConfig) {
            this.reusableConfig = Output.of(Objects.requireNonNull(reusableConfig));
            return this;
        }

        public Builder reusableConfigValues(Output<ReusableConfigValuesArgs> reusableConfigValues) {
            this.reusableConfigValues = Objects.requireNonNull(reusableConfigValues);
            return this;
        }

        public Builder reusableConfigValues(ReusableConfigValuesArgs reusableConfigValues) {
            this.reusableConfigValues = Output.of(Objects.requireNonNull(reusableConfigValues));
            return this;
        }
        public ReusableConfigWrapperArgs build() {
            return new ReusableConfigWrapperArgs(reusableConfig, reusableConfigValues);
        }
    }
}
