// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseResourceMovePolicy extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseResourceMovePolicy Empty = new ResourceTypeRegistrationPropertiesResponseResourceMovePolicy();

    @InputImport(name="crossResourceGroupMoveEnabled")
    private final @Nullable Boolean crossResourceGroupMoveEnabled;

    public Optional<Boolean> getCrossResourceGroupMoveEnabled() {
        return this.crossResourceGroupMoveEnabled == null ? Optional.empty() : Optional.ofNullable(this.crossResourceGroupMoveEnabled);
    }

    @InputImport(name="crossSubscriptionMoveEnabled")
    private final @Nullable Boolean crossSubscriptionMoveEnabled;

    public Optional<Boolean> getCrossSubscriptionMoveEnabled() {
        return this.crossSubscriptionMoveEnabled == null ? Optional.empty() : Optional.ofNullable(this.crossSubscriptionMoveEnabled);
    }

    @InputImport(name="validationRequired")
    private final @Nullable Boolean validationRequired;

    public Optional<Boolean> getValidationRequired() {
        return this.validationRequired == null ? Optional.empty() : Optional.ofNullable(this.validationRequired);
    }

    public ResourceTypeRegistrationPropertiesResponseResourceMovePolicy(
        @Nullable Boolean crossResourceGroupMoveEnabled,
        @Nullable Boolean crossSubscriptionMoveEnabled,
        @Nullable Boolean validationRequired) {
        this.crossResourceGroupMoveEnabled = crossResourceGroupMoveEnabled;
        this.crossSubscriptionMoveEnabled = crossSubscriptionMoveEnabled;
        this.validationRequired = validationRequired;
    }

    private ResourceTypeRegistrationPropertiesResponseResourceMovePolicy() {
        this.crossResourceGroupMoveEnabled = null;
        this.crossSubscriptionMoveEnabled = null;
        this.validationRequired = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseResourceMovePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crossResourceGroupMoveEnabled;
        private @Nullable Boolean crossSubscriptionMoveEnabled;
        private @Nullable Boolean validationRequired;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseResourceMovePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossResourceGroupMoveEnabled = defaults.crossResourceGroupMoveEnabled;
    	      this.crossSubscriptionMoveEnabled = defaults.crossSubscriptionMoveEnabled;
    	      this.validationRequired = defaults.validationRequired;
        }

        public Builder setCrossResourceGroupMoveEnabled(@Nullable Boolean crossResourceGroupMoveEnabled) {
            this.crossResourceGroupMoveEnabled = crossResourceGroupMoveEnabled;
            return this;
        }

        public Builder setCrossSubscriptionMoveEnabled(@Nullable Boolean crossSubscriptionMoveEnabled) {
            this.crossSubscriptionMoveEnabled = crossSubscriptionMoveEnabled;
            return this;
        }

        public Builder setValidationRequired(@Nullable Boolean validationRequired) {
            this.validationRequired = validationRequired;
            return this;
        }

        public ResourceTypeRegistrationPropertiesResponseResourceMovePolicy build() {
            return new ResourceTypeRegistrationPropertiesResponseResourceMovePolicy(crossResourceGroupMoveEnabled, crossSubscriptionMoveEnabled, validationRequired);
        }
    }
}
