// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.CanonicalProfileDefinitionResponseProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CanonicalProfileDefinitionResponse {
    /**
     * Canonical profile ID.
     * 
     */
    private final @Nullable Integer canonicalProfileId;
    /**
     * Properties of the canonical profile.
     * 
     */
    private final @Nullable List<CanonicalProfileDefinitionResponseProperties> properties;

    @CustomType.Constructor
    private CanonicalProfileDefinitionResponse(
        @CustomType.Parameter("canonicalProfileId") @Nullable Integer canonicalProfileId,
        @CustomType.Parameter("properties") @Nullable List<CanonicalProfileDefinitionResponseProperties> properties) {
        this.canonicalProfileId = canonicalProfileId;
        this.properties = properties;
    }

    /**
     * Canonical profile ID.
     * 
    */
    public Optional<Integer> getCanonicalProfileId() {
        return Optional.ofNullable(this.canonicalProfileId);
    }
    /**
     * Properties of the canonical profile.
     * 
    */
    public List<CanonicalProfileDefinitionResponseProperties> getProperties() {
        return this.properties == null ? List.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanonicalProfileDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer canonicalProfileId;
        private @Nullable List<CanonicalProfileDefinitionResponseProperties> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(CanonicalProfileDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalProfileId = defaults.canonicalProfileId;
    	      this.properties = defaults.properties;
        }

        public Builder canonicalProfileId(@Nullable Integer canonicalProfileId) {
            this.canonicalProfileId = canonicalProfileId;
            return this;
        }
        public Builder properties(@Nullable List<CanonicalProfileDefinitionResponseProperties> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(CanonicalProfileDefinitionResponseProperties... properties) {
            return properties(List.of(properties));
        }        public CanonicalProfileDefinitionResponse build() {
            return new CanonicalProfileDefinitionResponse(canonicalProfileId, properties);
        }
    }
}
