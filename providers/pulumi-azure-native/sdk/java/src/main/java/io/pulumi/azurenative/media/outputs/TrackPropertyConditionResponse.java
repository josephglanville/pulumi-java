// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrackPropertyConditionResponse {
    private final String operation;
    private final String property;
    private final @Nullable String value;

    @OutputCustomType.Constructor({"operation","property","value"})
    private TrackPropertyConditionResponse(
        String operation,
        String property,
        @Nullable String value) {
        this.operation = Objects.requireNonNull(operation);
        this.property = Objects.requireNonNull(property);
        this.value = value;
    }

    public String getOperation() {
        return this.operation;
    }
    public String getProperty() {
        return this.property;
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrackPropertyConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operation;
        private String property;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TrackPropertyConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setProperty(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public TrackPropertyConditionResponse build() {
            return new TrackPropertyConditionResponse(operation, property, value);
        }
    }
}
