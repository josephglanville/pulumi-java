// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobHttpTargetOidcTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobHttpTargetOidcTokenArgs Empty = new JobHttpTargetOidcTokenArgs();

    /**
     * Audience to be used when generating OIDC token. If not specified,
     * the URI specified in target will be used.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    @InputImport(name="serviceAccountEmail", required=true)
      private final Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public JobHttpTargetOidcTokenArgs(
        @Nullable Input<String> audience,
        Input<String> serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private JobHttpTargetOidcTokenArgs() {
        this.audience = Input.empty();
        this.serviceAccountEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTargetOidcTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audience;
        private Input<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTargetOidcTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setAudience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder setServiceAccountEmail(Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Input.of(Objects.requireNonNull(serviceAccountEmail));
            return this;
        }
        public JobHttpTargetOidcTokenArgs build() {
            return new JobHttpTargetOidcTokenArgs(audience, serviceAccountEmail);
        }
    }
}
