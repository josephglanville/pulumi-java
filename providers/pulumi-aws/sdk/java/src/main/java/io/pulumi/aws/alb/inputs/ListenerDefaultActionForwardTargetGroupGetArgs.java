// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardTargetGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardTargetGroupGetArgs Empty = new ListenerDefaultActionForwardTargetGroupGetArgs();

    /**
     * ARN of the target group.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * Weight. The range is 0 to 999.
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public ListenerDefaultActionForwardTargetGroupGetArgs(
        Output<String> arn,
        @Nullable Output<Integer> weight) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.weight = weight;
    }

    private ListenerDefaultActionForwardTargetGroupGetArgs() {
        this.arn = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardTargetGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardTargetGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public ListenerDefaultActionForwardTargetGroupGetArgs build() {
            return new ListenerDefaultActionForwardTargetGroupGetArgs(arn, weight);
        }
    }
}
