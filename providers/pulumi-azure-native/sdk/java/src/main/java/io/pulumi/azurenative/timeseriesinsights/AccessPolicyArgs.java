// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.enums.AccessPolicyRole;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyArgs Empty = new AccessPolicyArgs();

    /**
     * Name of the access policy.
     * 
     */
    @InputImport(name="accessPolicyName")
      private final @Nullable Input<String> accessPolicyName;

    public Input<String> getAccessPolicyName() {
        return this.accessPolicyName == null ? Input.empty() : this.accessPolicyName;
    }

    /**
     * An description of the access policy.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @InputImport(name="environmentName", required=true)
      private final Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * The objectId of the principal in Azure Active Directory.
     * 
     */
    @InputImport(name="principalObjectId")
      private final @Nullable Input<String> principalObjectId;

    public Input<String> getPrincipalObjectId() {
        return this.principalObjectId == null ? Input.empty() : this.principalObjectId;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of roles the principal is assigned on the environment.
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Input<List<Either<String,AccessPolicyRole>>> roles;

    public Input<List<Either<String,AccessPolicyRole>>> getRoles() {
        return this.roles == null ? Input.empty() : this.roles;
    }

    public AccessPolicyArgs(
        @Nullable Input<String> accessPolicyName,
        @Nullable Input<String> description,
        Input<String> environmentName,
        @Nullable Input<String> principalObjectId,
        Input<String> resourceGroupName,
        @Nullable Input<List<Either<String,AccessPolicyRole>>> roles) {
        this.accessPolicyName = accessPolicyName;
        this.description = description;
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.principalObjectId = principalObjectId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roles = roles;
    }

    private AccessPolicyArgs() {
        this.accessPolicyName = Input.empty();
        this.description = Input.empty();
        this.environmentName = Input.empty();
        this.principalObjectId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPolicyName;
        private @Nullable Input<String> description;
        private Input<String> environmentName;
        private @Nullable Input<String> principalObjectId;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<Either<String,AccessPolicyRole>>> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyName = defaults.accessPolicyName;
    	      this.description = defaults.description;
    	      this.environmentName = defaults.environmentName;
    	      this.principalObjectId = defaults.principalObjectId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roles = defaults.roles;
        }

        public Builder setAccessPolicyName(@Nullable Input<String> accessPolicyName) {
            this.accessPolicyName = accessPolicyName;
            return this;
        }

        public Builder setAccessPolicyName(@Nullable String accessPolicyName) {
            this.accessPolicyName = Input.ofNullable(accessPolicyName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnvironmentName(Input<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder setEnvironmentName(String environmentName) {
            this.environmentName = Input.of(Objects.requireNonNull(environmentName));
            return this;
        }

        public Builder setPrincipalObjectId(@Nullable Input<String> principalObjectId) {
            this.principalObjectId = principalObjectId;
            return this;
        }

        public Builder setPrincipalObjectId(@Nullable String principalObjectId) {
            this.principalObjectId = Input.ofNullable(principalObjectId);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRoles(@Nullable Input<List<Either<String,AccessPolicyRole>>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setRoles(@Nullable List<Either<String,AccessPolicyRole>> roles) {
            this.roles = Input.ofNullable(roles);
            return this;
        }
        public AccessPolicyArgs build() {
            return new AccessPolicyArgs(accessPolicyName, description, environmentName, principalObjectId, resourceGroupName, roles);
        }
    }
}
