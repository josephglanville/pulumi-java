// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.inputs.ParameterValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyAssignmentArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAssignmentArtifactArgs Empty = new PolicyAssignmentArtifactArgs();

    /**
     * Name of the blueprint artifact.
     * 
     */
    @InputImport(name="artifactName")
      private final @Nullable Input<String> artifactName;

    public Input<String> getArtifactName() {
        return this.artifactName == null ? Input.empty() : this.artifactName;
    }

    /**
     * Name of the blueprint definition.
     * 
     */
    @InputImport(name="blueprintName", required=true)
      private final Input<String> blueprintName;

    public Input<String> getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable Input<List<String>> dependsOn;

    public Input<List<String>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is 'policyAssignment'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Parameter values for the policy definition.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<Map<String,ParameterValueArgs>> parameters;

    public Input<Map<String,ParameterValueArgs>> getParameters() {
        return this.parameters;
    }

    /**
     * Azure resource ID of the policy definition.
     * 
     */
    @InputImport(name="policyDefinitionId", required=true)
      private final Input<String> policyDefinitionId;

    public Input<String> getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Name of the resource group placeholder to which the policy will be assigned.
     * 
     */
    @InputImport(name="resourceGroup")
      private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @InputImport(name="resourceScope", required=true)
      private final Input<String> resourceScope;

    public Input<String> getResourceScope() {
        return this.resourceScope;
    }

    public PolicyAssignmentArtifactArgs(
        @Nullable Input<String> artifactName,
        Input<String> blueprintName,
        @Nullable Input<List<String>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> kind,
        Input<Map<String,ParameterValueArgs>> parameters,
        Input<String> policyDefinitionId,
        @Nullable Input<String> resourceGroup,
        Input<String> resourceScope) {
        this.artifactName = artifactName;
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
        this.resourceGroup = resourceGroup;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
    }

    private PolicyAssignmentArtifactArgs() {
        this.artifactName = Input.empty();
        this.blueprintName = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.kind = Input.empty();
        this.parameters = Input.empty();
        this.policyDefinitionId = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactName;
        private Input<String> blueprintName;
        private @Nullable Input<List<String>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> kind;
        private Input<Map<String,ParameterValueArgs>> parameters;
        private Input<String> policyDefinitionId;
        private @Nullable Input<String> resourceGroup;
        private Input<String> resourceScope;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactName = defaults.artifactName;
    	      this.blueprintName = defaults.blueprintName;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.kind = defaults.kind;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceScope = defaults.resourceScope;
        }

        public Builder setArtifactName(@Nullable Input<String> artifactName) {
            this.artifactName = artifactName;
            return this;
        }

        public Builder setArtifactName(@Nullable String artifactName) {
            this.artifactName = Input.ofNullable(artifactName);
            return this;
        }

        public Builder setBlueprintName(Input<String> blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }

        public Builder setBlueprintName(String blueprintName) {
            this.blueprintName = Input.of(Objects.requireNonNull(blueprintName));
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<String>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setParameters(Input<Map<String,ParameterValueArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(Map<String,ParameterValueArgs> parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder setPolicyDefinitionId(Input<String> policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }

        public Builder setPolicyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Input.of(Objects.requireNonNull(policyDefinitionId));
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder setResourceScope(Input<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }

        public Builder setResourceScope(String resourceScope) {
            this.resourceScope = Input.of(Objects.requireNonNull(resourceScope));
            return this;
        }
        public PolicyAssignmentArtifactArgs build() {
            return new PolicyAssignmentArtifactArgs(artifactName, blueprintName, dependsOn, description, displayName, kind, parameters, policyDefinitionId, resourceGroup, resourceScope);
        }
    }
}
