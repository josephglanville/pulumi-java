// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.FlowAccessControlConfigurationResponse;
import io.pulumi.azurenative.logic.outputs.FlowEndpointsConfigurationResponse;
import io.pulumi.azurenative.logic.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.logic.outputs.SkuResponse;
import io.pulumi.azurenative.logic.outputs.WorkflowParameterResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkflowResult {
    /**
     * The access control configuration.
     * 
     */
    private final @Nullable FlowAccessControlConfigurationResponse accessControl;
    /**
     * Gets the access endpoint.
     * 
     */
    private final String accessEndpoint;
    /**
     * Gets the changed time.
     * 
     */
    private final String changedTime;
    /**
     * Gets the created time.
     * 
     */
    private final String createdTime;
    /**
     * The definition.
     * 
     */
    private final @Nullable Object definition;
    /**
     * The endpoints configuration.
     * 
     */
    private final @Nullable FlowEndpointsConfigurationResponse endpointsConfiguration;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * Managed service identity properties.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * The integration account.
     * 
     */
    private final @Nullable ResourceReferenceResponse integrationAccount;
    /**
     * The integration service environment.
     * 
     */
    private final @Nullable ResourceReferenceResponse integrationServiceEnvironment;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The parameters.
     * 
     */
    private final @Nullable Map<String,WorkflowParameterResponse> parameters;
    /**
     * Gets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The sku.
     * 
     */
    private final SkuResponse sku;
    /**
     * The state.
     * 
     */
    private final @Nullable String state;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;
    /**
     * Gets the version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetWorkflowResult(
        @CustomType.Parameter("accessControl") @Nullable FlowAccessControlConfigurationResponse accessControl,
        @CustomType.Parameter("accessEndpoint") String accessEndpoint,
        @CustomType.Parameter("changedTime") String changedTime,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("definition") @Nullable Object definition,
        @CustomType.Parameter("endpointsConfiguration") @Nullable FlowEndpointsConfigurationResponse endpointsConfiguration,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedServiceIdentityResponse identity,
        @CustomType.Parameter("integrationAccount") @Nullable ResourceReferenceResponse integrationAccount,
        @CustomType.Parameter("integrationServiceEnvironment") @Nullable ResourceReferenceResponse integrationServiceEnvironment,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,WorkflowParameterResponse> parameters,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.accessControl = accessControl;
        this.accessEndpoint = accessEndpoint;
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.definition = definition;
        this.endpointsConfiguration = endpointsConfiguration;
        this.id = id;
        this.identity = identity;
        this.integrationAccount = integrationAccount;
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        this.location = location;
        this.name = name;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.state = state;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    /**
     * The access control configuration.
     * 
    */
    public Optional<FlowAccessControlConfigurationResponse> getAccessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    /**
     * Gets the access endpoint.
     * 
    */
    public String getAccessEndpoint() {
        return this.accessEndpoint;
    }
    /**
     * Gets the changed time.
     * 
    */
    public String getChangedTime() {
        return this.changedTime;
    }
    /**
     * Gets the created time.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The definition.
     * 
    */
    public Optional<Object> getDefinition() {
        return Optional.ofNullable(this.definition);
    }
    /**
     * The endpoints configuration.
     * 
    */
    public Optional<FlowEndpointsConfigurationResponse> getEndpointsConfiguration() {
        return Optional.ofNullable(this.endpointsConfiguration);
    }
    /**
     * The resource id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Managed service identity properties.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The integration account.
     * 
    */
    public Optional<ResourceReferenceResponse> getIntegrationAccount() {
        return Optional.ofNullable(this.integrationAccount);
    }
    /**
     * The integration service environment.
     * 
    */
    public Optional<ResourceReferenceResponse> getIntegrationServiceEnvironment() {
        return Optional.ofNullable(this.integrationServiceEnvironment);
    }
    /**
     * The resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets the resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parameters.
     * 
    */
    public Map<String,WorkflowParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Gets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * The state.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets the version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAccessControlConfigurationResponse accessControl;
        private String accessEndpoint;
        private String changedTime;
        private String createdTime;
        private @Nullable Object definition;
        private @Nullable FlowEndpointsConfigurationResponse endpointsConfiguration;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable ResourceReferenceResponse integrationAccount;
        private @Nullable ResourceReferenceResponse integrationServiceEnvironment;
        private @Nullable String location;
        private String name;
        private @Nullable Map<String,WorkflowParameterResponse> parameters;
        private String provisioningState;
        private SkuResponse sku;
        private @Nullable String state;
        private @Nullable Map<String,String> tags;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.accessEndpoint = defaults.accessEndpoint;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.definition = defaults.definition;
    	      this.endpointsConfiguration = defaults.endpointsConfiguration;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.integrationAccount = defaults.integrationAccount;
    	      this.integrationServiceEnvironment = defaults.integrationServiceEnvironment;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder accessControl(@Nullable FlowAccessControlConfigurationResponse accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Builder accessEndpoint(String accessEndpoint) {
            this.accessEndpoint = Objects.requireNonNull(accessEndpoint);
            return this;
        }
        public Builder changedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder definition(@Nullable Object definition) {
            this.definition = definition;
            return this;
        }
        public Builder endpointsConfiguration(@Nullable FlowEndpointsConfigurationResponse endpointsConfiguration) {
            this.endpointsConfiguration = endpointsConfiguration;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder integrationAccount(@Nullable ResourceReferenceResponse integrationAccount) {
            this.integrationAccount = integrationAccount;
            return this;
        }
        public Builder integrationServiceEnvironment(@Nullable ResourceReferenceResponse integrationServiceEnvironment) {
            this.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable Map<String,WorkflowParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetWorkflowResult build() {
            return new GetWorkflowResult(accessControl, accessEndpoint, changedTime, createdTime, definition, endpointsConfiguration, id, identity, integrationAccount, integrationServiceEnvironment, location, name, parameters, provisioningState, sku, state, tags, type, version);
        }
    }
}
