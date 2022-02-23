// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a tenant ID that is trusted by the cluster.
 * 
 */
public final class TrustedExternalTenantArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrustedExternalTenantArgs Empty = new TrustedExternalTenantArgs();

    /**
     * GUID representing an external tenant.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public TrustedExternalTenantArgs(@Nullable Input<String> value) {
        this.value = value;
    }

    private TrustedExternalTenantArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedExternalTenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedExternalTenantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public TrustedExternalTenantArgs build() {
            return new TrustedExternalTenantArgs(value);
        }
    }
}
