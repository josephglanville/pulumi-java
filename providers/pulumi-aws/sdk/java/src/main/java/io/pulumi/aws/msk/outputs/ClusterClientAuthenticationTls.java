// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClientAuthenticationTls {
    /**
     * List of ACM Certificate Authority Amazon Resource Names (ARNs).
     * 
     */
    private final @Nullable List<String> certificateAuthorityArns;

    @OutputCustomType.Constructor
    private ClusterClientAuthenticationTls(@OutputCustomType.Parameter("certificateAuthorityArns") @Nullable List<String> certificateAuthorityArns) {
        this.certificateAuthorityArns = certificateAuthorityArns;
    }

    /**
     * List of ACM Certificate Authority Amazon Resource Names (ARNs).
     * 
    */
    public List<String> getCertificateAuthorityArns() {
        return this.certificateAuthorityArns == null ? List.of() : this.certificateAuthorityArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> certificateAuthorityArns;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthenticationTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArns = defaults.certificateAuthorityArns;
        }

        public Builder setCertificateAuthorityArns(@Nullable List<String> certificateAuthorityArns) {
            this.certificateAuthorityArns = certificateAuthorityArns;
            return this;
        }
        public ClusterClientAuthenticationTls build() {
            return new ClusterClientAuthenticationTls(certificateAuthorityArns);
        }
    }
}
