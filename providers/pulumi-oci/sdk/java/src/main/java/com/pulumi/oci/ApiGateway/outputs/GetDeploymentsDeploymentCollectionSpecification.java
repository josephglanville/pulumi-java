// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRequestPolicy;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRoute;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentsDeploymentCollectionSpecification {
    /**
     * @return Policies controlling the pushing of logs to Oracle Cloud Infrastructure Public Logging.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy> loggingPolicies;
    /**
     * @return Behavior applied to any requests received by the API on this route.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicy> requestPolicies;
    /**
     * @return A list of routes that this API exposes.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionSpecificationRoute> routes;

    @CustomType.Constructor
    private GetDeploymentsDeploymentCollectionSpecification(
        @CustomType.Parameter("loggingPolicies") List<GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy> loggingPolicies,
        @CustomType.Parameter("requestPolicies") List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicy> requestPolicies,
        @CustomType.Parameter("routes") List<GetDeploymentsDeploymentCollectionSpecificationRoute> routes) {
        this.loggingPolicies = loggingPolicies;
        this.requestPolicies = requestPolicies;
        this.routes = routes;
    }

    /**
     * @return Policies controlling the pushing of logs to Oracle Cloud Infrastructure Public Logging.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy> loggingPolicies() {
        return this.loggingPolicies;
    }
    /**
     * @return Behavior applied to any requests received by the API on this route.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicy> requestPolicies() {
        return this.requestPolicies;
    }
    /**
     * @return A list of routes that this API exposes.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionSpecificationRoute> routes() {
        return this.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsDeploymentCollectionSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy> loggingPolicies;
        private List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicy> requestPolicies;
        private List<GetDeploymentsDeploymentCollectionSpecificationRoute> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentsDeploymentCollectionSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingPolicies = defaults.loggingPolicies;
    	      this.requestPolicies = defaults.requestPolicies;
    	      this.routes = defaults.routes;
        }

        public Builder loggingPolicies(List<GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy> loggingPolicies) {
            this.loggingPolicies = Objects.requireNonNull(loggingPolicies);
            return this;
        }
        public Builder loggingPolicies(GetDeploymentsDeploymentCollectionSpecificationLoggingPolicy... loggingPolicies) {
            return loggingPolicies(List.of(loggingPolicies));
        }
        public Builder requestPolicies(List<GetDeploymentsDeploymentCollectionSpecificationRequestPolicy> requestPolicies) {
            this.requestPolicies = Objects.requireNonNull(requestPolicies);
            return this;
        }
        public Builder requestPolicies(GetDeploymentsDeploymentCollectionSpecificationRequestPolicy... requestPolicies) {
            return requestPolicies(List.of(requestPolicies));
        }
        public Builder routes(List<GetDeploymentsDeploymentCollectionSpecificationRoute> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(GetDeploymentsDeploymentCollectionSpecificationRoute... routes) {
            return routes(List.of(routes));
        }        public GetDeploymentsDeploymentCollectionSpecification build() {
            return new GetDeploymentsDeploymentCollectionSpecification(loggingPolicies, requestPolicies, routes);
        }
    }
}
