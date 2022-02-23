// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureVariationObject extends io.pulumi.resources.InvokeArgs {

    public static final FeatureVariationObject Empty = new FeatureVariationObject();

    @InputImport(name="booleanValue")
      private final @Nullable Boolean booleanValue;

    public Optional<Boolean> getBooleanValue() {
        return this.booleanValue == null ? Optional.empty() : Optional.ofNullable(this.booleanValue);
    }

    @InputImport(name="doubleValue")
      private final @Nullable Double doubleValue;

    public Optional<Double> getDoubleValue() {
        return this.doubleValue == null ? Optional.empty() : Optional.ofNullable(this.doubleValue);
    }

    @InputImport(name="longValue")
      private final @Nullable Double longValue;

    public Optional<Double> getLongValue() {
        return this.longValue == null ? Optional.empty() : Optional.ofNullable(this.longValue);
    }

    @InputImport(name="stringValue")
      private final @Nullable String stringValue;

    public Optional<String> getStringValue() {
        return this.stringValue == null ? Optional.empty() : Optional.ofNullable(this.stringValue);
    }

    @InputImport(name="variationName")
      private final @Nullable String variationName;

    public Optional<String> getVariationName() {
        return this.variationName == null ? Optional.empty() : Optional.ofNullable(this.variationName);
    }

    public FeatureVariationObject(
        @Nullable Boolean booleanValue,
        @Nullable Double doubleValue,
        @Nullable Double longValue,
        @Nullable String stringValue,
        @Nullable String variationName) {
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.longValue = longValue;
        this.stringValue = stringValue;
        this.variationName = variationName;
    }

    private FeatureVariationObject() {
        this.booleanValue = null;
        this.doubleValue = null;
        this.longValue = null;
        this.stringValue = null;
        this.variationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureVariationObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean booleanValue;
        private @Nullable Double doubleValue;
        private @Nullable Double longValue;
        private @Nullable String stringValue;
        private @Nullable String variationName;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureVariationObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.longValue = defaults.longValue;
    	      this.stringValue = defaults.stringValue;
    	      this.variationName = defaults.variationName;
        }

        public Builder setBooleanValue(@Nullable Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setDoubleValue(@Nullable Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setLongValue(@Nullable Double longValue) {
            this.longValue = longValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setVariationName(@Nullable String variationName) {
            this.variationName = variationName;
            return this;
        }
        public FeatureVariationObject build() {
            return new FeatureVariationObject(booleanValue, doubleValue, longValue, stringValue, variationName);
        }
    }
}
