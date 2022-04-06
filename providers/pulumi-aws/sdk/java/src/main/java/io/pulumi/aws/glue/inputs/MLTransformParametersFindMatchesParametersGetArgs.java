// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MLTransformParametersFindMatchesParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MLTransformParametersFindMatchesParametersGetArgs Empty = new MLTransformParametersFindMatchesParametersGetArgs();

    /**
     * The value that is selected when tuning your transform for a balance between accuracy and cost.
     * 
     */
    @Import(name="accuracyCostTradeOff")
      private final @Nullable Output<Double> accuracyCostTradeOff;

    public Output<Double> getAccuracyCostTradeOff() {
        return this.accuracyCostTradeOff == null ? Output.empty() : this.accuracyCostTradeOff;
    }

    /**
     * The value to switch on or off to force the output to match the provided labels from users.
     * 
     */
    @Import(name="enforceProvidedLabels")
      private final @Nullable Output<Boolean> enforceProvidedLabels;

    public Output<Boolean> getEnforceProvidedLabels() {
        return this.enforceProvidedLabels == null ? Output.empty() : this.enforceProvidedLabels;
    }

    /**
     * The value selected when tuning your transform for a balance between precision and recall.
     * 
     */
    @Import(name="precisionRecallTradeOff")
      private final @Nullable Output<Double> precisionRecallTradeOff;

    public Output<Double> getPrecisionRecallTradeOff() {
        return this.precisionRecallTradeOff == null ? Output.empty() : this.precisionRecallTradeOff;
    }

    /**
     * The name of a column that uniquely identifies rows in the source table.
     * 
     */
    @Import(name="primaryKeyColumnName")
      private final @Nullable Output<String> primaryKeyColumnName;

    public Output<String> getPrimaryKeyColumnName() {
        return this.primaryKeyColumnName == null ? Output.empty() : this.primaryKeyColumnName;
    }

    public MLTransformParametersFindMatchesParametersGetArgs(
        @Nullable Output<Double> accuracyCostTradeOff,
        @Nullable Output<Boolean> enforceProvidedLabels,
        @Nullable Output<Double> precisionRecallTradeOff,
        @Nullable Output<String> primaryKeyColumnName) {
        this.accuracyCostTradeOff = accuracyCostTradeOff;
        this.enforceProvidedLabels = enforceProvidedLabels;
        this.precisionRecallTradeOff = precisionRecallTradeOff;
        this.primaryKeyColumnName = primaryKeyColumnName;
    }

    private MLTransformParametersFindMatchesParametersGetArgs() {
        this.accuracyCostTradeOff = Output.empty();
        this.enforceProvidedLabels = Output.empty();
        this.precisionRecallTradeOff = Output.empty();
        this.primaryKeyColumnName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformParametersFindMatchesParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> accuracyCostTradeOff;
        private @Nullable Output<Boolean> enforceProvidedLabels;
        private @Nullable Output<Double> precisionRecallTradeOff;
        private @Nullable Output<String> primaryKeyColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformParametersFindMatchesParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accuracyCostTradeOff = defaults.accuracyCostTradeOff;
    	      this.enforceProvidedLabels = defaults.enforceProvidedLabels;
    	      this.precisionRecallTradeOff = defaults.precisionRecallTradeOff;
    	      this.primaryKeyColumnName = defaults.primaryKeyColumnName;
        }

        public Builder accuracyCostTradeOff(@Nullable Output<Double> accuracyCostTradeOff) {
            this.accuracyCostTradeOff = accuracyCostTradeOff;
            return this;
        }
        public Builder accuracyCostTradeOff(@Nullable Double accuracyCostTradeOff) {
            this.accuracyCostTradeOff = Output.ofNullable(accuracyCostTradeOff);
            return this;
        }
        public Builder enforceProvidedLabels(@Nullable Output<Boolean> enforceProvidedLabels) {
            this.enforceProvidedLabels = enforceProvidedLabels;
            return this;
        }
        public Builder enforceProvidedLabels(@Nullable Boolean enforceProvidedLabels) {
            this.enforceProvidedLabels = Output.ofNullable(enforceProvidedLabels);
            return this;
        }
        public Builder precisionRecallTradeOff(@Nullable Output<Double> precisionRecallTradeOff) {
            this.precisionRecallTradeOff = precisionRecallTradeOff;
            return this;
        }
        public Builder precisionRecallTradeOff(@Nullable Double precisionRecallTradeOff) {
            this.precisionRecallTradeOff = Output.ofNullable(precisionRecallTradeOff);
            return this;
        }
        public Builder primaryKeyColumnName(@Nullable Output<String> primaryKeyColumnName) {
            this.primaryKeyColumnName = primaryKeyColumnName;
            return this;
        }
        public Builder primaryKeyColumnName(@Nullable String primaryKeyColumnName) {
            this.primaryKeyColumnName = Output.ofNullable(primaryKeyColumnName);
            return this;
        }        public MLTransformParametersFindMatchesParametersGetArgs build() {
            return new MLTransformParametersFindMatchesParametersGetArgs(accuracyCostTradeOff, enforceProvidedLabels, precisionRecallTradeOff, primaryKeyColumnName);
        }
    }
}