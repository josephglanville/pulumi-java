// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.ConnectionSettingParameterResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for a Connection Setting Item
 * 
 */
public final class ConnectionSettingPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionSettingPropertiesResponse Empty = new ConnectionSettingPropertiesResponse();

    /**
     * Client Id associated with the Connection Setting.
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * Client Secret associated with the Connection Setting
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> getClientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     * Id associated with the Connection Setting.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name associated with the Connection Setting.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Service Provider Parameters associated with the Connection Setting
     * 
     */
    @Import(name="parameters")
      private final @Nullable List<ConnectionSettingParameterResponse> parameters;

    public List<ConnectionSettingParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * Scopes associated with the Connection Setting
     * 
     */
    @Import(name="scopes")
      private final @Nullable String scopes;

    public Optional<String> getScopes() {
        return this.scopes == null ? Optional.empty() : Optional.ofNullable(this.scopes);
    }

    /**
     * Service Provider Display Name associated with the Connection Setting
     * 
     */
    @Import(name="serviceProviderDisplayName")
      private final @Nullable String serviceProviderDisplayName;

    public Optional<String> getServiceProviderDisplayName() {
        return this.serviceProviderDisplayName == null ? Optional.empty() : Optional.ofNullable(this.serviceProviderDisplayName);
    }

    /**
     * Service Provider Id associated with the Connection Setting
     * 
     */
    @Import(name="serviceProviderId")
      private final @Nullable String serviceProviderId;

    public Optional<String> getServiceProviderId() {
        return this.serviceProviderId == null ? Optional.empty() : Optional.ofNullable(this.serviceProviderId);
    }

    /**
     * Setting Id set by the service for the Connection Setting.
     * 
     */
    @Import(name="settingId", required=true)
      private final String settingId;

    public String getSettingId() {
        return this.settingId;
    }

    public ConnectionSettingPropertiesResponse(
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable String id,
        @Nullable String name,
        @Nullable List<ConnectionSettingParameterResponse> parameters,
        @Nullable String provisioningState,
        @Nullable String scopes,
        @Nullable String serviceProviderDisplayName,
        @Nullable String serviceProviderId,
        String settingId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.scopes = scopes;
        this.serviceProviderDisplayName = serviceProviderDisplayName;
        this.serviceProviderId = serviceProviderId;
        this.settingId = Objects.requireNonNull(settingId, "expected parameter 'settingId' to be non-null");
    }

    private ConnectionSettingPropertiesResponse() {
        this.clientId = null;
        this.clientSecret = null;
        this.id = null;
        this.name = null;
        this.parameters = List.of();
        this.provisioningState = null;
        this.scopes = null;
        this.serviceProviderDisplayName = null;
        this.serviceProviderId = null;
        this.settingId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSettingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<ConnectionSettingParameterResponse> parameters;
        private @Nullable String provisioningState;
        private @Nullable String scopes;
        private @Nullable String serviceProviderDisplayName;
        private @Nullable String serviceProviderId;
        private String settingId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionSettingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scopes = defaults.scopes;
    	      this.serviceProviderDisplayName = defaults.serviceProviderDisplayName;
    	      this.serviceProviderId = defaults.serviceProviderId;
    	      this.settingId = defaults.settingId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder parameters(@Nullable List<ConnectionSettingParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ConnectionSettingParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder scopes(@Nullable String scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder serviceProviderDisplayName(@Nullable String serviceProviderDisplayName) {
            this.serviceProviderDisplayName = serviceProviderDisplayName;
            return this;
        }
        public Builder serviceProviderId(@Nullable String serviceProviderId) {
            this.serviceProviderId = serviceProviderId;
            return this;
        }
        public Builder settingId(String settingId) {
            this.settingId = Objects.requireNonNull(settingId);
            return this;
        }        public ConnectionSettingPropertiesResponse build() {
            return new ConnectionSettingPropertiesResponse(clientId, clientSecret, id, name, parameters, provisioningState, scopes, serviceProviderDisplayName, serviceProviderId, settingId);
        }
    }
}
