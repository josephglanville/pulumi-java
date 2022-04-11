// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.enums.BlueprintTargetScope;
import io.pulumi.azurenative.blueprint.inputs.ParameterDefinitionArgs;
import io.pulumi.azurenative.blueprint.inputs.ResourceGroupDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlueprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlueprintArgs Empty = new BlueprintArgs();

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName")
      private final @Nullable Output<String> blueprintName;

    public Output<String> getBlueprintName() {
        return this.blueprintName == null ? Codegen.empty() : this.blueprintName;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Parameters required by this blueprint definition.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters;

    public Output<Map<String,ParameterDefinitionArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @Import(name="resourceGroups")
      private final @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;

    public Output<Map<String,ResourceGroupDefinitionArgs>> getResourceGroups() {
        return this.resourceGroups == null ? Codegen.empty() : this.resourceGroups;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @Import(name="resourceScope", required=true)
      private final Output<String> resourceScope;

    public Output<String> getResourceScope() {
        return this.resourceScope;
    }

    /**
     * The scope where this blueprint definition can be assigned.
     * 
     */
    @Import(name="targetScope", required=true)
      private final Output<Either<String,BlueprintTargetScope>> targetScope;

    public Output<Either<String,BlueprintTargetScope>> getTargetScope() {
        return this.targetScope;
    }

    /**
     * Published versions of this blueprint definition.
     * 
     */
    @Import(name="versions")
      private final @Nullable Output<Object> versions;

    public Output<Object> getVersions() {
        return this.versions == null ? Codegen.empty() : this.versions;
    }

    public BlueprintArgs(
        @Nullable Output<String> blueprintName,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters,
        @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups,
        Output<String> resourceScope,
        Output<Either<String,BlueprintTargetScope>> targetScope,
        @Nullable Output<Object> versions) {
        this.blueprintName = blueprintName;
        this.description = description;
        this.displayName = displayName;
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.targetScope = Objects.requireNonNull(targetScope, "expected parameter 'targetScope' to be non-null");
        this.versions = versions;
    }

    private BlueprintArgs() {
        this.blueprintName = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceGroups = Codegen.empty();
        this.resourceScope = Codegen.empty();
        this.targetScope = Codegen.empty();
        this.versions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> blueprintName;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters;
        private @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;
        private Output<String> resourceScope;
        private Output<Either<String,BlueprintTargetScope>> targetScope;
        private @Nullable Output<Object> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(BlueprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceScope = defaults.resourceScope;
    	      this.targetScope = defaults.targetScope;
    	      this.versions = defaults.versions;
        }

        public Builder blueprintName(@Nullable Output<String> blueprintName) {
            this.blueprintName = blueprintName;
            return this;
        }
        public Builder blueprintName(@Nullable String blueprintName) {
            this.blueprintName = Codegen.ofNullable(blueprintName);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterDefinitionArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder resourceGroups(@Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder resourceGroups(@Nullable Map<String,ResourceGroupDefinitionArgs> resourceGroups) {
            this.resourceGroups = Codegen.ofNullable(resourceGroups);
            return this;
        }
        public Builder resourceScope(Output<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }
        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Output.of(Objects.requireNonNull(resourceScope));
            return this;
        }
        public Builder targetScope(Output<Either<String,BlueprintTargetScope>> targetScope) {
            this.targetScope = Objects.requireNonNull(targetScope);
            return this;
        }
        public Builder targetScope(Either<String,BlueprintTargetScope> targetScope) {
            this.targetScope = Output.of(Objects.requireNonNull(targetScope));
            return this;
        }
        public Builder versions(@Nullable Output<Object> versions) {
            this.versions = versions;
            return this;
        }
        public Builder versions(@Nullable Object versions) {
            this.versions = Codegen.ofNullable(versions);
            return this;
        }        public BlueprintArgs build() {
            return new BlueprintArgs(blueprintName, description, displayName, parameters, resourceGroups, resourceScope, targetScope, versions);
        }
    }
}
