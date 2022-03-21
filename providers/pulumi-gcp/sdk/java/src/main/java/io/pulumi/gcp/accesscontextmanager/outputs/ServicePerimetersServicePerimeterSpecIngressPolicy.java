// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFrom;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterSpecIngressPolicy {
    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressFrom ingressFrom;
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressTo ingressTo;

    @CustomType.Constructor
    private ServicePerimetersServicePerimeterSpecIngressPolicy(
        @CustomType.Parameter("ingressFrom") @Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressFrom ingressFrom,
        @CustomType.Parameter("ingressTo") @Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressTo ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimetersServicePerimeterSpecIngressPolicyIngressFrom> getIngressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimetersServicePerimeterSpecIngressPolicyIngressTo> getIngressTo() {
        return Optional.ofNullable(this.ingressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecIngressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressFrom ingressFrom;
        private @Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressTo ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecIngressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressFrom ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }
        public Builder ingressTo(@Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressTo ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }        public ServicePerimetersServicePerimeterSpecIngressPolicy build() {
            return new ServicePerimetersServicePerimeterSpecIngressPolicy(ingressFrom, ingressTo);
        }
    }
}
