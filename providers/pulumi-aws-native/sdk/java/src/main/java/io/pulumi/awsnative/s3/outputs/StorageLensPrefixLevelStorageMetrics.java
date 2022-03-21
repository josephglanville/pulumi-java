// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.StorageLensSelectionCriteria;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageLensPrefixLevelStorageMetrics {
    /**
     * Specifies whether prefix-level storage metrics are enabled or disabled.
     * 
     */
    private final @Nullable Boolean isEnabled;
    private final @Nullable StorageLensSelectionCriteria selectionCriteria;

    @CustomType.Constructor
    private StorageLensPrefixLevelStorageMetrics(
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @CustomType.Parameter("selectionCriteria") @Nullable StorageLensSelectionCriteria selectionCriteria) {
        this.isEnabled = isEnabled;
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Specifies whether prefix-level storage metrics are enabled or disabled.
     * 
    */
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<StorageLensSelectionCriteria> getSelectionCriteria() {
        return Optional.ofNullable(this.selectionCriteria);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensPrefixLevelStorageMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable StorageLensSelectionCriteria selectionCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensPrefixLevelStorageMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.selectionCriteria = defaults.selectionCriteria;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder selectionCriteria(@Nullable StorageLensSelectionCriteria selectionCriteria) {
            this.selectionCriteria = selectionCriteria;
            return this;
        }        public StorageLensPrefixLevelStorageMetrics build() {
            return new StorageLensPrefixLevelStorageMetrics(isEnabled, selectionCriteria);
        }
    }
}
