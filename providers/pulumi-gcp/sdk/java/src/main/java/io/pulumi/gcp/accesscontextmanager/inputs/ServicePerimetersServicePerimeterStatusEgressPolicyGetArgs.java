// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
      private final @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom;

    public Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> getEgressFrom() {
        return this.egressFrom == null ? Codegen.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
      private final @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo;

    public Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> getEgressTo() {
        return this.egressTo == null ? Codegen.empty() : this.egressTo;
    }

    public ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs(
        @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom,
        @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs() {
        this.egressFrom = Codegen.empty();
        this.egressTo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom;
        private @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }
        public Builder egressFrom(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs egressFrom) {
            this.egressFrom = Codegen.ofNullable(egressFrom);
            return this;
        }
        public Builder egressTo(@Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }
        public Builder egressTo(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs egressTo) {
            this.egressTo = Codegen.ofNullable(egressTo);
            return this;
        }        public ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs(egressFrom, egressTo);
        }
    }
}
