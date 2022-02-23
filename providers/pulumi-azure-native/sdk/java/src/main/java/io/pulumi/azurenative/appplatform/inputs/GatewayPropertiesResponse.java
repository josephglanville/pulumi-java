// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.GatewayApiMetadataPropertiesResponse;
import io.pulumi.azurenative.appplatform.inputs.GatewayCorsPropertiesResponse;
import io.pulumi.azurenative.appplatform.inputs.GatewayInstanceResponse;
import io.pulumi.azurenative.appplatform.inputs.GatewayOperatorPropertiesResponse;
import io.pulumi.azurenative.appplatform.inputs.GatewayResourceRequestsResponse;
import io.pulumi.azurenative.appplatform.inputs.SsoPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Spring Cloud Gateway properties payload
 * 
 */
public final class GatewayPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GatewayPropertiesResponse Empty = new GatewayPropertiesResponse();

    /**
     * API metadata property for Spring Cloud Gateway
     * 
     */
    @InputImport(name="apiMetadataProperties")
      private final @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties;

    public Optional<GatewayApiMetadataPropertiesResponse> getApiMetadataProperties() {
        return this.apiMetadataProperties == null ? Optional.empty() : Optional.ofNullable(this.apiMetadataProperties);
    }

    /**
     * Cross-Origin Resource Sharing property
     * 
     */
    @InputImport(name="corsProperties")
      private final @Nullable GatewayCorsPropertiesResponse corsProperties;

    public Optional<GatewayCorsPropertiesResponse> getCorsProperties() {
        return this.corsProperties == null ? Optional.empty() : Optional.ofNullable(this.corsProperties);
    }

    /**
     * Indicate if only https is allowed.
     * 
     */
    @InputImport(name="httpsOnly")
      private final @Nullable Boolean httpsOnly;

    public Optional<Boolean> getHttpsOnly() {
        return this.httpsOnly == null ? Optional.empty() : Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Collection of instances belong to Spring Cloud Gateway.
     * 
     */
    @InputImport(name="instances", required=true)
      private final List<GatewayInstanceResponse> instances;

    public List<GatewayInstanceResponse> getInstances() {
        return this.instances;
    }

    /**
     * Properties of the Spring Cloud Gateway Operator.
     * 
     */
    @InputImport(name="operatorProperties", required=true)
      private final GatewayOperatorPropertiesResponse operatorProperties;

    public GatewayOperatorPropertiesResponse getOperatorProperties() {
        return this.operatorProperties;
    }

    /**
     * State of the Spring Cloud Gateway.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    @InputImport(name="public")
      private final @Nullable Boolean $public;

    public Optional<Boolean> get$public() {
        return this.$public == null ? Optional.empty() : Optional.ofNullable(this.$public);
    }

    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    @InputImport(name="resourceRequests")
      private final @Nullable GatewayResourceRequestsResponse resourceRequests;

    public Optional<GatewayResourceRequestsResponse> getResourceRequests() {
        return this.resourceRequests == null ? Optional.empty() : Optional.ofNullable(this.resourceRequests);
    }

    /**
     * Single sign-on related configuration
     * 
     */
    @InputImport(name="ssoProperties")
      private final @Nullable SsoPropertiesResponse ssoProperties;

    public Optional<SsoPropertiesResponse> getSsoProperties() {
        return this.ssoProperties == null ? Optional.empty() : Optional.ofNullable(this.ssoProperties);
    }

    /**
     * URL of the Spring Cloud Gateway, exposed when 'public' is true.
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public GatewayPropertiesResponse(
        @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties,
        @Nullable GatewayCorsPropertiesResponse corsProperties,
        @Nullable Boolean httpsOnly,
        List<GatewayInstanceResponse> instances,
        GatewayOperatorPropertiesResponse operatorProperties,
        String provisioningState,
        @Nullable Boolean $public,
        @Nullable GatewayResourceRequestsResponse resourceRequests,
        @Nullable SsoPropertiesResponse ssoProperties,
        String url) {
        this.apiMetadataProperties = apiMetadataProperties;
        this.corsProperties = corsProperties;
        this.httpsOnly = httpsOnly;
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.operatorProperties = Objects.requireNonNull(operatorProperties, "expected parameter 'operatorProperties' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.$public = $public;
        this.resourceRequests = resourceRequests;
        this.ssoProperties = ssoProperties;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GatewayPropertiesResponse() {
        this.apiMetadataProperties = null;
        this.corsProperties = null;
        this.httpsOnly = null;
        this.instances = List.of();
        this.operatorProperties = null;
        this.provisioningState = null;
        this.$public = null;
        this.resourceRequests = null;
        this.ssoProperties = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties;
        private @Nullable GatewayCorsPropertiesResponse corsProperties;
        private @Nullable Boolean httpsOnly;
        private List<GatewayInstanceResponse> instances;
        private GatewayOperatorPropertiesResponse operatorProperties;
        private String provisioningState;
        private @Nullable Boolean $public;
        private @Nullable GatewayResourceRequestsResponse resourceRequests;
        private @Nullable SsoPropertiesResponse ssoProperties;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiMetadataProperties = defaults.apiMetadataProperties;
    	      this.corsProperties = defaults.corsProperties;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.instances = defaults.instances;
    	      this.operatorProperties = defaults.operatorProperties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.$public = defaults.$public;
    	      this.resourceRequests = defaults.resourceRequests;
    	      this.ssoProperties = defaults.ssoProperties;
    	      this.url = defaults.url;
        }

        public Builder setApiMetadataProperties(@Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties) {
            this.apiMetadataProperties = apiMetadataProperties;
            return this;
        }

        public Builder setCorsProperties(@Nullable GatewayCorsPropertiesResponse corsProperties) {
            this.corsProperties = corsProperties;
            return this;
        }

        public Builder setHttpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }

        public Builder setInstances(List<GatewayInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setOperatorProperties(GatewayOperatorPropertiesResponse operatorProperties) {
            this.operatorProperties = Objects.requireNonNull(operatorProperties);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder set$public(@Nullable Boolean $public) {
            this.$public = $public;
            return this;
        }

        public Builder setResourceRequests(@Nullable GatewayResourceRequestsResponse resourceRequests) {
            this.resourceRequests = resourceRequests;
            return this;
        }

        public Builder setSsoProperties(@Nullable SsoPropertiesResponse ssoProperties) {
            this.ssoProperties = ssoProperties;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GatewayPropertiesResponse build() {
            return new GatewayPropertiesResponse(apiMetadataProperties, corsProperties, httpsOnly, instances, operatorProperties, provisioningState, $public, resourceRequests, ssoProperties, url);
        }
    }
}
