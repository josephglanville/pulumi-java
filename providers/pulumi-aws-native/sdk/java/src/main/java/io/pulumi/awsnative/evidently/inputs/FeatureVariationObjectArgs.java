// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureVariationObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureVariationObjectArgs Empty = new FeatureVariationObjectArgs();

    @InputImport(name="booleanValue")
      private final @Nullable Output<Boolean> booleanValue;

    public Output<Boolean> getBooleanValue() {
        return this.booleanValue == null ? Output.empty() : this.booleanValue;
    }

    @InputImport(name="doubleValue")
      private final @Nullable Output<Double> doubleValue;

    public Output<Double> getDoubleValue() {
        return this.doubleValue == null ? Output.empty() : this.doubleValue;
    }

    @InputImport(name="longValue")
      private final @Nullable Output<Double> longValue;

    public Output<Double> getLongValue() {
        return this.longValue == null ? Output.empty() : this.longValue;
    }

    @InputImport(name="stringValue")
      private final @Nullable Output<String> stringValue;

    public Output<String> getStringValue() {
        return this.stringValue == null ? Output.empty() : this.stringValue;
    }

    @InputImport(name="variationName")
      private final @Nullable Output<String> variationName;

    public Output<String> getVariationName() {
        return this.variationName == null ? Output.empty() : this.variationName;
    }

    public FeatureVariationObjectArgs(
        @Nullable Output<Boolean> booleanValue,
        @Nullable Output<Double> doubleValue,
        @Nullable Output<Double> longValue,
        @Nullable Output<String> stringValue,
        @Nullable Output<String> variationName) {
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.longValue = longValue;
        this.stringValue = stringValue;
        this.variationName = variationName;
    }

    private FeatureVariationObjectArgs() {
        this.booleanValue = Output.empty();
        this.doubleValue = Output.empty();
        this.longValue = Output.empty();
        this.stringValue = Output.empty();
        this.variationName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureVariationObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> booleanValue;
        private @Nullable Output<Double> doubleValue;
        private @Nullable Output<Double> longValue;
        private @Nullable Output<String> stringValue;
        private @Nullable Output<String> variationName;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureVariationObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.longValue = defaults.longValue;
    	      this.stringValue = defaults.stringValue;
    	      this.variationName = defaults.variationName;
        }

        public Builder booleanValue(@Nullable Output<Boolean> booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder booleanValue(@Nullable Boolean booleanValue) {
            this.booleanValue = Output.ofNullable(booleanValue);
            return this;
        }

        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder doubleValue(@Nullable Double doubleValue) {
            this.doubleValue = Output.ofNullable(doubleValue);
            return this;
        }

        public Builder longValue(@Nullable Output<Double> longValue) {
            this.longValue = longValue;
            return this;
        }

        public Builder longValue(@Nullable Double longValue) {
            this.longValue = Output.ofNullable(longValue);
            return this;
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = Output.ofNullable(stringValue);
            return this;
        }

        public Builder variationName(@Nullable Output<String> variationName) {
            this.variationName = variationName;
            return this;
        }

        public Builder variationName(@Nullable String variationName) {
            this.variationName = Output.ofNullable(variationName);
            return this;
        }
        public FeatureVariationObjectArgs build() {
            return new FeatureVariationObjectArgs(booleanValue, doubleValue, longValue, stringValue, variationName);
        }
    }
}
