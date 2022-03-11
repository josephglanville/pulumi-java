// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainRetentionPolicyArgs Empty = new DomainRetentionPolicyArgs();

    /**
     * The retention policy for data stored on an Amazon Elastic File System (EFS) volume. Default value is `Retain`.
     * 
     */
    @InputImport(name="homeEfsFileSystem")
      private final @Nullable Output<String> homeEfsFileSystem;

    public Output<String> getHomeEfsFileSystem() {
        return this.homeEfsFileSystem == null ? Output.empty() : this.homeEfsFileSystem;
    }

    public DomainRetentionPolicyArgs(@Nullable Output<String> homeEfsFileSystem) {
        this.homeEfsFileSystem = homeEfsFileSystem;
    }

    private DomainRetentionPolicyArgs() {
        this.homeEfsFileSystem = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> homeEfsFileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.homeEfsFileSystem = defaults.homeEfsFileSystem;
        }

        public Builder homeEfsFileSystem(@Nullable Output<String> homeEfsFileSystem) {
            this.homeEfsFileSystem = homeEfsFileSystem;
            return this;
        }

        public Builder homeEfsFileSystem(@Nullable String homeEfsFileSystem) {
            this.homeEfsFileSystem = Output.ofNullable(homeEfsFileSystem);
            return this;
        }
        public DomainRetentionPolicyArgs build() {
            return new DomainRetentionPolicyArgs(homeEfsFileSystem);
        }
    }
}
