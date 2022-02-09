// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.PolicyType;
import io.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueArgs;
import io.pulumi.azurenative.authorization.inputs.PolicyDefinitionGroupArgs;
import io.pulumi.azurenative.authorization.inputs.PolicyDefinitionReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySetDefinitionAtManagementGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySetDefinitionAtManagementGroupArgs Empty = new PolicySetDefinitionAtManagementGroupArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="managementGroupId", required=true)
    private final Input<String> managementGroupId;

    public Input<String> getManagementGroupId() {
        return this.managementGroupId;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Object> metadata;

    public Input<Object> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterDefinitionsValueArgs>> parameters;

    public Input<Map<String,ParameterDefinitionsValueArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="policyDefinitionGroups")
    private final @Nullable Input<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups;

    public Input<List<PolicyDefinitionGroupArgs>> getPolicyDefinitionGroups() {
        return this.policyDefinitionGroups == null ? Input.empty() : this.policyDefinitionGroups;
    }

    @InputImport(name="policyDefinitions", required=true)
    private final Input<List<PolicyDefinitionReferenceArgs>> policyDefinitions;

    public Input<List<PolicyDefinitionReferenceArgs>> getPolicyDefinitions() {
        return this.policyDefinitions;
    }

    @InputImport(name="policySetDefinitionName")
    private final @Nullable Input<String> policySetDefinitionName;

    public Input<String> getPolicySetDefinitionName() {
        return this.policySetDefinitionName == null ? Input.empty() : this.policySetDefinitionName;
    }

    @InputImport(name="policyType")
    private final @Nullable Input<Either<String,PolicyType>> policyType;

    public Input<Either<String,PolicyType>> getPolicyType() {
        return this.policyType == null ? Input.empty() : this.policyType;
    }

    public PolicySetDefinitionAtManagementGroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> managementGroupId,
        @Nullable Input<Object> metadata,
        @Nullable Input<Map<String,ParameterDefinitionsValueArgs>> parameters,
        @Nullable Input<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups,
        Input<List<PolicyDefinitionReferenceArgs>> policyDefinitions,
        @Nullable Input<String> policySetDefinitionName,
        @Nullable Input<Either<String,PolicyType>> policyType) {
        this.description = description;
        this.displayName = displayName;
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.metadata = metadata;
        this.parameters = parameters;
        this.policyDefinitionGroups = policyDefinitionGroups;
        this.policyDefinitions = Objects.requireNonNull(policyDefinitions, "expected parameter 'policyDefinitions' to be non-null");
        this.policySetDefinitionName = policySetDefinitionName;
        this.policyType = policyType;
    }

    private PolicySetDefinitionAtManagementGroupArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.managementGroupId = Input.empty();
        this.metadata = Input.empty();
        this.parameters = Input.empty();
        this.policyDefinitionGroups = Input.empty();
        this.policyDefinitions = Input.empty();
        this.policySetDefinitionName = Input.empty();
        this.policyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySetDefinitionAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> managementGroupId;
        private @Nullable Input<Object> metadata;
        private @Nullable Input<Map<String,ParameterDefinitionsValueArgs>> parameters;
        private @Nullable Input<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups;
        private Input<List<PolicyDefinitionReferenceArgs>> policyDefinitions;
        private @Nullable Input<String> policySetDefinitionName;
        private @Nullable Input<Either<String,PolicyType>> policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySetDefinitionAtManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.metadata = defaults.metadata;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionGroups = defaults.policyDefinitionGroups;
    	      this.policyDefinitions = defaults.policyDefinitions;
    	      this.policySetDefinitionName = defaults.policySetDefinitionName;
    	      this.policyType = defaults.policyType;
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

        public Builder setManagementGroupId(Input<String> managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder setManagementGroupId(String managementGroupId) {
            this.managementGroupId = Input.of(Objects.requireNonNull(managementGroupId));
            return this;
        }

        public Builder setMetadata(@Nullable Input<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterDefinitionsValueArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterDefinitionsValueArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPolicyDefinitionGroups(@Nullable Input<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups) {
            this.policyDefinitionGroups = policyDefinitionGroups;
            return this;
        }

        public Builder setPolicyDefinitionGroups(@Nullable List<PolicyDefinitionGroupArgs> policyDefinitionGroups) {
            this.policyDefinitionGroups = Input.ofNullable(policyDefinitionGroups);
            return this;
        }

        public Builder setPolicyDefinitions(Input<List<PolicyDefinitionReferenceArgs>> policyDefinitions) {
            this.policyDefinitions = Objects.requireNonNull(policyDefinitions);
            return this;
        }

        public Builder setPolicyDefinitions(List<PolicyDefinitionReferenceArgs> policyDefinitions) {
            this.policyDefinitions = Input.of(Objects.requireNonNull(policyDefinitions));
            return this;
        }

        public Builder setPolicySetDefinitionName(@Nullable Input<String> policySetDefinitionName) {
            this.policySetDefinitionName = policySetDefinitionName;
            return this;
        }

        public Builder setPolicySetDefinitionName(@Nullable String policySetDefinitionName) {
            this.policySetDefinitionName = Input.ofNullable(policySetDefinitionName);
            return this;
        }

        public Builder setPolicyType(@Nullable Input<Either<String,PolicyType>> policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder setPolicyType(@Nullable Either<String,PolicyType> policyType) {
            this.policyType = Input.ofNullable(policyType);
            return this;
        }

        public PolicySetDefinitionAtManagementGroupArgs build() {
            return new PolicySetDefinitionAtManagementGroupArgs(description, displayName, managementGroupId, metadata, parameters, policyDefinitionGroups, policyDefinitions, policySetDefinitionName, policyType);
        }
    }
}
