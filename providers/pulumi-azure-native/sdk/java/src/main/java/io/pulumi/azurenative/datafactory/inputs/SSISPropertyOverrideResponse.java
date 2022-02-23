// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSIS property override.
 * 
 */
public final class SSISPropertyOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final SSISPropertyOverrideResponse Empty = new SSISPropertyOverrideResponse();

    /**
     * Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     * 
     */
    @InputImport(name="isSensitive")
      private final @Nullable Boolean isSensitive;

    public Optional<Boolean> getIsSensitive() {
        return this.isSensitive == null ? Optional.empty() : Optional.ofNullable(this.isSensitive);
    }

    /**
     * SSIS package property override value. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="value", required=true)
      private final Object value;

    public Object getValue() {
        return this.value;
    }

    public SSISPropertyOverrideResponse(
        @Nullable Boolean isSensitive,
        Object value) {
        this.isSensitive = isSensitive;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SSISPropertyOverrideResponse() {
        this.isSensitive = null;
        this.value = null;
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
