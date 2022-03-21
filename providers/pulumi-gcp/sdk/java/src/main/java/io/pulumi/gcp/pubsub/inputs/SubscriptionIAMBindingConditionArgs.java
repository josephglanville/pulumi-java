// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionIAMBindingConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionIAMBindingConditionArgs Empty = new SubscriptionIAMBindingConditionArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> getExpression() {
        return this.expression;
    }

    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    public SubscriptionIAMBindingConditionArgs(
        @Nullable Output<String> description,
        Output<String> expression,
        Output<String> title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private SubscriptionIAMBindingConditionArgs() {
        this.description = Output.empty();
        this.expression = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionIAMBindingConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> expression;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionIAMBindingConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder expression(Output<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Output.of(Objects.requireNonNull(expression));
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public SubscriptionIAMBindingConditionArgs build() {
            return new SubscriptionIAMBindingConditionArgs(description, expression, title);
        }
    }
}
