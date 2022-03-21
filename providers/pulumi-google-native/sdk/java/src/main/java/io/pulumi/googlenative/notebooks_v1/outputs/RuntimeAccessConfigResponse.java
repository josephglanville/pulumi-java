// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuntimeAccessConfigResponse {
    /**
     * The type of access mode this instance.
     * 
     */
    private final String accessType;
    /**
     * The proxy endpoint that is used to access the runtime.
     * 
     */
    private final String proxyUri;
    /**
     * The owner of this runtime after creation. Format: `alias@example.com` Currently supports one owner only.
     * 
     */
    private final String runtimeOwner;

    @CustomType.Constructor
    private RuntimeAccessConfigResponse(
        @CustomType.Parameter("accessType") String accessType,
        @CustomType.Parameter("proxyUri") String proxyUri,
        @CustomType.Parameter("runtimeOwner") String runtimeOwner) {
        this.accessType = accessType;
        this.proxyUri = proxyUri;
        this.runtimeOwner = runtimeOwner;
    }

    /**
     * The type of access mode this instance.
     * 
    */
    public String getAccessType() {
        return this.accessType;
    }
    /**
     * The proxy endpoint that is used to access the runtime.
     * 
    */
    public String getProxyUri() {
        return this.proxyUri;
    }
    /**
     * The owner of this runtime after creation. Format: `alias@example.com` Currently supports one owner only.
     * 
    */
    public String getRuntimeOwner() {
        return this.runtimeOwner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeAccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String proxyUri;
        private String runtimeOwner;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeAccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.proxyUri = defaults.proxyUri;
    	      this.runtimeOwner = defaults.runtimeOwner;
        }

        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        public Builder proxyUri(String proxyUri) {
            this.proxyUri = Objects.requireNonNull(proxyUri);
            return this;
        }
        public Builder runtimeOwner(String runtimeOwner) {
            this.runtimeOwner = Objects.requireNonNull(runtimeOwner);
            return this;
        }        public RuntimeAccessConfigResponse build() {
            return new RuntimeAccessConfigResponse(accessType, proxyUri, runtimeOwner);
        }
    }
}
