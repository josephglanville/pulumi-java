// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.GatewayDestinationResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.HttpRouteMatchRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HttpRouteConfigResponse {
    private final GatewayDestinationResponse destination;
    private final HttpRouteMatchRuleResponse match;
    private final String name;

    @OutputCustomType.Constructor({"destination","match","name"})
    private HttpRouteConfigResponse(
        GatewayDestinationResponse destination,
        HttpRouteMatchRuleResponse match,
        String name) {
        this.destination = Objects.requireNonNull(destination);
        this.match = Objects.requireNonNull(match);
        this.name = Objects.requireNonNull(name);
    }

    public GatewayDestinationResponse getDestination() {
        return this.destination;
    }
    public HttpRouteMatchRuleResponse getMatch() {
        return this.match;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayDestinationResponse destination;
        private HttpRouteMatchRuleResponse match;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder setDestination(GatewayDestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setMatch(HttpRouteMatchRuleResponse match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public HttpRouteConfigResponse build() {
            return new HttpRouteConfigResponse(destination, match, name);
        }
    }
}
