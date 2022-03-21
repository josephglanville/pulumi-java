// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Access keys for the web service calls.
 * 
 */
public final class WebServiceKeysResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebServiceKeysResponse Empty = new WebServiceKeysResponse();

    /**
     * The primary access key.
     * 
     */
    @Import(name="primary")
      private final @Nullable String primary;

    public Optional<String> getPrimary() {
        return this.primary == null ? Optional.empty() : Optional.ofNullable(this.primary);
    }

    /**
     * The secondary access key.
     * 
     */
    @Import(name="secondary")
      private final @Nullable String secondary;

    public Optional<String> getSecondary() {
        return this.secondary == null ? Optional.empty() : Optional.ofNullable(this.secondary);
    }

    public WebServiceKeysResponse(
        @Nullable String primary,
        @Nullable String secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    private WebServiceKeysResponse() {
        this.primary = null;
        this.secondary = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServiceKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primary;
        private @Nullable String secondary;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServiceKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        public Builder primary(@Nullable String primary) {
            this.primary = primary;
            return this;
        }
        public Builder secondary(@Nullable String secondary) {
            this.secondary = secondary;
            return this;
        }        public WebServiceKeysResponse build() {
            return new WebServiceKeysResponse(primary, secondary);
        }
    }
}
