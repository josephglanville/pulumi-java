// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentZipArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentZipArgs Empty = new FlexibleAppVersionDeploymentZipArgs();

    /**
     * files count
     * 
     */
    @Import(name="filesCount")
      private final @Nullable Output<Integer> filesCount;

    public Output<Integer> getFilesCount() {
        return this.filesCount == null ? Output.empty() : this.filesCount;
    }

    /**
     * Source URL
     * 
     */
    @Import(name="sourceUrl", required=true)
      private final Output<String> sourceUrl;

    public Output<String> getSourceUrl() {
        return this.sourceUrl;
    }

    public FlexibleAppVersionDeploymentZipArgs(
        @Nullable Output<Integer> filesCount,
        Output<String> sourceUrl) {
        this.filesCount = filesCount;
        this.sourceUrl = Objects.requireNonNull(sourceUrl, "expected parameter 'sourceUrl' to be non-null");
    }

    private FlexibleAppVersionDeploymentZipArgs() {
        this.filesCount = Output.empty();
        this.sourceUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentZipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> filesCount;
        private Output<String> sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentZipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder filesCount(@Nullable Output<Integer> filesCount) {
            this.filesCount = filesCount;
            return this;
        }
        public Builder filesCount(@Nullable Integer filesCount) {
            this.filesCount = Output.ofNullable(filesCount);
            return this;
        }
        public Builder sourceUrl(Output<String> sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = Output.of(Objects.requireNonNull(sourceUrl));
            return this;
        }        public FlexibleAppVersionDeploymentZipArgs build() {
            return new FlexibleAppVersionDeploymentZipArgs(filesCount, sourceUrl);
        }
    }
}
