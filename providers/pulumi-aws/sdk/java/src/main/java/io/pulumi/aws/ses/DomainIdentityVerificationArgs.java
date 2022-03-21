// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainIdentityVerificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainIdentityVerificationArgs Empty = new DomainIdentityVerificationArgs();

    /**
     * The domain name of the SES domain identity to verify.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> getDomain() {
        return this.domain;
    }

    public DomainIdentityVerificationArgs(Output<String> domain) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private DomainIdentityVerificationArgs() {
        this.domain = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainIdentityVerificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainIdentityVerificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }        public DomainIdentityVerificationArgs build() {
            return new DomainIdentityVerificationArgs(domain);
        }
    }
}
