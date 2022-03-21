// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.aws.eks.outputs.GetClusterIdentityOidc;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterIdentity {
    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
     * 
     */
    private final List<GetClusterIdentityOidc> oidcs;

    @CustomType.Constructor
    private GetClusterIdentity(@CustomType.Parameter("oidcs") List<GetClusterIdentityOidc> oidcs) {
        this.oidcs = oidcs;
    }

    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
     * 
    */
    public List<GetClusterIdentityOidc> getOidcs() {
        return this.oidcs;
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
