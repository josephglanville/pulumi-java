// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="egressFrom")
      private final @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;

    public Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressTo")
      private final @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

    public Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs(
        @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressFrom(@Nullable ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromGetArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder setEgressTo(@Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder setEgressTo(@Nullable ServicePerimetersServicePerimeterSpecEgressPolicyEgressToGetArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }
        public ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterSpecEgressPolicyGetArgs(egressFrom, egressTo);
        }
    }
}
