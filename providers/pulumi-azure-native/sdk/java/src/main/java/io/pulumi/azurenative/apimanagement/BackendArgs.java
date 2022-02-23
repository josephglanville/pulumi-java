// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.BackendProtocol;
import io.pulumi.azurenative.apimanagement.inputs.BackendCredentialsContractArgs;
import io.pulumi.azurenative.apimanagement.inputs.BackendPropertiesArgs;
import io.pulumi.azurenative.apimanagement.inputs.BackendProxyContractArgs;
import io.pulumi.azurenative.apimanagement.inputs.BackendTlsPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="backendId")
      private final @Nullable Input<String> backendId;

    public Input<String> getBackendId() {
        return this.backendId == null ? Input.empty() : this.backendId;
    }

    /**
     * Backend Credentials Contract Properties
     * 
     */
    @InputImport(name="credentials")
      private final @Nullable Input<BackendCredentialsContractArgs> credentials;

    public Input<BackendCredentialsContractArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * Backend Description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Backend Properties contract
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<BackendPropertiesArgs> properties;

    public Input<BackendPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Backend communication protocol.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Input<Either<String,BackendProtocol>> protocol;

    public Input<Either<String,BackendProtocol>> getProtocol() {
        return this.protocol;
    }

    /**
     * Backend Proxy Contract Properties
     * 
     */
    @InputImport(name="proxy")
      private final @Nullable Input<BackendProxyContractArgs> proxy;

    public Input<BackendProxyContractArgs> getProxy() {
        return this.proxy == null ? Input.empty() : this.proxy;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Management Uri of the Resource in External System. This url can be the Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Backend Title.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    /**
     * Backend TLS Properties
     * 
     */
    @InputImport(name="tls")
      private final @Nullable Input<BackendTlsPropertiesArgs> tls;

    public Input<BackendTlsPropertiesArgs> getTls() {
        return this.tls == null ? Input.empty() : this.tls;
    }

    /**
     * Runtime Url of the Backend.
     * 
     */
    @InputImport(name="url", required=true)
      private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public BackendArgs(
        @Nullable Input<String> backendId,
        @Nullable Input<BackendCredentialsContractArgs> credentials,
        @Nullable Input<String> description,
        @Nullable Input<BackendPropertiesArgs> properties,
        Input<Either<String,BackendProtocol>> protocol,
        @Nullable Input<BackendProxyContractArgs> proxy,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceId,
        Input<String> serviceName,
        @Nullable Input<String> title,
        @Nullable Input<BackendTlsPropertiesArgs> tls,
        Input<String> url) {
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
        this.backendId = Input.empty();
        this.credentials = Input.empty();
        this.description = Input.empty();
        this.properties = Input.empty();
        this.protocol = Input.empty();
        this.proxy = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceId = Input.empty();
        this.serviceName = Input.empty();
        this.title = Input.empty();
        this.tls = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendId;
        private @Nullable Input<BackendCredentialsContractArgs> credentials;
        private @Nullable Input<String> description;
        private @Nullable Input<BackendPropertiesArgs> properties;
        private Input<Either<String,BackendProtocol>> protocol;
        private @Nullable Input<BackendProxyContractArgs> proxy;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceId;
        private Input<String> serviceName;
        private @Nullable Input<String> title;
        private @Nullable Input<BackendTlsPropertiesArgs> tls;
        private Input<String> url;

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

        public Builder setBackendId(@Nullable Input<String> backendId) {
            this.backendId = backendId;
            return this;
        }

        public Builder setBackendId(@Nullable String backendId) {
            this.backendId = Input.ofNullable(backendId);
            return this;
        }

        public Builder setCredentials(@Nullable Input<BackendCredentialsContractArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable BackendCredentialsContractArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
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

        public Builder setProperties(@Nullable Input<BackendPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable BackendPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setProtocol(Input<Either<String,BackendProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(Either<String,BackendProtocol> protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder setProxy(@Nullable Input<BackendProxyContractArgs> proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder setProxy(@Nullable BackendProxyContractArgs proxy) {
            this.proxy = Input.ofNullable(proxy);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public Builder setTls(@Nullable Input<BackendTlsPropertiesArgs> tls) {
            this.tls = tls;
            return this;
        }

        public Builder setTls(@Nullable BackendTlsPropertiesArgs tls) {
            this.tls = Input.ofNullable(tls);
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public BackendArgs build() {
            return new BackendArgs(backendId, credentials, description, properties, protocol, proxy, resourceGroupName, resourceId, serviceName, title, tls, url);
        }
    }
}
