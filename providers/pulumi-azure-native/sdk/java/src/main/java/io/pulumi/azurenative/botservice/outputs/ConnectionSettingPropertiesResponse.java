// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.ConnectionSettingParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionSettingPropertiesResponse {
    private final @Nullable String clientId;
    private final @Nullable String clientSecret;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable List<ConnectionSettingParameterResponse> parameters;
    private final @Nullable String provisioningState;
    private final @Nullable String scopes;
    private final @Nullable String serviceProviderDisplayName;
    private final @Nullable String serviceProviderId;
    private final String settingId;

    @OutputCustomType.Constructor({"clientId","clientSecret","id","name","parameters","provisioningState","scopes","serviceProviderDisplayName","serviceProviderId","settingId"})
    private ConnectionSettingPropertiesResponse(
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
        this.settingId = Objects.requireNonNull(settingId);
    }

    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<ConnectionSettingParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<String> getScopes() {
        return Optional.ofNullable(this.scopes);
    }
    public Optional<String> getServiceProviderDisplayName() {
        return Optional.ofNullable(this.serviceProviderDisplayName);
    }
    public Optional<String> getServiceProviderId() {
        return Optional.ofNullable(this.serviceProviderId);
    }
    public String getSettingId() {
        return this.settingId;
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

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setParameters(@Nullable List<ConnectionSettingParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setScopes(@Nullable String scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setServiceProviderDisplayName(@Nullable String serviceProviderDisplayName) {
            this.serviceProviderDisplayName = serviceProviderDisplayName;
            return this;
        }

        public Builder setServiceProviderId(@Nullable String serviceProviderId) {
            this.serviceProviderId = serviceProviderId;
            return this;
        }

        public Builder setSettingId(String settingId) {
            this.settingId = Objects.requireNonNull(settingId);
            return this;
        }

        public ConnectionSettingPropertiesResponse build() {
            return new ConnectionSettingPropertiesResponse(clientId, clientSecret, id, name, parameters, provisioningState, scopes, serviceProviderDisplayName, serviceProviderId, settingId);
        }
    }
}
