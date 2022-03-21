// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.BackendProtocol;
import io.pulumi.azurenative.apimanagement.inputs.BackendCredentialsContractArgs;
import io.pulumi.azurenative.apimanagement.inputs.BackendPropertiesArgs;
import io.pulumi.azurenative.apimanagement.inputs.BackendProxyContractArgs;
import io.pulumi.azurenative.apimanagement.inputs.BackendTlsPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="backendId")
      private final @Nullable Output<String> backendId;

    public Output<String> getBackendId() {
        return this.backendId == null ? Output.empty() : this.backendId;
    }

    /**
     * Backend Credentials Contract Properties
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<BackendCredentialsContractArgs> credentials;

    public Output<BackendCredentialsContractArgs> getCredentials() {
        return this.credentials == null ? Output.empty() : this.credentials;
    }

    /**
     * Backend Description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Backend Properties contract
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<BackendPropertiesArgs> properties;

    public Output<BackendPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Backend communication protocol.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<Either<String,BackendProtocol>> protocol;

    public Output<Either<String,BackendProtocol>> getProtocol() {
        return this.protocol;
    }

    /**
     * Backend Proxy Contract Properties
     * 
     */
    @Import(name="proxy")
      private final @Nullable Output<BackendProxyContractArgs> proxy;

    public Output<BackendProxyContractArgs> getProxy() {
        return this.proxy == null ? Output.empty() : this.proxy;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Management Uri of the Resource in External System. This url can be the Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Backend Title.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    /**
     * Backend TLS Properties
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<BackendTlsPropertiesArgs> tls;

    public Output<BackendTlsPropertiesArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    /**
     * Runtime Url of the Backend.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public BackendArgs(
        @Nullable Output<String> backendId,
        @Nullable Output<BackendCredentialsContractArgs> credentials,
        @Nullable Output<String> description,
        @Nullable Output<BackendPropertiesArgs> properties,
        Output<Either<String,BackendProtocol>> protocol,
        @Nullable Output<BackendProxyContractArgs> proxy,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceId,
        Output<String> serviceName,
        @Nullable Output<String> title,
        @Nullable Output<BackendTlsPropertiesArgs> tls,
        Output<String> url) {
        this.backendId = backendId;
        this.credentials = credentials;
        this.description = description;
        this.properties = properties;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.proxy = proxy;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.title = title;
        this.tls = tls;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private BackendArgs() {
        this.backendId = Output.empty();
        this.credentials = Output.empty();
        this.description = Output.empty();
        this.properties = Output.empty();
        this.protocol = Output.empty();
        this.proxy = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceId = Output.empty();
        this.serviceName = Output.empty();
        this.title = Output.empty();
        this.tls = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backendId;
        private @Nullable Output<BackendCredentialsContractArgs> credentials;
        private @Nullable Output<String> description;
        private @Nullable Output<BackendPropertiesArgs> properties;
        private Output<Either<String,BackendProtocol>> protocol;
        private @Nullable Output<BackendProxyContractArgs> proxy;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceId;
        private Output<String> serviceName;
        private @Nullable Output<String> title;
        private @Nullable Output<BackendTlsPropertiesArgs> tls;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendId = defaults.backendId;
    	      this.credentials = defaults.credentials;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.protocol = defaults.protocol;
    	      this.proxy = defaults.proxy;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.serviceName = defaults.serviceName;
    	      this.title = defaults.title;
    	      this.tls = defaults.tls;
    	      this.url = defaults.url;
        }

        public Builder backendId(@Nullable Output<String> backendId) {
            this.backendId = backendId;
            return this;
        }
        public Builder backendId(@Nullable String backendId) {
            this.backendId = Output.ofNullable(backendId);
            return this;
        }
        public Builder credentials(@Nullable Output<BackendCredentialsContractArgs> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable BackendCredentialsContractArgs credentials) {
            this.credentials = Output.ofNullable(credentials);
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
        public Builder properties(@Nullable Output<BackendPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable BackendPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder protocol(Output<Either<String,BackendProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(Either<String,BackendProtocol> protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public Builder proxy(@Nullable Output<BackendProxyContractArgs> proxy) {
            this.proxy = proxy;
            return this;
        }
        public Builder proxy(@Nullable BackendProxyContractArgs proxy) {
            this.proxy = Output.ofNullable(proxy);
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
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public Builder tls(@Nullable Output<BackendTlsPropertiesArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable BackendTlsPropertiesArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public BackendArgs build() {
            return new BackendArgs(backendId, credentials, description, properties, protocol, proxy, resourceGroupName, resourceId, serviceName, title, tls, url);
        }
    }
}
