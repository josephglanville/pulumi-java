// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetMetadataArgs Empty = new DatasetMetadataArgs();

    /**
     * Arn of the source of the dataset. For e.g.: AppFlow Flow ARN.
     * 
     */
    @Import(name="sourceArn")
      private final @Nullable Output<String> sourceArn;

    public Output<String> getSourceArn() {
        return this.sourceArn == null ? Codegen.empty() : this.sourceArn;
    }

    public DatasetMetadataArgs(@Nullable Output<String> sourceArn) {
        this.sourceArn = sourceArn;
    }

    private DatasetMetadataArgs() {
        this.sourceArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder sourceArn(@Nullable Output<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public Builder sourceArn(@Nullable String sourceArn) {
            this.sourceArn = Codegen.ofNullable(sourceArn);
            return this;
        }        public DatasetMetadataArgs build() {
            return new DatasetMetadataArgs(sourceArn);
        }
    }
}
