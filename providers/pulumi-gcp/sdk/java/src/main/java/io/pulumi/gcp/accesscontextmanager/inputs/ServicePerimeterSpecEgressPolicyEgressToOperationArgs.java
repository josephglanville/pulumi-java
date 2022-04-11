// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyEgressToOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyEgressToOperationArgs Empty = new ServicePerimeterSpecEgressPolicyEgressToOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    @Import(name="methodSelectors")
      private final @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;

    public Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> getMethodSelectors() {
        return this.methodSelectors == null ? Codegen.empty() : this.methodSelectors;
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
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    public ServicePerimeterSpecEgressPolicyEgressToOperationArgs(
        @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors,
        @Nullable Output<String> serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    private ServicePerimeterSpecEgressPolicyEgressToOperationArgs() {
        this.methodSelectors = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyEgressToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyEgressToOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder methodSelectors(@Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }
        public Builder methodSelectors(@Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs> methodSelectors) {
            this.methodSelectors = Codegen.ofNullable(methodSelectors);
            return this;
        }
        public Builder methodSelectors(ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }        public ServicePerimeterSpecEgressPolicyEgressToOperationArgs build() {
            return new ServicePerimeterSpecEgressPolicyEgressToOperationArgs(methodSelectors, serviceName);
        }
    }
}
