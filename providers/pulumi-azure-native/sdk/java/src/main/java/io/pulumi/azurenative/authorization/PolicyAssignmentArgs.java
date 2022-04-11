// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.EnforcementMode;
import io.pulumi.azurenative.authorization.inputs.IdentityArgs;
import io.pulumi.azurenative.authorization.inputs.NonComplianceMessageArgs;
import io.pulumi.azurenative.authorization.inputs.ParameterValuesValueArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAssignmentArgs Empty = new PolicyAssignmentArgs();

    /**
     * This message will be part of response in case of policy violation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the policy assignment.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
     * 
     */
    @Import(name="enforcementMode")
      private final @Nullable Output<Either<String,EnforcementMode>> enforcementMode;

    public Output<Either<String,EnforcementMode>> getEnforcementMode() {
        return this.enforcementMode == null ? Codegen.empty() : this.enforcementMode;
    }

    /**
     * The managed identity associated with the policy assignment.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<IdentityArgs> identity;

    public Output<IdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The location of the policy assignment. Only required when utilizing managed identity.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The messages that describe why a resource is non-compliant with the policy.
     * 
     */
    @Import(name="nonComplianceMessages")
      private final @Nullable Output<List<NonComplianceMessageArgs>> nonComplianceMessages;

    public Output<List<NonComplianceMessageArgs>> getNonComplianceMessages() {
        return this.nonComplianceMessages == null ? Codegen.empty() : this.nonComplianceMessages;
    }

    /**
     * The policy's excluded scopes.
     * 
     */
    @Import(name="notScopes")
      private final @Nullable Output<List<String>> notScopes;

    public Output<List<String>> getNotScopes() {
        return this.notScopes == null ? Codegen.empty() : this.notScopes;
    }

    /**
     * The parameter values for the assigned policy rule. The keys are the parameter names.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterValuesValueArgs>> parameters;

    public Output<Map<String,ParameterValuesValueArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The name of the policy assignment.
     * 
     */
    @Import(name="policyAssignmentName")
      private final @Nullable Output<String> policyAssignmentName;

    public Output<String> getPolicyAssignmentName() {
        return this.policyAssignmentName == null ? Codegen.empty() : this.policyAssignmentName;
    }

    /**
     * The ID of the policy definition or policy set definition being assigned.
     * 
     */
    @Import(name="policyDefinitionId")
      private final @Nullable Output<String> policyDefinitionId;

    public Output<String> getPolicyDefinitionId() {
        return this.policyDefinitionId == null ? Codegen.empty() : this.policyDefinitionId;
    }

    /**
     * The scope of the policy assignment. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    public PolicyAssignmentArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Either<String,EnforcementMode>> enforcementMode,
        @Nullable Output<IdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<Object> metadata,
        @Nullable Output<List<NonComplianceMessageArgs>> nonComplianceMessages,
        @Nullable Output<List<String>> notScopes,
        @Nullable Output<Map<String,ParameterValuesValueArgs>> parameters,
        @Nullable Output<String> policyAssignmentName,
        @Nullable Output<String> policyDefinitionId,
        Output<String> scope) {
        this.description = description;
        this.displayName = displayName;
        this.enforcementMode = enforcementMode == null ? Output.ofLeft("Default") : enforcementMode;
        this.identity = identity;
        this.location = location;
        this.metadata = metadata;
        this.nonComplianceMessages = nonComplianceMessages;
        this.notScopes = notScopes;
        this.parameters = parameters;
        this.policyAssignmentName = policyAssignmentName;
        this.policyDefinitionId = policyDefinitionId;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private PolicyAssignmentArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.enforcementMode = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.nonComplianceMessages = Codegen.empty();
        this.notScopes = Codegen.empty();
        this.parameters = Codegen.empty();
        this.policyAssignmentName = Codegen.empty();
        this.policyDefinitionId = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Either<String,EnforcementMode>> enforcementMode;
        private @Nullable Output<IdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<Object> metadata;
        private @Nullable Output<List<NonComplianceMessageArgs>> nonComplianceMessages;
        private @Nullable Output<List<String>> notScopes;
        private @Nullable Output<Map<String,ParameterValuesValueArgs>> parameters;
        private @Nullable Output<String> policyAssignmentName;
        private @Nullable Output<String> policyDefinitionId;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enforcementMode = defaults.enforcementMode;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.nonComplianceMessages = defaults.nonComplianceMessages;
    	      this.notScopes = defaults.notScopes;
    	      this.parameters = defaults.parameters;
    	      this.policyAssignmentName = defaults.policyAssignmentName;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.scope = defaults.scope;
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
        public Builder enforcementMode(@Nullable Output<Either<String,EnforcementMode>> enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public Builder enforcementMode(@Nullable Either<String,EnforcementMode> enforcementMode) {
            this.enforcementMode = Codegen.ofNullable(enforcementMode);
            return this;
        }
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder nonComplianceMessages(@Nullable Output<List<NonComplianceMessageArgs>> nonComplianceMessages) {
            this.nonComplianceMessages = nonComplianceMessages;
            return this;
        }
        public Builder nonComplianceMessages(@Nullable List<NonComplianceMessageArgs> nonComplianceMessages) {
            this.nonComplianceMessages = Codegen.ofNullable(nonComplianceMessages);
            return this;
        }
        public Builder nonComplianceMessages(NonComplianceMessageArgs... nonComplianceMessages) {
            return nonComplianceMessages(List.of(nonComplianceMessages));
        }
        public Builder notScopes(@Nullable Output<List<String>> notScopes) {
            this.notScopes = notScopes;
            return this;
        }
        public Builder notScopes(@Nullable List<String> notScopes) {
            this.notScopes = Codegen.ofNullable(notScopes);
            return this;
        }
        public Builder notScopes(String... notScopes) {
            return notScopes(List.of(notScopes));
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterValuesValueArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterValuesValueArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder policyAssignmentName(@Nullable Output<String> policyAssignmentName) {
            this.policyAssignmentName = policyAssignmentName;
            return this;
        }
        public Builder policyAssignmentName(@Nullable String policyAssignmentName) {
            this.policyAssignmentName = Codegen.ofNullable(policyAssignmentName);
            return this;
        }
        public Builder policyDefinitionId(@Nullable Output<String> policyDefinitionId) {
            this.policyDefinitionId = policyDefinitionId;
            return this;
        }
        public Builder policyDefinitionId(@Nullable String policyDefinitionId) {
            this.policyDefinitionId = Codegen.ofNullable(policyDefinitionId);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public PolicyAssignmentArgs build() {
            return new PolicyAssignmentArgs(description, displayName, enforcementMode, identity, location, metadata, nonComplianceMessages, notScopes, parameters, policyAssignmentName, policyDefinitionId, scope);
        }
    }
}
