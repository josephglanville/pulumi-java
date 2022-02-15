// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSslPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSslPolicyArgs Empty = new GetSslPolicyArgs();

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="sslPolicy", required=true)
    private final String sslPolicy;

    public String getSslPolicy() {
        return this.sslPolicy;
    }

    public GetSslPolicyArgs(
        @Nullable String project,
        String sslPolicy) {
        this.project = project;
        this.sslPolicy = Objects.requireNonNull(sslPolicy, "expected parameter 'sslPolicy' to be non-null");
    }

    private GetSslPolicyArgs() {
        this.project = null;
        this.sslPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSslPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }

        public GetSslPolicyArgs build() {
            return new GetSslPolicyArgs(project, sslPolicy);
        }
    }
}