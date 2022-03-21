// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The dead-letter queue for failed asynchronous invocations.
 * 
 */
public final class FunctionDeadLetterConfig extends io.pulumi.resources.InvokeArgs {

    public static final FunctionDeadLetterConfig Empty = new FunctionDeadLetterConfig();

    /**
     * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * 
     */
    @Import(name="targetArn")
      private final @Nullable String targetArn;

    public Optional<String> getTargetArn() {
        return this.targetArn == null ? Optional.empty() : Optional.ofNullable(this.targetArn);
    }

    public FunctionDeadLetterConfig(@Nullable String targetArn) {
        this.targetArn = targetArn;
    }

    private FunctionDeadLetterConfig() {
        this.targetArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionDeadLetterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionDeadLetterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = targetArn;
            return this;
        }        public FunctionDeadLetterConfig build() {
            return new FunctionDeadLetterConfig(targetArn);
        }
    }
}
