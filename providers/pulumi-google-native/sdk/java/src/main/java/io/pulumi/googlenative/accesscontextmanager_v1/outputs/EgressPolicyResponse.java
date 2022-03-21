// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.EgressFromResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.EgressToResponse;
import java.util.Objects;

@CustomType
public final class EgressPolicyResponse {
    /**
     * Defines conditions on the source of a request causing this EgressPolicy to apply.
     * 
     */
    private final EgressFromResponse egressFrom;
    /**
     * Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply.
     * 
     */
    private final EgressToResponse egressTo;

    @CustomType.Constructor
    private EgressPolicyResponse(
        @CustomType.Parameter("egressFrom") EgressFromResponse egressFrom,
        @CustomType.Parameter("egressTo") EgressToResponse egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    /**
     * Defines conditions on the source of a request causing this EgressPolicy to apply.
     * 
    */
    public EgressFromResponse getEgressFrom() {
        return this.egressFrom;
    }
    /**
     * Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply.
     * 
    */
    public EgressToResponse getEgressTo() {
        return this.egressTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EgressFromResponse egressFrom;
        private EgressToResponse egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(EgressFromResponse egressFrom) {
            this.egressFrom = Objects.requireNonNull(egressFrom);
            return this;
        }
        public Builder egressTo(EgressToResponse egressTo) {
            this.egressTo = Objects.requireNonNull(egressTo);
            return this;
        }        public EgressPolicyResponse build() {
            return new EgressPolicyResponse(egressFrom, egressTo);
        }
    }
}
