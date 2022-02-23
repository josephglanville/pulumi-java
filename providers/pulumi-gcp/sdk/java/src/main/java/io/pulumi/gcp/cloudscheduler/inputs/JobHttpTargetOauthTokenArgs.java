// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobHttpTargetOauthTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobHttpTargetOauthTokenArgs Empty = new JobHttpTargetOauthTokenArgs();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified,
     * "https://www.googleapis.com/auth/cloud-platform" will be used.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
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

    public JobHttpTargetOauthTokenArgs(
        @Nullable Input<String> scope,
        Input<String> serviceAccountEmail) {
        this.scope = scope;
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private JobHttpTargetOauthTokenArgs() {
        this.scope = Input.empty();
        this.serviceAccountEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTargetOauthTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> scope;
        private Input<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTargetOauthTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
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
        public JobHttpTargetOauthTokenArgs build() {
            return new JobHttpTargetOauthTokenArgs(scope, serviceAccountEmail);
        }
    }
}
