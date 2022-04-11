// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetDeltaTimeSessionWindowConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetLateDataRuleConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetLateDataRuleConfigurationArgs Empty = new DatasetLateDataRuleConfigurationArgs();

    @Import(name="deltaTimeSessionWindowConfiguration")
      private final @Nullable Output<DatasetDeltaTimeSessionWindowConfigurationArgs> deltaTimeSessionWindowConfiguration;

    public Output<DatasetDeltaTimeSessionWindowConfigurationArgs> getDeltaTimeSessionWindowConfiguration() {
        return this.deltaTimeSessionWindowConfiguration == null ? Codegen.empty() : this.deltaTimeSessionWindowConfiguration;
    }

    public DatasetLateDataRuleConfigurationArgs(@Nullable Output<DatasetDeltaTimeSessionWindowConfigurationArgs> deltaTimeSessionWindowConfiguration) {
        this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
    }

    private DatasetLateDataRuleConfigurationArgs() {
        this.deltaTimeSessionWindowConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetLateDataRuleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatasetDeltaTimeSessionWindowConfigurationArgs> deltaTimeSessionWindowConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetLateDataRuleConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaTimeSessionWindowConfiguration = defaults.deltaTimeSessionWindowConfiguration;
        }

        public Builder deltaTimeSessionWindowConfiguration(@Nullable Output<DatasetDeltaTimeSessionWindowConfigurationArgs> deltaTimeSessionWindowConfiguration) {
            this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
            return this;
        }
        public Builder deltaTimeSessionWindowConfiguration(@Nullable DatasetDeltaTimeSessionWindowConfigurationArgs deltaTimeSessionWindowConfiguration) {
            this.deltaTimeSessionWindowConfiguration = Codegen.ofNullable(deltaTimeSessionWindowConfiguration);
            return this;
        }        public DatasetLateDataRuleConfigurationArgs build() {
            return new DatasetLateDataRuleConfigurationArgs(deltaTimeSessionWindowConfiguration);
        }
    }
}
