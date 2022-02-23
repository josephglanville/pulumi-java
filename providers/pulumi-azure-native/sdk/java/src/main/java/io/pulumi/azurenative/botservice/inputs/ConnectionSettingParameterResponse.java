// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Extra Parameter in a Connection Setting Properties to indicate service provider specific properties
 * 
 */
public final class ConnectionSettingParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionSettingParameterResponse Empty = new ConnectionSettingParameterResponse();

    /**
     * Key for the Connection Setting Parameter.
     * 
     */
    @InputImport(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * Value associated with the Connection Setting Parameter.
     * 
     */
    @InputImport(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ConnectionSettingParameterResponse(
        @Nullable String key,
        @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    private ConnectionSettingParameterResponse() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSettingParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionSettingParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ConnectionSettingParameterResponse build() {
            return new ConnectionSettingParameterResponse(key, value);
        }
    }
}
