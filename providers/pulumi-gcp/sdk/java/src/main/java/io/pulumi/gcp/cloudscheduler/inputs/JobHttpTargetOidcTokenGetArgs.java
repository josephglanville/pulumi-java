// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobHttpTargetOidcTokenGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobHttpTargetOidcTokenGetArgs Empty = new JobHttpTargetOidcTokenGetArgs();

    /**
     * Audience to be used when generating OIDC token. If not specified,
     * the URI specified in target will be used.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> getAudience() {
        return this.audience == null ? Output.empty() : this.audience;
    }

    /**
     * Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    @InputImport(name="serviceAccountEmail", required=true)
      private final Output<String> serviceAccountEmail;

    public Output<String> getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public JobHttpTargetOidcTokenGetArgs(
        @Nullable Output<String> audience,
        Output<String> serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private JobHttpTargetOidcTokenGetArgs() {
        this.audience = Output.empty();
        this.serviceAccountEmail = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTargetOidcTokenGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audience;
        private Output<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTargetOidcTokenGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Output.ofNullable(audience);
            return this;
        }

        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Output.of(Objects.requireNonNull(serviceAccountEmail));
            return this;
        }
        public JobHttpTargetOidcTokenGetArgs build() {
            return new JobHttpTargetOidcTokenGetArgs(audience, serviceAccountEmail);
        }
    }
}
