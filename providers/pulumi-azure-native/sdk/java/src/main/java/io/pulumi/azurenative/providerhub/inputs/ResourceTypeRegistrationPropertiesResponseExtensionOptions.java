// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ResourceTypeExtensionOptionsResponseResourceCreationBegin;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseExtensionOptions extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseExtensionOptions Empty = new ResourceTypeRegistrationPropertiesResponseExtensionOptions();

    @InputImport(name="resourceCreationBegin")
    private final @Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin;

    public Optional<ResourceTypeExtensionOptionsResponseResourceCreationBegin> getResourceCreationBegin() {
        return this.resourceCreationBegin == null ? Optional.empty() : Optional.ofNullable(this.resourceCreationBegin);
    }

    public ResourceTypeRegistrationPropertiesResponseExtensionOptions(@Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin) {
        this.resourceCreationBegin = resourceCreationBegin;
    }

    private ResourceTypeRegistrationPropertiesResponseExtensionOptions() {
        this.resourceCreationBegin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseExtensionOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseExtensionOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceCreationBegin = defaults.resourceCreationBegin;
        }

        public Builder setResourceCreationBegin(@Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin) {
            this.resourceCreationBegin = resourceCreationBegin;
            return this;
        }

        public ResourceTypeRegistrationPropertiesResponseExtensionOptions build() {
            return new ResourceTypeRegistrationPropertiesResponseExtensionOptions(resourceCreationBegin);
        }
    }
}
