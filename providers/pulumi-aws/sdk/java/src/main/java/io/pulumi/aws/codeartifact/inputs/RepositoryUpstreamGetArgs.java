// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RepositoryUpstreamGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryUpstreamGetArgs Empty = new RepositoryUpstreamGetArgs();

    /**
     * The name of an upstream repository.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }

    public RepositoryUpstreamGetArgs(Output<String> repositoryName) {
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private RepositoryUpstreamGetArgs() {
        this.repositoryName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryUpstreamGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryUpstreamGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }        public RepositoryUpstreamGetArgs build() {
            return new RepositoryUpstreamGetArgs(repositoryName);
        }
    }
}
