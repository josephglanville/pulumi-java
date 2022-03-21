// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.GetClusterIdentityOidc;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetClusterIdentity extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterIdentity Empty = new GetClusterIdentity();

    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
     * 
     */
    @Import(name="oidcs", required=true)
      private final List<GetClusterIdentityOidc> oidcs;

    public List<GetClusterIdentityOidc> getOidcs() {
        return this.oidcs;
    }

    public GetClusterIdentity(List<GetClusterIdentityOidc> oidcs) {
        this.oidcs = Objects.requireNonNull(oidcs, "expected parameter 'oidcs' to be non-null");
    }

    private GetClusterIdentity() {
        this.oidcs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterIdentityOidc> oidcs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oidcs = defaults.oidcs;
        }

        public Builder oidcs(List<GetClusterIdentityOidc> oidcs) {
            this.oidcs = Objects.requireNonNull(oidcs);
            return this;
        }
        public Builder oidcs(GetClusterIdentityOidc... oidcs) {
            return oidcs(List.of(oidcs));
        }        public GetClusterIdentity build() {
            return new GetClusterIdentity(oidcs);
        }
    }
}
