// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.enums.BlueprintTargetScope;
import io.pulumi.azurenative.blueprint.inputs.ParameterDefinitionArgs;
import io.pulumi.azurenative.blueprint.inputs.ResourceGroupDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublishedBlueprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublishedBlueprintArgs Empty = new PublishedBlueprintArgs();

    /**
     * Name of the published blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
      private final Output<String> blueprintName;

    public Output<String> getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * Version-specific change notes.
     * 
     */
    @Import(name="changeNotes")
      private final @Nullable Output<String> changeNotes;

    public Output<String> getChangeNotes() {
        return this.changeNotes == null ? Output.empty() : this.changeNotes;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Parameters required by this blueprint definition.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters;

    public Output<Map<String,ParameterDefinitionArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @Import(name="resourceGroups")
      private final @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;

    public Output<Map<String,ResourceGroupDefinitionArgs>> getResourceGroups() {
        return this.resourceGroups == null ? Output.empty() : this.resourceGroups;
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
    @Import(name="targetScope")
      private final @Nullable Output<Either<String,BlueprintTargetScope>> targetScope;

    public Output<Either<String,BlueprintTargetScope>> getTargetScope() {
        return this.targetScope == null ? Output.empty() : this.targetScope;
    }

    /**
     * Version of the published blueprint definition.
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId == null ? Output.empty() : this.versionId;
    }

    public PublishedBlueprintArgs(
        Output<String> blueprintName,
        @Nullable Output<String> changeNotes,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters,
        @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups,
        Output<String> resourceScope,
        @Nullable Output<Either<String,BlueprintTargetScope>> targetScope,
        @Nullable Output<String> versionId) {
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.changeNotes = changeNotes;
        this.description = description;
        this.displayName = displayName;
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.targetScope = targetScope;
        this.versionId = versionId;
    }

    private PublishedBlueprintArgs() {
        this.blueprintName = Output.empty();
        this.changeNotes = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.parameters = Output.empty();
        this.resourceGroups = Output.empty();
        this.resourceScope = Output.empty();
        this.targetScope = Output.empty();
        this.versionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishedBlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> blueprintName;
        private @Nullable Output<String> changeNotes;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters;
        private @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;
        private Output<String> resourceScope;
        private @Nullable Output<Either<String,BlueprintTargetScope>> targetScope;
        private @Nullable Output<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishedBlueprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.changeNotes = defaults.changeNotes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceScope = defaults.resourceScope;
    	      this.targetScope = defaults.targetScope;
    	      this.versionId = defaults.versionId;
        }

        public Builder blueprintName(Output<String> blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }
        public Builder blueprintName(String blueprintName) {
            this.blueprintName = Output.of(Objects.requireNonNull(blueprintName));
            return this;
        }
        public Builder changeNotes(@Nullable Output<String> changeNotes) {
            this.changeNotes = changeNotes;
            return this;
        }
        public Builder changeNotes(@Nullable String changeNotes) {
            this.changeNotes = Output.ofNullable(changeNotes);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterDefinitionArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder resourceGroups(@Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder resourceGroups(@Nullable Map<String,ResourceGroupDefinitionArgs> resourceGroups) {
            this.resourceGroups = Output.ofNullable(resourceGroups);
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
        public Builder targetScope(@Nullable Output<Either<String,BlueprintTargetScope>> targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public Builder targetScope(@Nullable Either<String,BlueprintTargetScope> targetScope) {
            this.targetScope = Output.ofNullable(targetScope);
            return this;
        }
        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }
        public Builder versionId(@Nullable String versionId) {
            this.versionId = Output.ofNullable(versionId);
            return this;
        }        public PublishedBlueprintArgs build() {
            return new PublishedBlueprintArgs(blueprintName, changeNotes, description, displayName, parameters, resourceGroups, resourceScope, targetScope, versionId);
        }
    }
}
