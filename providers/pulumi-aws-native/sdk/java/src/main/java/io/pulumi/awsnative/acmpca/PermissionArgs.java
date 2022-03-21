// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionArgs Empty = new PermissionArgs();

    /**
     * The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
     * 
     */
    @Import(name="actions", required=true)
      private final Output<List<String>> actions;

    public Output<List<String>> getActions() {
        return this.actions;
    }

    /**
     * The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
      private final Output<String> certificateAuthorityArn;

    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
     * 
     */
    @Import(name="principal", required=true)
      private final Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal;
    }

    /**
     * The ID of the calling account.
     * 
     */
    @Import(name="sourceAccount")
      private final @Nullable Output<String> sourceAccount;

    public Output<String> getSourceAccount() {
        return this.sourceAccount == null ? Output.empty() : this.sourceAccount;
    }

    public PermissionArgs(
        Output<List<String>> actions,
        Output<String> certificateAuthorityArn,
        Output<String> principal,
        @Nullable Output<String> sourceAccount) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
        this.sourceAccount = sourceAccount;
    }

    private PermissionArgs() {
        this.actions = Output.empty();
        this.certificateAuthorityArn = Output.empty();
        this.principal = Output.empty();
        this.sourceAccount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> actions;
        private Output<String> certificateAuthorityArn;
        private Output<String> principal;
        private @Nullable Output<String> sourceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.principal = defaults.principal;
    	      this.sourceAccount = defaults.sourceAccount;
        }

        public Builder actions(Output<List<String>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<String> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder certificateAuthorityArn(Output<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Output.of(Objects.requireNonNull(certificateAuthorityArn));
            return this;
        }
        public Builder principal(Output<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Output.of(Objects.requireNonNull(principal));
            return this;
        }
        public Builder sourceAccount(@Nullable Output<String> sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }
        public Builder sourceAccount(@Nullable String sourceAccount) {
            this.sourceAccount = Output.ofNullable(sourceAccount);
            return this;
        }        public PermissionArgs build() {
            return new PermissionArgs(actions, certificateAuthorityArn, principal, sourceAccount);
        }
    }
}
