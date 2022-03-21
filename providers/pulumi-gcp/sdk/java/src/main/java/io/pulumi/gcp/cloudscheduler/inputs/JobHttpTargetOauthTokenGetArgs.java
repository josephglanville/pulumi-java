// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobHttpTargetOauthTokenGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobHttpTargetOauthTokenGetArgs Empty = new JobHttpTargetOauthTokenGetArgs();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified,
     * "https://www.googleapis.com/auth/cloud-platform" will be used.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    /**
     * Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
      private final Output<String> serviceAccountEmail;

    public Output<String> getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public JobHttpTargetOauthTokenGetArgs(
        @Nullable Output<String> scope,
        Output<String> serviceAccountEmail) {
        this.scope = scope;
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private JobHttpTargetOauthTokenGetArgs() {
        this.scope = Output.empty();
        this.serviceAccountEmail = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTargetOauthTokenGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> scope;
        private Output<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTargetOauthTokenGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Output.of(Objects.requireNonNull(serviceAccountEmail));
            return this;
        }        public JobHttpTargetOauthTokenGetArgs build() {
            return new JobHttpTargetOauthTokenGetArgs(scope, serviceAccountEmail);
        }
    }
}
