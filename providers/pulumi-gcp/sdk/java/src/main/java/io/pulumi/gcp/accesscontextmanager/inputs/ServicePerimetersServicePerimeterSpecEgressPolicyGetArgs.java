// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
      private final @Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;

    public Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> getEgressFrom() {
        return this.egressFrom == null ? Output.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
      private final @Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

    public Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> getEgressTo() {
        return this.egressTo == null ? Output.empty() : this.egressTo;
    }

    public ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs(
        @Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom,
        @Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs() {
        this.egressFrom = Output.empty();
        this.egressTo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;
        private @Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }
        public Builder egressFrom(@Nullable ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs egressFrom) {
            this.egressFrom = Output.ofNullable(egressFrom);
            return this;
        }
        public Builder egressTo(@Nullable Output<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }
        public Builder egressTo(@Nullable ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs egressTo) {
            this.egressTo = Output.ofNullable(egressTo);
            return this;
        }        public ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs(egressFrom, egressTo);
        }
    }
}
