// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetImagePipelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImagePipelineArgs Empty = new GetImagePipelineArgs();

    /**
     * The Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetImagePipelineArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetImagePipelineArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetImagePipelineArgs build() {
            return new GetImagePipelineArgs(arn);
        }
    }
}
