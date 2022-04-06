// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final DomainPolicyState Empty = new DomainPolicyState();

    /**
     * IAM policy document specifying the access policies for the domain
     * 
     */
    @Import(name="accessPolicies")
      private final @Nullable Output<String> accessPolicies;

    public Output<String> getAccessPolicies() {
        return this.accessPolicies == null ? Output.empty() : this.accessPolicies;
    }

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    public DomainPolicyState(
        @Nullable Output<String> accessPolicies,
        @Nullable Output<String> domainName) {
        this.accessPolicies = accessPolicies;
        this.domainName = domainName;
    }

    private DomainPolicyState() {
        this.accessPolicies = Output.empty();
        this.domainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessPolicies;
        private @Nullable Output<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.domainName = defaults.domainName;
        }

        public Builder accessPolicies(@Nullable Output<String> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }        public DomainPolicyState build() {
            return new DomainPolicyState(accessPolicies, domainName);
        }
    }
}