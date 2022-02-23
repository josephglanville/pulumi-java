// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters schema of integration account map.
 * 
 */
public final class IntegrationAccountMapPropertiesResponseParametersSchema extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationAccountMapPropertiesResponseParametersSchema Empty = new IntegrationAccountMapPropertiesResponseParametersSchema();

    /**
     * The reference name.
     * 
     */
    @InputImport(name="ref")
      private final @Nullable String ref;

    public Optional<String> getRef() {
        return this.ref == null ? Optional.empty() : Optional.ofNullable(this.ref);
    }

    public IntegrationAccountMapPropertiesResponseParametersSchema(@Nullable String ref) {
        this.ref = ref;
    }

    private IntegrationAccountMapPropertiesResponseParametersSchema() {
        this.ref = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountMapPropertiesResponseParametersSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ref;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountMapPropertiesResponseParametersSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
        }

        public Builder setRef(@Nullable String ref) {
            this.ref = ref;
            return this;
        }
        public IntegrationAccountMapPropertiesResponseParametersSchema build() {
            return new IntegrationAccountMapPropertiesResponseParametersSchema(ref);
        }
    }
}
