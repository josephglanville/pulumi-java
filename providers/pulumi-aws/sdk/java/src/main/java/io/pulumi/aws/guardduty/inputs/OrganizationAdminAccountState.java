// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationAdminAccountState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationAdminAccountState Empty = new OrganizationAdminAccountState();

    /**
     * AWS account identifier to designate as a delegated administrator for GuardDuty.
     * 
     */
    @Import(name="adminAccountId")
      private final @Nullable Output<String> adminAccountId;

    public Output<String> getAdminAccountId() {
        return this.adminAccountId == null ? Codegen.empty() : this.adminAccountId;
    }

    public OrganizationAdminAccountState(@Nullable Output<String> adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    private OrganizationAdminAccountState() {
        this.adminAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationAdminAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> adminAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationAdminAccountState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminAccountId = defaults.adminAccountId;
        }

        public Builder adminAccountId(@Nullable Output<String> adminAccountId) {
            this.adminAccountId = adminAccountId;
            return this;
        }
        public Builder adminAccountId(@Nullable String adminAccountId) {
            this.adminAccountId = Codegen.ofNullable(adminAccountId);
            return this;
        }        public OrganizationAdminAccountState build() {
            return new OrganizationAdminAccountState(adminAccountId);
        }
    }
}
