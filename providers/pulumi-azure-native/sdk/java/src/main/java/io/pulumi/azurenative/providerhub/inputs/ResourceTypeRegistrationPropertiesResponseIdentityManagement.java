// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseIdentityManagement extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseIdentityManagement Empty = new ResourceTypeRegistrationPropertiesResponseIdentityManagement();

    @Import(name="applicationId")
      private final @Nullable String applicationId;

    public Optional<String> getApplicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ResourceTypeRegistrationPropertiesResponseIdentityManagement(
        @Nullable String applicationId,
        @Nullable String type) {
        this.applicationId = applicationId;
        this.type = type;
    }

    private ResourceTypeRegistrationPropertiesResponseIdentityManagement() {
        this.applicationId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseIdentityManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseIdentityManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.type = defaults.type;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ResourceTypeRegistrationPropertiesResponseIdentityManagement build() {
            return new ResourceTypeRegistrationPropertiesResponseIdentityManagement(applicationId, type);
        }
    }
}
