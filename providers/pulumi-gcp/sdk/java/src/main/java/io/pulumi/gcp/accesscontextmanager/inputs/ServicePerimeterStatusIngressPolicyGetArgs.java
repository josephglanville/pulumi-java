// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyGetArgs Empty = new ServicePerimeterStatusIngressPolicyGetArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressFrom")
      private final @Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;

    public Output<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> getIngressFrom() {
        return this.ingressFrom == null ? Output.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressTo")
      private final @Nullable Output<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

    public Output<ServicePerimeterStatusIngressPolicyIngressToGetArgs> getIngressTo() {
        return this.ingressTo == null ? Output.empty() : this.ingressTo;
    }

    public ServicePerimeterStatusIngressPolicyGetArgs(
        @Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom,
        @Nullable Output<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimeterStatusIngressPolicyGetArgs() {
        this.ingressFrom = Output.empty();
        this.ingressTo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;
        private @Nullable Output<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }
        public Builder ingressFrom(@Nullable ServicePerimeterStatusIngressPolicyIngressFromGetArgs ingressFrom) {
            this.ingressFrom = Output.ofNullable(ingressFrom);
            return this;
        }
        public Builder ingressTo(@Nullable Output<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }
        public Builder ingressTo(@Nullable ServicePerimeterStatusIngressPolicyIngressToGetArgs ingressTo) {
            this.ingressTo = Output.ofNullable(ingressTo);
            return this;
        }        public ServicePerimeterStatusIngressPolicyGetArgs build() {
            return new ServicePerimeterStatusIngressPolicyGetArgs(ingressFrom, ingressTo);
        }
    }
}
