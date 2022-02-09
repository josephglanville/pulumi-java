// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NumberGreaterThanOrEqualsAdvancedFilterResponse {
    private final @Nullable String key;
    private final String operatorType;
    private final @Nullable Double value;

    @OutputCustomType.Constructor({"key","operatorType","value"})
    private NumberGreaterThanOrEqualsAdvancedFilterResponse(
        @Nullable String key,
        String operatorType,
        @Nullable Double value) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType);
        this.value = value;
    }

    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    public String getOperatorType() {
        return this.operatorType;
    }
    public Optional<Double> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberGreaterThanOrEqualsAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberGreaterThanOrEqualsAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = value;
            return this;
        }

        public NumberGreaterThanOrEqualsAdvancedFilterResponse build() {
            return new NumberGreaterThanOrEqualsAdvancedFilterResponse(key, operatorType, value);
        }
    }
}
