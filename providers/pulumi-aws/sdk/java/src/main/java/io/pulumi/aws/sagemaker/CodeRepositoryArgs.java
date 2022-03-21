// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CodeRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeRepositoryArgs Empty = new CodeRepositoryArgs();

    /**
     * The name of the Code Repository (must be unique).
     * 
     */
    @Import(name="codeRepositoryName", required=true)
      private final Output<String> codeRepositoryName;

    public Output<String> getCodeRepositoryName() {
        return this.codeRepositoryName;
    }

    /**
     * Specifies details about the repository. see Git Config details below.
     * 
     */
    @Import(name="gitConfig", required=true)
      private final Output<CodeRepositoryGitConfigArgs> gitConfig;

    public Output<CodeRepositoryGitConfigArgs> getGitConfig() {
        return this.gitConfig;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CodeRepositoryArgs(
        Output<String> codeRepositoryName,
        Output<CodeRepositoryGitConfigArgs> gitConfig,
        @Nullable Output<Map<String,String>> tags) {
        this.codeRepositoryName = Objects.requireNonNull(codeRepositoryName, "expected parameter 'codeRepositoryName' to be non-null");
        this.gitConfig = Objects.requireNonNull(gitConfig, "expected parameter 'gitConfig' to be non-null");
        this.tags = tags;
    }

    private CodeRepositoryArgs() {
        this.codeRepositoryName = Output.empty();
        this.gitConfig = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> codeRepositoryName;
        private Output<CodeRepositoryGitConfigArgs> gitConfig;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeRepositoryName = defaults.codeRepositoryName;
    	      this.gitConfig = defaults.gitConfig;
    	      this.tags = defaults.tags;
        }

        public Builder codeRepositoryName(Output<String> codeRepositoryName) {
            this.codeRepositoryName = Objects.requireNonNull(codeRepositoryName);
            return this;
        }
        public Builder codeRepositoryName(String codeRepositoryName) {
            this.codeRepositoryName = Output.of(Objects.requireNonNull(codeRepositoryName));
            return this;
        }
        public Builder gitConfig(Output<CodeRepositoryGitConfigArgs> gitConfig) {
            this.gitConfig = Objects.requireNonNull(gitConfig);
            return this;
        }
        public Builder gitConfig(CodeRepositoryGitConfigArgs gitConfig) {
            this.gitConfig = Output.of(Objects.requireNonNull(gitConfig));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public CodeRepositoryArgs build() {
            return new CodeRepositoryArgs(codeRepositoryName, gitConfig, tags);
        }
    }
}
