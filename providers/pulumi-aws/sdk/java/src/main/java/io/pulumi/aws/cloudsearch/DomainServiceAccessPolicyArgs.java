// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainServiceAccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainServiceAccessPolicyArgs Empty = new DomainServiceAccessPolicyArgs();

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @Import(name="accessPolicy", required=true)
      private final Output<String> accessPolicy;

    public Output<String> getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    public DomainServiceAccessPolicyArgs(
        Output<String> accessPolicy,
        Output<String> domainName) {
        this.accessPolicy = Objects.requireNonNull(accessPolicy, "expected parameter 'accessPolicy' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private DomainServiceAccessPolicyArgs() {
        this.accessPolicy = Output.empty();
        this.domainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessPolicy;
        private Output<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.domainName = defaults.domainName;
        }

        public Builder accessPolicy(Output<String> accessPolicy) {
            this.accessPolicy = Objects.requireNonNull(accessPolicy);
            return this;
        }
        public Builder accessPolicy(String accessPolicy) {
            this.accessPolicy = Output.of(Objects.requireNonNull(accessPolicy));
            return this;
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }        public DomainServiceAccessPolicyArgs build() {
            return new DomainServiceAccessPolicyArgs(accessPolicy, domainName);
        }
    }
}