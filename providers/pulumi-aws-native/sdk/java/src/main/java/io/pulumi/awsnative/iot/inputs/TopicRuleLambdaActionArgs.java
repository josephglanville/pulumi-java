// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleLambdaActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleLambdaActionArgs Empty = new TopicRuleLambdaActionArgs();

    @InputImport(name="functionArn")
      private final @Nullable Input<String> functionArn;

    public Input<String> getFunctionArn() {
        return this.functionArn == null ? Input.empty() : this.functionArn;
    }

    public TopicRuleLambdaActionArgs(@Nullable Input<String> functionArn) {
        this.functionArn = functionArn;
    }

    private TopicRuleLambdaActionArgs() {
        this.functionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleLambdaActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleLambdaActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
        }

        public Builder setFunctionArn(@Nullable Input<String> functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        public Builder setFunctionArn(@Nullable String functionArn) {
            this.functionArn = Input.ofNullable(functionArn);
            return this;
        }
        public TopicRuleLambdaActionArgs build() {
            return new TopicRuleLambdaActionArgs(functionArn);
        }
    }
}
