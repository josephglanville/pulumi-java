// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RGitHubPackageResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final RGitHubPackageResponseResponse Empty = new RGitHubPackageResponseResponse();

    /**
     * Repository address in the format username/repo[/subdir][@ref|#pull].
     * 
     */
    @InputImport(name="repository")
      private final @Nullable String repository;

    public Optional<String> getRepository() {
        return this.repository == null ? Optional.empty() : Optional.ofNullable(this.repository);
    }

    public RGitHubPackageResponseResponse(@Nullable String repository) {
        this.repository = repository;
    }

    private RGitHubPackageResponseResponse() {
        this.repository = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RGitHubPackageResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RGitHubPackageResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }
        public RGitHubPackageResponseResponse build() {
            return new RGitHubPackageResponseResponse(repository);
        }
    }
}
