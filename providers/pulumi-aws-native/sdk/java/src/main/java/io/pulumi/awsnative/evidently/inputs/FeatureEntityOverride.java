// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureEntityOverride extends io.pulumi.resources.InvokeArgs {

    public static final FeatureEntityOverride Empty = new FeatureEntityOverride();

    @InputImport(name="entityId")
      private final @Nullable String entityId;

    public Optional<String> getEntityId() {
        return this.entityId == null ? Optional.empty() : Optional.ofNullable(this.entityId);
    }

    @InputImport(name="variation")
      private final @Nullable String variation;

    public Optional<String> getVariation() {
        return this.variation == null ? Optional.empty() : Optional.ofNullable(this.variation);
    }

    public FeatureEntityOverride(
        @Nullable String entityId,
        @Nullable String variation) {
        this.entityId = entityId;
        this.variation = variation;
    }

    private FeatureEntityOverride() {
        this.entityId = null;
        this.variation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureEntityOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String entityId;
        private @Nullable String variation;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureEntityOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
    	      this.variation = defaults.variation;
        }

        public Builder setEntityId(@Nullable String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setVariation(@Nullable String variation) {
            this.variation = variation;
            return this;
        }
        public FeatureEntityOverride build() {
            return new FeatureEntityOverride(entityId, variation);
        }
    }
}
