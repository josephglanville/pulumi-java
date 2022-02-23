// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    /**
     * The Google service account ID. This be one of:
     * 
     */
    @InputImport(name="accountId", required=true)
      private final String accountId;

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * The ID of the project that the service account is present in.
     * Defaults to the provider project configuration.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAccountArgs(
        String accountId,
        @Nullable String project) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.project = project;
    }

    private GetAccountArgs() {
        this.accountId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.project = defaults.project;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAccountArgs build() {
            return new GetAccountArgs(accountId, project);
        }
    }
}
