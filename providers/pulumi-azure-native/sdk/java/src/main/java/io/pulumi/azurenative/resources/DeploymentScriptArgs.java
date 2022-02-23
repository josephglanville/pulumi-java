// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.enums.ScriptType;
import io.pulumi.azurenative.resources.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentScriptArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentScriptArgs Empty = new DeploymentScriptArgs();

    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Type of the script.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,ScriptType>> kind;

    public Input<Either<String,ScriptType>> getKind() {
        return this.kind;
    }

    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment script.
     * 
     */
    @InputImport(name="scriptName")
      private final @Nullable Input<String> scriptName;

    public Input<String> getScriptName() {
        return this.scriptName == null ? Input.empty() : this.scriptName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DeploymentScriptArgs(
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        Input<Either<String,ScriptType>> kind,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> scriptName,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptName = scriptName;
        this.tags = tags;
    }

    private DeploymentScriptArgs() {
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scriptName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private Input<Either<String,ScriptType>> kind;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scriptName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptName = defaults.scriptName;
    	      this.tags = defaults.tags;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(Input<Either<String,ScriptType>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,ScriptType> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setScriptName(@Nullable Input<String> scriptName) {
            this.scriptName = scriptName;
            return this;
        }

        public Builder setScriptName(@Nullable String scriptName) {
            this.scriptName = Input.ofNullable(scriptName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DeploymentScriptArgs build() {
            return new DeploymentScriptArgs(identity, kind, location, resourceGroupName, scriptName, tags);
        }
    }
}
