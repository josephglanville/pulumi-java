// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRepositoryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRepositoryArgs Empty = new GetRepositoryArgs();

    /**
     * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app). If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html.
     * 
     */
    @InputImport(name="repositoryName", required=true)
      private final String repositoryName;

    public String getRepositoryName() {
        return this.repositoryName;
    }

    public GetRepositoryArgs(String repositoryName) {
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private GetRepositoryArgs() {
        this.repositoryName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder setRepositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public GetRepositoryArgs build() {
            return new GetRepositoryArgs(repositoryName);
        }
    }
}
