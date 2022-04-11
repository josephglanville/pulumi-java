// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationArgs Empty = new ResourceTypeRegistrationArgs();

    @Import(name="properties")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties;

    public Output<ResourceTypeRegistrationPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public ResourceTypeRegistrationArgs(@Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties) {
        this.properties = properties;
    }

    private ResourceTypeRegistrationArgs() {
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(@Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ResourceTypeRegistrationPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public ResourceTypeRegistrationArgs build() {
            return new ResourceTypeRegistrationArgs(properties);
        }
    }
}
