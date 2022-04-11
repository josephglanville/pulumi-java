// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VpcIpamOrganizationAdminAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamOrganizationAdminAccountArgs Empty = new VpcIpamOrganizationAdminAccountArgs();

    @Import(name="delegatedAdminAccountId", required=true)
      private final Output<String> delegatedAdminAccountId;

    public Output<String> getDelegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }

    public VpcIpamOrganizationAdminAccountArgs(Output<String> delegatedAdminAccountId) {
        this.delegatedAdminAccountId = Objects.requireNonNull(delegatedAdminAccountId, "expected parameter 'delegatedAdminAccountId' to be non-null");
    }

    private VpcIpamOrganizationAdminAccountArgs() {
        this.delegatedAdminAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamOrganizationAdminAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> delegatedAdminAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamOrganizationAdminAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegatedAdminAccountId = defaults.delegatedAdminAccountId;
        }

        public Builder delegatedAdminAccountId(Output<String> delegatedAdminAccountId) {
            this.delegatedAdminAccountId = Objects.requireNonNull(delegatedAdminAccountId);
            return this;
        }
        public Builder delegatedAdminAccountId(String delegatedAdminAccountId) {
            this.delegatedAdminAccountId = Output.of(Objects.requireNonNull(delegatedAdminAccountId));
            return this;
        }        public VpcIpamOrganizationAdminAccountArgs build() {
            return new VpcIpamOrganizationAdminAccountArgs(delegatedAdminAccountId);
        }
    }
}
