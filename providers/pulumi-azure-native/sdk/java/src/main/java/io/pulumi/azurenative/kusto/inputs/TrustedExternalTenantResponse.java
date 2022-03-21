// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a tenant ID that is trusted by the cluster.
 * 
 */
public final class TrustedExternalTenantResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrustedExternalTenantResponse Empty = new TrustedExternalTenantResponse();

    /**
     * GUID representing an external tenant.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public TrustedExternalTenantResponse(@Nullable String value) {
        this.value = value;
    }

    private TrustedExternalTenantResponse() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedExternalTenantResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedExternalTenantResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public TrustedExternalTenantResponse build() {
            return new TrustedExternalTenantResponse(value);
        }
    }
}
