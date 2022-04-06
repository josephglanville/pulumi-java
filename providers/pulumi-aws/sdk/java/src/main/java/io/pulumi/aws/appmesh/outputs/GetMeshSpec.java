// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GetMeshSpecEgressFilter;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMeshSpec {
    /**
     * The egress filter rules for the service mesh.
     * 
     */
    private final List<GetMeshSpecEgressFilter> egressFilters;

    @CustomType.Constructor
    private GetMeshSpec(@CustomType.Parameter("egressFilters") List<GetMeshSpecEgressFilter> egressFilters) {
        this.egressFilters = egressFilters;
    }

    /**
     * The egress filter rules for the service mesh.
     * 
    */
    public List<GetMeshSpecEgressFilter> getEgressFilters() {
        return this.egressFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetMeshSpecEgressFilter> egressFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFilters = defaults.egressFilters;
        }

        public Builder egressFilters(List<GetMeshSpecEgressFilter> egressFilters) {
            this.egressFilters = Objects.requireNonNull(egressFilters);
            return this;
        }
        public Builder egressFilters(GetMeshSpecEgressFilter... egressFilters) {
            return egressFilters(List.of(egressFilters));
        }        public GetMeshSpec build() {
            return new GetMeshSpec(egressFilters);
        }
    }
}