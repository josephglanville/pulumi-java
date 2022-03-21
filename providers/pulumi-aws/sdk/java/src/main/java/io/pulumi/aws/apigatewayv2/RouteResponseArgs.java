// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteResponseArgs Empty = new RouteResponseArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    @Import(name="modelSelectionExpression")
      private final @Nullable Output<String> modelSelectionExpression;

    public Output<String> getModelSelectionExpression() {
        return this.modelSelectionExpression == null ? Output.empty() : this.modelSelectionExpression;
    }

    /**
     * The response models for the route response.
     * 
     */
    @Import(name="responseModels")
      private final @Nullable Output<Map<String,String>> responseModels;

    public Output<Map<String,String>> getResponseModels() {
        return this.responseModels == null ? Output.empty() : this.responseModels;
    }

    /**
     * The identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    @Import(name="routeId", required=true)
      private final Output<String> routeId;

    public Output<String> getRouteId() {
        return this.routeId;
    }

    /**
     * The route response key.
     * 
     */
    @Import(name="routeResponseKey", required=true)
      private final Output<String> routeResponseKey;

    public Output<String> getRouteResponseKey() {
        return this.routeResponseKey;
    }

    public RouteResponseArgs(
        Output<String> apiId,
        @Nullable Output<String> modelSelectionExpression,
        @Nullable Output<Map<String,String>> responseModels,
        Output<String> routeId,
        Output<String> routeResponseKey) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.modelSelectionExpression = modelSelectionExpression;
        this.responseModels = responseModels;
        this.routeId = Objects.requireNonNull(routeId, "expected parameter 'routeId' to be non-null");
        this.routeResponseKey = Objects.requireNonNull(routeResponseKey, "expected parameter 'routeResponseKey' to be non-null");
    }

    private RouteResponseArgs() {
        this.apiId = Output.empty();
        this.modelSelectionExpression = Output.empty();
        this.responseModels = Output.empty();
        this.routeId = Output.empty();
        this.routeResponseKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<String> modelSelectionExpression;
        private @Nullable Output<Map<String,String>> responseModels;
        private Output<String> routeId;
        private Output<String> routeResponseKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.modelSelectionExpression = defaults.modelSelectionExpression;
    	      this.responseModels = defaults.responseModels;
    	      this.routeId = defaults.routeId;
    	      this.routeResponseKey = defaults.routeResponseKey;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder modelSelectionExpression(@Nullable Output<String> modelSelectionExpression) {
            this.modelSelectionExpression = modelSelectionExpression;
            return this;
        }
        public Builder modelSelectionExpression(@Nullable String modelSelectionExpression) {
            this.modelSelectionExpression = Output.ofNullable(modelSelectionExpression);
            return this;
        }
        public Builder responseModels(@Nullable Output<Map<String,String>> responseModels) {
            this.responseModels = responseModels;
            return this;
        }
        public Builder responseModels(@Nullable Map<String,String> responseModels) {
            this.responseModels = Output.ofNullable(responseModels);
            return this;
        }
        public Builder routeId(Output<String> routeId) {
            this.routeId = Objects.requireNonNull(routeId);
            return this;
        }
        public Builder routeId(String routeId) {
            this.routeId = Output.of(Objects.requireNonNull(routeId));
            return this;
        }
        public Builder routeResponseKey(Output<String> routeResponseKey) {
            this.routeResponseKey = Objects.requireNonNull(routeResponseKey);
            return this;
        }
        public Builder routeResponseKey(String routeResponseKey) {
            this.routeResponseKey = Output.of(Objects.requireNonNull(routeResponseKey));
            return this;
        }        public RouteResponseArgs build() {
            return new RouteResponseArgs(apiId, modelSelectionExpression, responseModels, routeId, routeResponseKey);
        }
    }
}
