// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SSISPropertyOverrideResponse {
    private final @Nullable Boolean isSensitive;
    private final Object value;

    @OutputCustomType.Constructor({"isSensitive","value"})
    private SSISPropertyOverrideResponse(
        @Nullable Boolean isSensitive,
        Object value) {
        this.isSensitive = isSensitive;
        this.value = Objects.requireNonNull(value);
    }

    public Optional<Boolean> getIsSensitive() {
        return Optional.ofNullable(this.isSensitive);
    }
    public Object getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISPropertyOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSensitive;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISPropertyOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSensitive = defaults.isSensitive;
    	      this.value = defaults.value;
        }

        public Builder setIsSensitive(@Nullable Boolean isSensitive) {
            this.isSensitive = isSensitive;
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public SSISPropertyOverrideResponse build() {
            return new SSISPropertyOverrideResponse(isSensitive, value);
        }
    }
}
