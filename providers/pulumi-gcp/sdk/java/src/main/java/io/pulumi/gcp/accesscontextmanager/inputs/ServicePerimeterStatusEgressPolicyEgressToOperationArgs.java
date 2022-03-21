// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusEgressPolicyEgressToOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusEgressPolicyEgressToOperationArgs Empty = new ServicePerimeterStatusEgressPolicyEgressToOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    @Import(name="methodSelectors")
      private final @Nullable Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;

    public Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> getMethodSelectors() {
        return this.methodSelectors == null ? Output.empty() : this.methodSelectors;
    }

    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Output.empty() : this.serviceName;
    }

    public ServicePerimeterStatusEgressPolicyEgressToOperationArgs(
        @Nullable Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors,
        @Nullable Output<String> serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    private ServicePerimeterStatusEgressPolicyEgressToOperationArgs() {
        this.methodSelectors = Output.empty();
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusEgressPolicyEgressToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusEgressPolicyEgressToOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder methodSelectors(@Nullable Output<List<ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }
        public Builder methodSelectors(@Nullable List<ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs> methodSelectors) {
            this.methodSelectors = Output.ofNullable(methodSelectors);
            return this;
        }
        public Builder methodSelectors(ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Output.ofNullable(serviceName);
            return this;
        }        public ServicePerimeterStatusEgressPolicyEgressToOperationArgs build() {
            return new ServicePerimeterStatusEgressPolicyEgressToOperationArgs(methodSelectors, serviceName);
        }
    }
}
