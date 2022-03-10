// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouteRequestParameter {
    /**
     * Request parameter key. This is a [request data mapping parameter](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-data-mapping.html#websocket-mapping-request-parameters).
     * 
     */
    private final String requestParameterKey;
    /**
     * Boolean whether or not the parameter is required.
     * 
     */
    private final Boolean required;

    @OutputCustomType.Constructor
    private RouteRequestParameter(
        @OutputCustomType.Parameter("requestParameterKey") String requestParameterKey,
        @OutputCustomType.Parameter("required") Boolean required) {
        this.requestParameterKey = requestParameterKey;
        this.required = required;
    }

    /**
     * Request parameter key. This is a [request data mapping parameter](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-data-mapping.html#websocket-mapping-request-parameters).
     * 
    */
    public String getRequestParameterKey() {
        return this.requestParameterKey;
    }
    /**
     * Boolean whether or not the parameter is required.
     * 
    */
    public Boolean getRequired() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteRequestParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String requestParameterKey;
        private Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteRequestParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestParameterKey = defaults.requestParameterKey;
    	      this.required = defaults.required;
        }

        public Builder setRequestParameterKey(String requestParameterKey) {
            this.requestParameterKey = Objects.requireNonNull(requestParameterKey);
            return this;
        }

        public Builder setRequired(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }
        public RouteRequestParameter build() {
            return new RouteRequestParameter(requestParameterKey, required);
        }
    }
}
