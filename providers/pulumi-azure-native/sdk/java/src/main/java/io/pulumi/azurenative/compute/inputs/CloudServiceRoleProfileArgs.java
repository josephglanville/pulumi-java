// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceRoleProfilePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the role profile for the cloud service.
 * 
 */
public final class CloudServiceRoleProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceRoleProfileArgs Empty = new CloudServiceRoleProfileArgs();

    /**
     * List of roles for the cloud service.
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Output<List<CloudServiceRoleProfilePropertiesArgs>> roles;

    public Output<List<CloudServiceRoleProfilePropertiesArgs>> getRoles() {
        return this.roles == null ? Output.empty() : this.roles;
    }

    public CloudServiceRoleProfileArgs(@Nullable Output<List<CloudServiceRoleProfilePropertiesArgs>> roles) {
        this.roles = roles;
    }

    private CloudServiceRoleProfileArgs() {
        this.roles = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CloudServiceRoleProfilePropertiesArgs>> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
        }

        public Builder roles(@Nullable Output<List<CloudServiceRoleProfilePropertiesArgs>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder roles(@Nullable List<CloudServiceRoleProfilePropertiesArgs> roles) {
            this.roles = Output.ofNullable(roles);
            return this;
        }
        public CloudServiceRoleProfileArgs build() {
            return new CloudServiceRoleProfileArgs(roles);
        }
    }
}
