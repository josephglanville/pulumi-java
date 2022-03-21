// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridconnectivity.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListEndpointCredentialsResult {
    /**
     * Access key for hybrid connection.
     * 
     */
    private final String accessKey;
    /**
     * The expiration of access key in unix time.
     * 
     */
    private final @Nullable Double expiresOn;
    /**
     * Azure Relay hybrid connection name for the resource.
     * 
     */
    private final String hybridConnectionName;
    /**
     * The namespace name.
     * 
     */
    private final String namespaceName;
    /**
     * The suffix domain name of relay namespace.
     * 
     */
    private final String namespaceNameSuffix;

    @CustomType.Constructor
    private ListEndpointCredentialsResult(
        @CustomType.Parameter("accessKey") String accessKey,
        @CustomType.Parameter("expiresOn") @Nullable Double expiresOn,
        @CustomType.Parameter("hybridConnectionName") String hybridConnectionName,
        @CustomType.Parameter("namespaceName") String namespaceName,
        @CustomType.Parameter("namespaceNameSuffix") String namespaceNameSuffix) {
        this.accessKey = accessKey;
        this.expiresOn = expiresOn;
        this.hybridConnectionName = hybridConnectionName;
        this.namespaceName = namespaceName;
        this.namespaceNameSuffix = namespaceNameSuffix;
    }

    /**
     * Access key for hybrid connection.
     * 
    */
    public String getAccessKey() {
        return this.accessKey;
    }
    /**
     * The expiration of access key in unix time.
     * 
    */
    public Optional<Double> getExpiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }
    /**
     * Azure Relay hybrid connection name for the resource.
     * 
    */
    public String getHybridConnectionName() {
        return this.hybridConnectionName;
    }
    /**
     * The namespace name.
     * 
    */
    public String getNamespaceName() {
        return this.namespaceName;
    }
    /**
     * The suffix domain name of relay namespace.
     * 
    */
    public String getNamespaceNameSuffix() {
        return this.namespaceNameSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListEndpointCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey;
        private @Nullable Double expiresOn;
        private String hybridConnectionName;
        private String namespaceName;
        private String namespaceNameSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(ListEndpointCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.expiresOn = defaults.expiresOn;
    	      this.hybridConnectionName = defaults.hybridConnectionName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.namespaceNameSuffix = defaults.namespaceNameSuffix;
        }

        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        public Builder expiresOn(@Nullable Double expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }
        public Builder hybridConnectionName(String hybridConnectionName) {
            this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceNameSuffix(String namespaceNameSuffix) {
            this.namespaceNameSuffix = Objects.requireNonNull(namespaceNameSuffix);
            return this;
        }        public ListEndpointCredentialsResult build() {
            return new ListEndpointCredentialsResult(accessKey, expiresOn, hybridConnectionName, namespaceName, namespaceNameSuffix);
        }
    }
}
