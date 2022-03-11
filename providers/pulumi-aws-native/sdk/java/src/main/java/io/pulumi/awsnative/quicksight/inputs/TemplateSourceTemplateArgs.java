// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * <p>The source template of the template.</p>
 * 
 */
public final class TemplateSourceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateSourceTemplateArgs Empty = new TemplateSourceTemplateArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    @InputImport(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    public TemplateSourceTemplateArgs(Output<String> arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private TemplateSourceTemplateArgs() {
        this.arn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSourceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public TemplateSourceTemplateArgs build() {
            return new TemplateSourceTemplateArgs(arn);
        }
    }
}
