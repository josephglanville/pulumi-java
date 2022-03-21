// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.enums.WorkflowState;
import io.pulumi.azurenative.logic.inputs.FlowAccessControlConfigurationArgs;
import io.pulumi.azurenative.logic.inputs.FlowEndpointsConfigurationArgs;
import io.pulumi.azurenative.logic.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.azurenative.logic.inputs.WorkflowParameterArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * The access control configuration.
     * 
     */
    @Import(name="accessControl")
      private final @Nullable Output<FlowAccessControlConfigurationArgs> accessControl;

    public Output<FlowAccessControlConfigurationArgs> getAccessControl() {
        return this.accessControl == null ? Output.empty() : this.accessControl;
    }

    /**
     * The definition.
     * 
     */
    @Import(name="definition")
      private final @Nullable Output<Object> definition;

    public Output<Object> getDefinition() {
        return this.definition == null ? Output.empty() : this.definition;
    }

    /**
     * The endpoints configuration.
     * 
     */
    @Import(name="endpointsConfiguration")
      private final @Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration;

    public Output<FlowEndpointsConfigurationArgs> getEndpointsConfiguration() {
        return this.endpointsConfiguration == null ? Output.empty() : this.endpointsConfiguration;
    }

    /**
     * Managed service identity properties.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * The integration account.
     * 
     */
    @Import(name="integrationAccount")
      private final @Nullable Output<ResourceReferenceArgs> integrationAccount;

    public Output<ResourceReferenceArgs> getIntegrationAccount() {
        return this.integrationAccount == null ? Output.empty() : this.integrationAccount;
    }

    /**
     * The integration service environment.
     * 
     */
    @Import(name="integrationServiceEnvironment")
      private final @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;

    public Output<ResourceReferenceArgs> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment == null ? Output.empty() : this.integrationServiceEnvironment;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The parameters.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,WorkflowParameterArgs>> parameters;

    public Output<Map<String,WorkflowParameterArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,WorkflowState>> state;

    public Output<Either<String,WorkflowState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName")
      private final @Nullable Output<String> workflowName;

    public Output<String> getWorkflowName() {
        return this.workflowName == null ? Output.empty() : this.workflowName;
    }

    public WorkflowArgs(
        @Nullable Output<FlowAccessControlConfigurationArgs> accessControl,
        @Nullable Output<Object> definition,
        @Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<ResourceReferenceArgs> integrationAccount,
        @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,WorkflowParameterArgs>> parameters,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,WorkflowState>> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> workflowName) {
        this.accessControl = accessControl;
        this.definition = definition;
        this.endpointsConfiguration = endpointsConfiguration;
        this.identity = identity;
        this.integrationAccount = integrationAccount;
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        this.location = location;
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.state = state;
        this.tags = tags;
        this.workflowName = workflowName;
    }

    private WorkflowArgs() {
        this.accessControl = Output.empty();
        this.definition = Output.empty();
        this.endpointsConfiguration = Output.empty();
        this.identity = Output.empty();
        this.integrationAccount = Output.empty();
        this.integrationServiceEnvironment = Output.empty();
        this.location = Output.empty();
        this.parameters = Output.empty();
        this.resourceGroupName = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.workflowName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowAccessControlConfigurationArgs> accessControl;
        private @Nullable Output<Object> definition;
        private @Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<ResourceReferenceArgs> integrationAccount;
        private @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,WorkflowParameterArgs>> parameters;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,WorkflowState>> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.definition = defaults.definition;
    	      this.endpointsConfiguration = defaults.endpointsConfiguration;
    	      this.identity = defaults.identity;
    	      this.integrationAccount = defaults.integrationAccount;
    	      this.integrationServiceEnvironment = defaults.integrationServiceEnvironment;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder accessControl(@Nullable Output<FlowAccessControlConfigurationArgs> accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Builder accessControl(@Nullable FlowAccessControlConfigurationArgs accessControl) {
            this.accessControl = Output.ofNullable(accessControl);
            return this;
        }
        public Builder definition(@Nullable Output<Object> definition) {
            this.definition = definition;
            return this;
        }
        public Builder definition(@Nullable Object definition) {
            this.definition = Output.ofNullable(definition);
            return this;
        }
        public Builder endpointsConfiguration(@Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration) {
            this.endpointsConfiguration = endpointsConfiguration;
            return this;
        }
        public Builder endpointsConfiguration(@Nullable FlowEndpointsConfigurationArgs endpointsConfiguration) {
            this.endpointsConfiguration = Output.ofNullable(endpointsConfiguration);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }
        public Builder integrationAccount(@Nullable Output<ResourceReferenceArgs> integrationAccount) {
            this.integrationAccount = integrationAccount;
            return this;
        }
        public Builder integrationAccount(@Nullable ResourceReferenceArgs integrationAccount) {
            this.integrationAccount = Output.ofNullable(integrationAccount);
            return this;
        }
        public Builder integrationServiceEnvironment(@Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment) {
            this.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }
        public Builder integrationServiceEnvironment(@Nullable ResourceReferenceArgs integrationServiceEnvironment) {
            this.integrationServiceEnvironment = Output.ofNullable(integrationServiceEnvironment);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,WorkflowParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,WorkflowParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder state(@Nullable Output<Either<String,WorkflowState>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,WorkflowState> state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder workflowName(@Nullable Output<String> workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public Builder workflowName(@Nullable String workflowName) {
            this.workflowName = Output.ofNullable(workflowName);
            return this;
        }        public WorkflowArgs build() {
            return new WorkflowArgs(accessControl, definition, endpointsConfiguration, identity, integrationAccount, integrationServiceEnvironment, location, parameters, resourceGroupName, state, tags, workflowName);
        }
    }
}
