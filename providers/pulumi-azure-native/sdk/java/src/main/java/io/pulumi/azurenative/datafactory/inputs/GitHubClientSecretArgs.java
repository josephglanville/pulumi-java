// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Client secret information for factory's bring your own app repository configuration.
 * 
 */
public final class GitHubClientSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitHubClientSecretArgs Empty = new GitHubClientSecretArgs();

    /**
     * Bring your own app client secret AKV URL.
     * 
     */
    @Import(name="byoaSecretAkvUrl")
      private final @Nullable Output<String> byoaSecretAkvUrl;

    public Output<String> getByoaSecretAkvUrl() {
        return this.byoaSecretAkvUrl == null ? Output.empty() : this.byoaSecretAkvUrl;
    }

    /**
     * Bring your own app client secret name in AKV.
     * 
     */
    @Import(name="byoaSecretName")
      private final @Nullable Output<String> byoaSecretName;

    public Output<String> getByoaSecretName() {
        return this.byoaSecretName == null ? Output.empty() : this.byoaSecretName;
    }

    public GitHubClientSecretArgs(
        @Nullable Output<String> byoaSecretAkvUrl,
        @Nullable Output<String> byoaSecretName) {
        this.byoaSecretAkvUrl = byoaSecretAkvUrl;
        this.byoaSecretName = byoaSecretName;
    }

    private GitHubClientSecretArgs() {
        this.byoaSecretAkvUrl = Output.empty();
        this.byoaSecretName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubClientSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> byoaSecretAkvUrl;
        private @Nullable Output<String> byoaSecretName;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubClientSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byoaSecretAkvUrl = defaults.byoaSecretAkvUrl;
    	      this.byoaSecretName = defaults.byoaSecretName;
        }

        public Builder byoaSecretAkvUrl(@Nullable Output<String> byoaSecretAkvUrl) {
            this.byoaSecretAkvUrl = byoaSecretAkvUrl;
            return this;
        }
        public Builder byoaSecretAkvUrl(@Nullable String byoaSecretAkvUrl) {
            this.byoaSecretAkvUrl = Output.ofNullable(byoaSecretAkvUrl);
            return this;
        }
        public Builder byoaSecretName(@Nullable Output<String> byoaSecretName) {
            this.byoaSecretName = byoaSecretName;
            return this;
        }
        public Builder byoaSecretName(@Nullable String byoaSecretName) {
            this.byoaSecretName = Output.ofNullable(byoaSecretName);
            return this;
        }        public GitHubClientSecretArgs build() {
            return new GitHubClientSecretArgs(byoaSecretAkvUrl, byoaSecretName);
        }
    }
}
